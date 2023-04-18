Feature: Bank Account Functionalities

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Bank Accounts


  Scenario: Create a Bank Account

    When Create Bank Account
    Then Success message should be displayed


  Scenario: Edit a Bank Account

    When Edit Bank Account
    Then Success message should be displayed


  Scenario: Delete a Bank Account

    When Delete Bank Account
    Then Success message should be displayed