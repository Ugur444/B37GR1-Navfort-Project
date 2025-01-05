Feature: User should be on the Vehicle Odometer Page

  Background: User is already in the log in page
    Given the user is on the login page

  @US60
  Scenario Outline: Verify user see error massage on the Vehicle Odometer
    Given the user logged in as "<userType>"
    When user go to do Fleet
    And user go to the Vehicle Odometer
    Then user should see "You do not have permission to perform this action." error massage

  Examples:
    | userType     |
    | sales manager|
    | store manager|


  Scenario: Verify that drivers see the default page 1
    Given the user logged in as "driver"
    When user go to do Fleet option
    And user go to the Vehicle Odometer option
    Then user sees Page 1 on the Vehicle Odometer





