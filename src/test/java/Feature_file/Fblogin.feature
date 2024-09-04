Feature: Facebook Login

  Scenario: Verification of successful login when the inputs are correct
    Given User on the login page
    When User enters a valid email address or phone number
    And User enters a valid password
    Then User clicks the submit button and the user login should be successfull
