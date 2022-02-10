Feature: Login in system

  Scenario: All scores are good
    Given Entring kindergarten ranking
    When Working parents are over 1 point
    And Disabled child gains 2 points
    And Twins child gains 1 point
    And Siblings in the same kindergarten 1 point
    Then Successfuly entered kindergarten

  Scenario: Have not enough all score
   Given Entring kindergarten ranking
   When Working parents have not 1 or more points
   And Disabled child not gains 2 points
   And Twins child not gains 1 point
   And There is no siblings in the same kindergarten 1 point
   Then Ranked is failed
  
  Scenario: Have not enough score
   Given Entring kindergarten ranking
   When Working parents are over 1 point
   And Disabled child not gains 2 points
   And Twins child gains 1 point
   And Siblings in the same kindergarten 1 point
   Then Ranked is failed
  
  Scenario: Have not twins
   Given Entring kindergarten ranking
   When Twins child not gains 1 point
   Then Have not points for twins
   
  Scenario: Have not disabled child
   Given Entring kindergarten ranking
   When Disabled child not gains 1 point
   Then Have not points for disabled child
   