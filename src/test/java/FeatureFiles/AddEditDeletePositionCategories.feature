Feature: Add Edit Delete Position Categories

  Background:

    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website


  Scenario: Add Position Categories
    Given User should click on HumanResources on LeftNav
    When  User should click on Setup
    And   User should click on Position Categories
    Then  User should click on Add button

  Scenario: Edit Position Categories
    Given User should click on HumanResources on LeftNav
    When  User should click on Setup
    And   User should click on Position Categories
    And   User should click on Edit button

  Scenario: Delete Position Categories
    Given User should click on HumanResources on LeftNav
    When  User should click on Setup
    And   User should click on Position Categories
    Then  User should click on Delete button

