Feature: Add Edit Delete Discounts

  Background:

    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website

  Scenario: Add Discounts

    Given User clicks Setup on the LeftNav
    When click on Parameters
    Then click on Discounts
    And  click on Add Button

  Scenario: Edit Discounts

    Given User clicks Setup on the LeftNav
    When click on Parameters
    Then click on Discounts
    And click on Edit Button

  Scenario:  Delete Discounts

    Given User clicks Setup on the LeftNav
    When click on Parameters
    Then click on Discounts
    And click on Delete Button

