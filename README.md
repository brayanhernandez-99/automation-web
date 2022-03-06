# INTRODUCTION
This is a repository of automated tests for the linio and utest website.

# PREREQUISITES 📋
• Java version 1.8 update 151 or higher and JDK (environment variables set).
• Eclipse IDE or IntelliJ IDEA (version 2018.3 or higher).
• Gradle version 6.8 or higher (environment variables configured).
• Cucumber for Java Plugin (updated version).
• Gherkin plugin (updated version).

# INSTALLATION ⚙️
•	To clone this repository locally, the following command must be run: "git clone https://github.com/brayanhernandez-99/automation-web.git"
•	Import the project from Eclipse or IntelliJ IDE under the structure of an existing Gradle project. 
•	Configure JRE System Library with JavaSE-1.8.

# PROJECT STRUCTURE 🚧
The project is based on the tests of booking website, in the repository we will find the automations and manual test in two diferent folders.
• Booking_Automation: Automation Tests
• Booking_Manual: Manual Tests
Within each project there is a folder structure under the design pattern ScreenPlay

# BUILDING 🛠
Automation was developed with:
•	BDD: Development strategy
•	Design pattern: Screenplay that applies SOLID principles
•	Gradle: Dependency manager
•	Cucumber: Framework to automate BDD tests
•	Serenity BDD: Framework, Open-source library for report generation
•	Gherkin - Business-readable domain specific language (DSL)

# VERSIONING 🔀
Git was used for version control, applying master Based Development methodology.

# COMMAND FOR EXECUTION ▶️
The project automated can be executed from the console with the following command: "gradle clean test aggregate -i --continue".
The manual test can be run from your development IDE where you right click the run folder and run.