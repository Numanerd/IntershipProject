Feature: Add Edit Delete Attestations

  Background:

    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website

    Scenario:

      Given User clicks Setup on the LeftNav
      When click on Parameters
      Then click on Discounts
      And  click on Add Button
      Then click on Edit Button
      Then click on Delete Button
