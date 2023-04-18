Feature: Grade Level Functionalities

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Click on the element in LeftNav
      | setup       |
      | parameters  |
      | gradeLevels |


  Scenario: Create Grade Level

    And Click on the element in Dialog
      | addButton |

    When User sending the keys in Dialog Content
      | nameInput  | osman123 |
      | shortName  | osman123 |
      | orderInput | 1        |

    And Click on the element in Dialog
      | saveBtn |

    Then Success message should be displayed


  Scenario: Edit Grade Level

    And Click on the element in Dialog
      | searchGrade |
      | searchGrade |
      | editGrade   |

    When User sending the keys in Dialog Content
      | orderInput | 2 |

    And Click on the element in Dialog
      | saveBtn |

    Then Success message should be displayed


  Scenario: Delete Grade Level

    And Click on the element in Dialog
      | searchGrade  |
      | searchGrade  |
      | deleteGrade  |
      | deleteButton |

    Then Success message should be displayed