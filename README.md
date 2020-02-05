# ats-ui-test-automation


Test Scenario:
1. Open the  https://spec.atsspecsolutions.com/  URL  
2. Login to the site (username : dovini5510@one-mail.top , password : Ats123456 )
3. On the dashboard on "Start New Project" widget click on "New Project"
4. On "Create New Project" page insert the values on step 1 , 2, and 3
5. Click on Finish

Framework Details:
Tools
  1. Maven - Dependency Manager
  2. TestNG - Test Framework
  3. Selenium Web Driver - UI Automation

Framework Structure
   1. Design pattern - Page object Model
   2. Test Data - CSV file

   Folder Structure

       -src > data.providers -  Binders between Test data csv files and Test cases

       -src > pages          - Where all UI elements and UI actions implemented as a page object

       -src > tests          - Where all test cases orgnized

       -src > test-data      - Physical location of Test data csv file


Execution:
 Clone  git hub https://github.com/jojojose123/ats-ui-test-automation
 Run MVN test -bf pom.xml
 And 
   



