# Trello-cucumber-web
Trello-cucumber-web#

How to Install
---------------
	1	Clone URL is
	2	Import the project to your IDE
	3	Run Maven Clean command
	4	If needed please force udpate the project

To Run (Prefer to use maven command)
--------------
	1	Run the below maven command # maven clean install
	2	Run the Runner file in src/test/java/runnderFile/RunnerFile.java
	3	Run individual features from src/test/java/features
	4	Run sample_suite.xml in suite directory

Automation Framework
----------------------
	1	Framework is written in java and selenium, Cucumber, junit and testNg
	2	Custom Cucumberwebbase and WebDriverBase classes
	3	EnvParameters will load the config. properties. What browser to execute can be configured there
	4	OSUtils is written to so that automation framework can dynamically pick up the drivers based on OS
	5	Logger Util
	6	WebObjectLocator class is written to load the xpaths from ObjectRepo/Webobject.properties
	7	All the Utilities are writtern in WebDriverBase
	8	drivers are part of drivers directory
	9	Followed PageObject model and each page has it is own step definition and PO class
	10	Before and After class methods are defined in Hooks and screenshots are provided in the screenshots folder

Excercise
--------------
	1	Feature is written to create user and user name is appended with random generated id. Sometimes test will fail due to the google CAPTHA
	2	Feature is written to use an existing user and create a dashboard. If the test is already run it wont be able to create a dashboard.
