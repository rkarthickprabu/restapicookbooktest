Feature: Upload datamapper

  
  Scenario: Uploading .OL-datamapper
    Given on the homepage
    When I click on Upload datamapping config
    And upload the datamapping config
    And Click on Submit
    Then Datamapping Managed File ID is displayed
