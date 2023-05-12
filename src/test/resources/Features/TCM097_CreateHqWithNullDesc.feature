Feature: Create Hq With Null Desc
  @Add
  Scenario: TCM097_CreateHqWithNullDesc
  #Create Hq With Null Desc
    Given user set new hq name
    When  user click create
    Then  notification name and description fields must be filled show on