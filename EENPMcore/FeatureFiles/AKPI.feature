Feature: Core EENPM login and KPI feature
 Scenario: KPI Creation
    
    Given user is on the login page
    When user enters correct "613687292" and user enters corret "Apeksha@1994"
    When user clicks on the Manage KPI button
    Then user should be able to enter KPI name and description
    When user clicks on the Configuration tab
    And user should be able to create a Formula
    When the formula is created succesfully user should be able to click on the save button
    Then user should be able to edit the KPI