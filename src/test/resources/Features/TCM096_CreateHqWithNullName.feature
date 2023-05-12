Feature: Create Hq With Null Name
  @Add
  Scenario: TCM096_CreateHqWithNullName
  #Create Hq With Null Name
    Given user set new hq desc
    When  user click create
    Then  notification name and description fields must be filled show on