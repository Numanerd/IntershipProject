Feature: Add Edit Delete Position

  Background:
    Given Navigate to Campus Page
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Position
    Given User should click on HumanResources on LeftNav
    When User should click on Setup
    And User should click on Position
    And click to Add Button
    Then New position

  Scenario: Edit Position
    Given User should click on HumanResources on LeftNav
    When User should click on Setup
    And User should click on Position
    And click to Edit Button Positions

  Scenario: Delete Position
    Given User should click on HumanResources on LeftNav
    When User should click on Setup
    And User should click on Position
    And click to Delete Button

