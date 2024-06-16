Feature: Register for an account in TutorialsNinja application 

@Register
Scenario:  Registeration with vallid credentials 
Given I navigate to the register page 
When I enter below details

|FirstName |Dipali                   |
|LastName  |Metkari                  |
|Emalid    |dipalimetkari04@gmail.com|
|Telephone |131413                   |
|Password  |Dipali@123               |

And I click on Privacy policy

