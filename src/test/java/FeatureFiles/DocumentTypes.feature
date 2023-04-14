Feature: Document Types Functionality
  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    Scenario: Add, Edit and Delete Document Types
      And Navigate to Document Types page
      When Create a Document Types
      Then Success message should be displayed
      When Edit Document Types
      Then Success message should be displayed
      And Delete Document Types
      Then Success message should be displayed



