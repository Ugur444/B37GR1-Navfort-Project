@AccountsFilter
Feature: US61TC01AC01 Users should be able to see 8 filter items on the Accounts page

  #Background: User is already in the accounts page

  @Wip
  Scenario Outline: Verify to see 8 filter items on the Accounts page
    Given the user logged in as "<userType>"
    When the user is on the accounts page
    Then the user clicked on the Manage filters button
    Then the user should see below options selected
      | Account Name  |
      | Contact Email |
      | Contact Name  |
      | Contact Phone |
      | Owner         |
      | Business Unit |
      | Created At    |
      | Updated At    |

    And the user should see these options are clickable

    Examples:
      | userType      |
      | sales manager |
      #| store manager |

