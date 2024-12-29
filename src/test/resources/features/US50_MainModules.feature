Feature:
  User Story :
  As a user, I should be accessing all the main modules of the app.
  Examples: Truck drivers, Store manager, Sales manager

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: As Store and Sales managers
    When user enters "Store and Sales managers" information
    Then user should be able to access "all the following modules"
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |