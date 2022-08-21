# Getting Started

### Installation

#### Eclipse IDE (No prior installation required)

This solution will use Eclipse IDE with Maven for building and running the application.
[Eclipse 2022-06](https://www.eclipse.org/downloads/)

1. Download the code for project GildedRose-Refactoring-Kata.

2. Open Eclipse and import the project as Maven Project. It can be imported as a simple Java Project but it will possibly require adding the source folders and the JUnit4 to the Build Path: see Trouble shoot).

   File -> Import -> Select an import wizard : Maven : Existing Maven Projects (Next) Browser the project and select the pom.xml (Finish)

3. Using the Eclipse IDE the project should be cleaned and built automatically.

4. In order to run there are two ways by main entry point and using the tests. 
   
   * The first is running the entry point main by selecting Menu Run -> Run as -> Java Application (The project needs to be selected and the unique entry point at TexttestFixture.java will be used). Also, it is possible to select Run configuration... instead of Run as. This way, it is possible to set an argument to the main, which for this application is the number of degrading days. For this approach, the console will show a list of items degrading per day (no argument means 1 day).
   
   * The second option is running the Tests. There are several tests following the main entry point example that would be an option to check the application behavior.

##### Trouble shoot

* Wrong Build Path or not selected

If the project doesn't build, maybe the Build Path is not set correctly. By Right Clicking Build Path option : Configure Build Path is possible to select the folders: /gilded-rose-kata/src/main/java and /gilded-rose-kata/src/test/java. The problem should be solved, if not, it is possible to clean the project using maven feature by Right click -> Maven -> Update project.

* JUnit not Find

Maven includes the package for running tests and the specification is on pom.xml. If the project is built correctly as a Maven Project JUnit classes should be imported. If not, as a quick fix option on one of the test files, it is possible to select and add Junit4 to the build path.

#### JAVA SDK (A prior JDK installed is required)

In the case there is a [Java SE Development Kit](https://www.oracle.com/ca-en/java/technologies/javase/javase8-archive-downloads.html) installed it is possible to use the pre-defined command mvnw or gradlew inside the project.

** All commands must be executer on the project root path : '.../GildedRose-Refactoring-Kata/'

##### Using Maven Wrapper ([mvnw](https://maven.apache.org/wrapper/))

* Giving permission to mvnw on Linux

		chmod +x mvnw

* May be required to use the key sudo with the prefix to run sh command when using Linux

		sudo ./mvnw
		
* Running the Tests (by executing this command the tests will run and show the results)
		
		mvnw clean test
	
* Running the Main application
	
1. Execute (where 10 is the number of days inside the application):

		mvnw compile exec:java -Dexec.mainClass="com.gildedrose.TexttestFixture" -Dexec.args="10"

##### using Gradle Wrapper ([gradlew](https://docs.gradle.org/current/userguide/gradle_wrapper.html))

* Giving permission to gradlew on Linux

		chmod +x gradlew

* May be required to use the key sudo with the prefix to run sh command when using Linux

		sudo ./gradlew

* Test  the Tests (by executing this command the tests will run and will generate a html for the results at '/build/reports/tests/test/index.html')
		
		gradlew clean test
	
* Running the Main application

1. Execute (where 10 is the number of days inside the application):

		gradlew clean run --args="10"
	
##### Trouble shoot

* JAVA_HOME not found in your environment (JAVA_HOME is not defined correctly)

Either Windows or Linux environment needs to set the JAVA_HOME: 

1. For windows environment: looking for "Edit the System environment variable" or going for System Properties at Control Panel (Advanced tab) is possible to add a new path variable called "JAVA_HOME" with the JDK folder path as the value. Adding '%JAVAHOME%\bin' to the path variable enables the use of java and javac commands.

2. For Linux environment it requires the change of a file (/etc/profile or /etc/profile.d/jdk_home.sh) by adding the lines:   

		export JAVA_HOME="path/to/JDK"
		export PATH=$PATH:$JAVA_HOME/bin	
**using only the first line would work at the terminal
	
   
Any Question, let me know!
