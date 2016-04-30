#Author: Karthick
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
#@tag
Feature: Authentication Service

  @tc1
  Scenario Outline: Authentication with username and password
    Given Im on the homepage
    When I navigate to the login page
    And enter <username>
    And password <password>
    And click Submit
    Then Result for Login is displayed

    Examples: 
      | username | password |
      |          |          |
      | ol-admin | secrt    |
      | ol-admin | secret   |
	#And clicks Submit without entering any credentials for username and password
	#Then 'Please fill in this field' error tooltip should be displayed
