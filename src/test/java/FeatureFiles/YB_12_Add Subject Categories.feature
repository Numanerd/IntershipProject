Feature: Add Edit and Delete Attestations

  Background:
    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website

    Scenario: Add Subject Categories,
      And Navigate to Education tab Subject Categories
      When  Create a Subject Categories
      Then Success message should be displayed

  Scenario: Check the Registration And Get the Exist Already Message
    And  Navigate to Education tab Subject Categories
    When Create a Subject Categories
    Then Exist already message should be displayed