Feature: All-In-One Service

  Scenario: Entering Datamapping, Content Creation, Job Creation and Output Creation IDs to create output
    Given At home
    When I click on All-in-One page
    And All the four checkbox options are checked
    And Managed File ID entered in their respective fields
    And Submit
    Then Output file is created
