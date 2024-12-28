Feature: User should be on the Vehicle Odometer Page

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario Outline: Verify user see error massage on the Vehicle Odometer
    Given the user logged in as "<userType>"
    When user go to do Fleet
    And user go to the Vehicle Odometer
    Then user should see error massage


  Examples:
    | userType     |
    | driver       |
    | sales manager|
    | store manager|