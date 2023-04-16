Feature: Add Edit Delete Parameters Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario:
      When User clicks Setup on the LeftNav
      Then click on Parameters
      And Click on Fields
      Then Click on Search Button