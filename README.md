# End to end flow of Orange HRM  
  After creating a new maven project, inside POM.xml file we add dependencies like Selenium dependency, Cucumber core, Cucumber java, Cucumber junit dependency.
  Inside src/main/java, we have different packages like baseLayer, configLayer, pageLayer, utilsLayer.  
  
  Here we use POM concept with PageFactory to maintain object repository inside pageLayer package, so we have created corresponding class for repective scenarios.
  We have classes like Loginpage, Homepage,PIMpage or Contactpage, we use @FindBy annotation to locate every element and initialize them.  
  

## Writing Tests  
  Tests are written in Gherkin syntax and stored in feature files. Feature files can be created in the src/test/resources/features directory or 
  here we are creating a folder AllFeatures.

Here's an example feature file that tests the checkout process:![Capture](https://user-images.githubusercontent.com/126603860/235282300-5d44c270-fb30-473e-8529-c5a1f6a45c1f.JPG)  

## Test Implementation  
The test implementation is done using Java and Cucumber-JVM. The step definitions should be created in the src/test/java/stepdefinitions directory.  

Here's an example step definition for the scenario above:  
![Capture](https://user-images.githubusercontent.com/126603860/235282470-71a05fcc-a8da-44f8-ae36-7610d7b811ff.JPG)


