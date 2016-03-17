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
@tag
Feature: Authentication Service

  @tc1
  Scenario: Authentication with correct username and password
    Given User is on the homepage
    When User navigates to the login page
    And enters "ol-admin" as username
    And enters correct password
    And clicks Submit
    Then Login successful message is displayed

  @tc2
  Scenario: Authenticating with incorrect username and password
    Given: User is on the homepage
    When: User navigates to the login page

    And enters incorrect username and password, clicks Submit
    Then Authentication failed message is displayed

  #@tc3
  #Scenario: Authenticating with blank username and/or password
    #Given: User is on the homepage
    #When: User navigates to the login page
    
# And clicks Submit without entering any credentials for username and password
   # Then 'Please fill in this field' error tooltip should be displayed
