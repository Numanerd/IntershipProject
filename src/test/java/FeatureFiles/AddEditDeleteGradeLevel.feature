Feature: Grade Level Functionalities

  Scenario: Create, Edit and Delete Grade Levels

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully

    And Click on the element in LeftNav
      | setup       |
      | parameters  |
      | gradeLevels |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput  | osman123 |
      | shortName  | osman123 |
      | orderInput | 1        |

    And Click on the element in Dialog
      | saveBtn |

    Then Success message should be displayed