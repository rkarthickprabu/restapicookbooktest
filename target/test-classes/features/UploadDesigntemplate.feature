Feature: Upload Design template

  
  Scenario: Uploading .OL-template
    Given on homepage
    When I click on Upload Design template
    And upload the template
    And Click Submit
    Then Template Managed File ID is displayed
