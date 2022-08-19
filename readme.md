# Getting Started

### Installation

#### Eclipse

This solution will use Eclipse IDE with Maven for building and running the application.
[Eclipse 2022-06](https://www.eclipse.org/downloads/)

1. Download the code for project GildedRose-Refactoring-Kata.

2. Open Eclipse and import the project as Maven Project. It can be imported as a simple Java Project but it will possibly require adding the source folders and the JUnit4 to the Build Path: see Trouble shoot).

   File -> Import -> Select an import wizard : Maven : Existing Maven Projects (Next) Browser the project and select the pom.xml (Finish)

3. Using the Eclipse IDE the project should be cleaned and built automatically.

4. In order to run there are two ways by main entry point and using the tests. 
   
   . The first is running the entry point main by selecting Menu Run -> Run as -> Java Application (The project needs to be selected and the unique entry point at TexttestFixture.java will be used). Also, it is possible to select Run configuration... instead of Run as. This way, it is possible to set an argument to the main, which for this application is the number of degrading days. For this approach, the console will show a list of items degrading per day (no argument means 1 day).
   
   . The second option is running the Tests. There are several tests following the main entry point example that would be an option to check the application behavior.

##### Trouble shoot

. Wrong Build Path or not selected

If the project doesn't build, maybe the Build Path is not set correctly. By Right Clicking Build Path option : Configure Build Path is possible to select the folders: /gilded-rose-kata/src/main/java and /gilded-rose-kata/src/test/java. The problem should be solved, if not, it is possible to clean the project using maven feature by Right click -> Maven -> Update project.

. JUnit not Find

Maven includes the package for running tests and the specification is on pom.xml. If the project is built correctly as a Maven Project JUnit classes should be imported. If not, as a quick fix option on one of the test files, it is possible to select and add Junit4 to the build path.

