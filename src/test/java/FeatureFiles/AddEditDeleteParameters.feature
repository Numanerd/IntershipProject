Feature: Add Edit Delete Parameters Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Click Testing
      When User clicks Setup on the LeftNav
      Then click on Parameters
      And Click on Fields
      Then Click on Search Button
      Scenario: Add Fields
        Given Navigate to Field Page
        When Add new Field
        Then Success message should be displayed
        Scenario: Edit Fields
          Given Navigate to Field Page
          And Search for new Field
          When Edit new Field
          Then Success message should be displayed
          Scenario: Delete Fields
            Given Navigate to Field Page
            And Search for new Field
            When Delete new Field
            Then Success message should be displayed