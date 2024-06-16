Feature: Login into omayo Application

#Used for comments


Scenario Outline: User should only be login with vallid credential
Given I navigate into application URL
When I enter username as "<Someusername>" and password as "<Somepassword>"
And I click on the login button
Then I should be able to login based on "<Somexpectedresult>" login status
Examples:
|Someusername|Somepassword |Somexpectedresult
|Vaishnai    |Vaishnavi@123|Failure
|Dipali      |Dipali@123   |Failure
|Pooja       |Pooja@123    |Failure