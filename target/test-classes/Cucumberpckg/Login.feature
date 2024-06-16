Feature: Login into Tutorials Ninja application

@Ninja	
Scenario: Login to the application with vallid credentials
Given I navigate to the login page of the application
When  I enter the email address as "dipalimetkari184@gmail.com" and password as "Dipali@123" 
And  I click on  for login button  
Then I should successfully logged in into tutorialsNinja page
