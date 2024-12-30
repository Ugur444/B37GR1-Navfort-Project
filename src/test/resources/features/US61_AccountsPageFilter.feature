@AccountsFilter
Feature: US61TC01AC01 Users should be able to see 8 filter items on the Accounts page

  @Wip
  Scenario Outline: Verify to see 8 filter items on the Accounts page
    Given the user logged in as "<userType>"
    When the user is on the accounts page
    Then the user clicked on the Manage filters button
    Then the user should see below options displayed

      | Account Name  |
      | Contact Name  |
      | Contact Email |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |

    Examples:
      | userType      |
      | sales manager |
      | store manager |


