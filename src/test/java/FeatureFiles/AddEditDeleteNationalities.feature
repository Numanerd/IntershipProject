Feature: Add Edit Delete Nationalities

  Background:

    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website


  Scenario:Add Nationalities
    Given user clicks Setup on the LeftNav
    When  Click on Parameters
    Then  Click on Nationalities
    And   Click on Add Button

  Scenario:Edit Nationalities
    Given user clicks Setup on the LeftNav
    When  Click on Parameters
    Then  Click on Nationalities
    And   Click on Edit Button

  Scenario:Delete Nationalities
    Given user clicks Setup on the LeftNav
    When  Click on Parameters
    Then  Click on Nationalities
    And   Click on Delete Button









