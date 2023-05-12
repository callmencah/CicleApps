Feature: Add label
  @TC31sdTC38
  Scenario: TCM033_AddLabel
 #Add Label
    Given user card edit page
    When  user click add label
    And   user set label name
    And   user click label colour
    And   user click submit label
    And   user click label
    Then  user click empty