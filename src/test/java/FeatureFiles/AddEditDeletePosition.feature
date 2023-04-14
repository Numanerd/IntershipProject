Feature: Add Edit Delete Position

  Background:
    Given Navigate to Campus Page
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
      Given User should click on HumanResources on LeftNav
      When User should click on Setup
      And User should click on Position
      And click to Add Button
      Then New position
      And Search Locations
      And click to Edit Button Positions
      And click to Delete Button

