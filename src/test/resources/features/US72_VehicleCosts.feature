Feature: User wants to learn to use the pinbar

  US72TC01AC01

  @pinbar
  Scenario: Verify "Learn how to use this space" link brings user to instruction and user sees the instructions
    Given user is on the homepage
    When user clicks on the "Learn how to use this space" link
    Then user should see the header "How To Use Pinbar"
    And user should see the instruction text "Use pin icon on the right top corner of page to create fast access link in the pinbar."
    And user should see an image "/bundles/oronavigation/images/pinbar-location.jpg"
