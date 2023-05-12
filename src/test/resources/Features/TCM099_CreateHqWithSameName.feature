Feature: Create Hq With Same Name
  @Add
  Scenario: TCM099_CreateHqWithSameName
  #Create Hq With Same Name
    Given user click plus button
    When  user click add new hq
    And   user set new hq name
    And   user set new hq desc
    Then  user click create