
Feature: User should see error messages when entered invalid integer into the Calendar repeat day input box.

  Scenario:US58TC01AC01 User selects "Calendar Events" from the "Activities" dropdown.
    Given user is on the Fleet Management Dashboard
    When user click on the "Activities" Dropdown
    Then the "Calendar Events" option should be visible
    Then user should click on the "Create Calendar Event" button.
    Given user should put a tick in the Repeat checkbox.
    And user should enter an invalid digit (less than 1) into the Repeat every field.
    Then user should see an error message (The value have not to be less than 1.)
    And user should enter an invalid digit (more than 99) into the Repeat every field.
    Then user should see an error message(The value have not to be more than 99.)