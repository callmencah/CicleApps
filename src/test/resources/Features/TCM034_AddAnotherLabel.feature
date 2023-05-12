Feature: Add Another label
  @TC31sdTC38
  Scenario: TCM034_AddAnotherLabel
 #Add Another Label
    Given user card edit page
    When  user click add label
    And   user click create new label
    And   user set label another name
    And   user click label another colour
    And   user click submit label
    And   user click another label
    Then  user click empty