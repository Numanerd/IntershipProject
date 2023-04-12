Feature: Add Edit Delete Position Categories

  Background:

    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website


    Scenario:
      Given User should click on HumanResources on LeftNav
      When  User should click on Setup
      And   User should click on Position Categories
      Then  User should click on Add button
      And   User should click on Edit button
      Then  User should click on Delete button

