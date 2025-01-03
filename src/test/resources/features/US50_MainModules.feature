Feature:
  User Story :
  As a user, I should be accessing all the main modules of the app.


  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: As Store and Sales managers
    Given the user logged in as "<userType>"
    Then user should be able to access all the following modules

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

    Examples:
      | userType      |
      | store manager |
      | sales manager |

  Scenario: As drivers
    Given the user logged in as "driver"
    Then user should be able to access four module names
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



