Feature: Add Edit and Delete Attestations

  Background:
    Given Navigate to Campus Page
    When Enter username and password then click login button
    Then User should login successfully on the Website

    Scenario: Create School Departments

      And Navigate to School Departments
      When Create School Departments with Apache
      Then Success message should be displayed

  Scenario: Check the Registration And Get the Exist Already Message
    And  Navigate to School Departments
    When Create School Departments with Apache
    Then Exist already message should be displayed

