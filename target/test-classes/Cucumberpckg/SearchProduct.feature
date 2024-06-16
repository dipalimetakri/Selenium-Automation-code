#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



Feature: Search of various product categories should be possible along with product search

 
 @dev
  Scenario: User should be able to search under books category
    Given I visit the website as a guest user
    When I select the books option from the search dropdown
    And I click on the search icon option
    Then I should see the page having heading as amazon best reads is getting displayed
    But I should not see the other category products
    
    @All
  Scenario: User should be able to search under baby category
    Given I visit the website as a guest user
    When I select the baby option from the search dropdown
    And I click on the search icon option
    Then I should see the page having heading as offers on baby product is getting displayed
    But I should not see the other category products
    

  
