Feature: Dashboard Creation and Manage
 Scenario: Dashboard Creation
    Given user is on the login page
    When user enters correct "613687292" and user enters corret "Apeksha@1994"
    When user clicks on admin settings and Create Dashboard
    Then user should enter Dashboard name 
    When user enters the Report Name 
    Then user should be able to add the requited reports to the Dashboard
    When the user clicks on Add another reports section
    Then user should be able to give Report Name 
    Then to add few more reports into another section and Create Dashboard
    Then User selects required access