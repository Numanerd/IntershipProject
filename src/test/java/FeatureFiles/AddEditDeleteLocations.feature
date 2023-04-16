Feature: Add Edit Delete Locations

  Background:
    Given Navigate to Campus Page
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
      When User clicks Setup on the LeftNav
      And Click on SchoolSetup
      And Click on Locations
      And click to Add Button
      Then new Locations
      And click to Edit Button
      And click to Delete Button



