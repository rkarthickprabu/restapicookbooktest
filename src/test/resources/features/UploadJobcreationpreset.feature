Feature: Upload Job Creation preset

  
  Scenario: Uploading .OL-jobpreset
    Given At homepage
    When I click on Upload a Job Creation preset
    And upload the JC preset
    And click on Submit button
    Then Managed File ID for JC is displayed
