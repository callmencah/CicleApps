Feature: Create Hq Just Special Character
  @Add
  Scenario: TCM100_CreateHqJustSpecialCharacter
  #Create Hq Just Special Character
    Given user click plus button
    When  user click add new hq
    And   user set new hq name special character
    And   user set new hq desc special character
    Then  user click create