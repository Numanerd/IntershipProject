Feature: Bank Account Functionalities

  Scenario: Create, Edit and Delete Bank Accounts

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Navigate to Bank Accounts

    When Create Bank Account
    Then Success message should be displayed

    When Edit Bank Account
    Then Success message should be displayed

    When Delete Bank Account
    Then Success message should be displayed