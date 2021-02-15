# PHPTravels
UI test automation for PHPTravels 

### Installation (pre-requisites)
1. JDK 1.8 (make sure Java class path is set)
2. Maven

### Folder Structure

```sh
├── README.md
├── pom.xml
└── src
    └── test
        ├── java
        │   ├── pages
        │   └── stepDefinitions
        └── resources
            └── features
```
* src/test/resources/features - all the cucumber features files (files .feature ext) are present here.
* src/test/java/StepDefinitions - Step defintions are defined under this package for the feature steps.
* src/test/java/pages - For every UI page one class is created where all the locators and methods related to the page is present.
* pom.xml - All maven dependeciies are defined here

### Steps to execute tests:
1. Clone the repository
2. Run the command to execute entire suite : mvn test
3. To execute a specific tag: mvn test  -Dcucumber.filter.tags=“@tagName"  

### Reports:
After tests are executed reports will be generated under
target/cucumber-report-html

 
