Feature: Upload Output Creation preset

 
  Scenario: Uploading .OL-outputpreset
    Given homepage
    When I click on Upload a Output Creation preset
    And upload the OC preset
    And click on the Submit button
    Then Managed File ID for OC is displayed
