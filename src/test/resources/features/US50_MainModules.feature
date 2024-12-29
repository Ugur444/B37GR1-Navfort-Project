Feature:
  User Story :
  As a user, I should be accessing all the main modules of the app.
  Examples: Truck drivers, Store manager, Sales manager

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: As Store and Sales managers

    Given the user logged in as "Store manager"
    Then user should be able to access all the following modules

      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario: As drivers
    Given the user logged in as "driver"
    Then user should be able to access 4 module names
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |



