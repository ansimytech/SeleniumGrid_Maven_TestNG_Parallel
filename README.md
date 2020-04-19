# SeleniumGrid_Maven_TestNG_Parallel

The sample code is a Maven Project which covers Selenium Grid Parallel Execution of Tests via Maven and TestNg

## Getting Started

SeleniumGrid Parallel Execution of UI Tests using Maven and TestNG in Java. 
Web Application UI Automation across different browsers can be performed easily using tools like Selenium.

### Prerequisites

Familiar with Selenium Grid Architecture


### Components

*Selenium Standalone server - Hub 
*Selenium Standalone server - Node 
*Eclipse 
*Maven 
*TestNG


### Steps

*Clone the repo and Import the Maven Project in Eclipse Editor.

*Download the Server Server Standalone Jar Start the Selenium Server - Hub using the below command:
	Java -jar selenium-server-standalone-3.141.59.jar -role hub -hubConfig hubconfig.json 

*Start the Selenium Server - Register the node using the command: 
	Java -Dwebdriver.chrome.driver="chromedriver.exe" -Dwebdriver.ie.driver="IEDriverServer.exe" - Dwebdriver.gecko.driver="geckodriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -nodeConfig node1config.json 

*Build and execute the maven project


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
