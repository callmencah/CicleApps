Feature: Create Hq
  @Add
  Scenario: TCM098_CreateHq
  #Create Hq
    Given user set new hq name
    When  user set new hq desc
    Then  user click create