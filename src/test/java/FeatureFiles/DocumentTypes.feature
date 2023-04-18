Feature: Document Types Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Add Document Types
    When Navigate to Document Types
    And Creat a Documnet Types
    Then Success message should be displayed


  Scenario: Edit Document Types
    When  Navigate to Document Types
    And Edit Document Types
    Then Success message should be displayed

  Scenario: Delete Document Types
    When Navigate to Document Types
    And Delete Document Types
    Then Success message should be displayed



