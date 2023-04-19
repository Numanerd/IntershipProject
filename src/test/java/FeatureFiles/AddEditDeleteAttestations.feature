Feature: Add Edit Delete Attestations

  Background:
    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website

  Scenario: Add Attestations
    Given User should click on HumanResources
    When User should click on Setup value
    And User should click on Attestations
    Then User should click on Add button to Add

  Scenario: Edit Attestations
    Given User should click on HumanResources
    When User should click on Setup value
    And User should click on Attestations
    Then User should click on Edit button to Edit

  Scenario: Delete Attestations
    Given User should click on HumanResources
    When  User should click on Setup value
    And   User should click on Attestations
    Then  User should click on Delete button to Delete