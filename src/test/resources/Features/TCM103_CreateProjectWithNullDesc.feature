Feature: Create Project With Null Desc
  @Add
  Scenario: TCM103_CreateProjectWithNullDesc
  #Create Project With Null Desc
    Given user set new project name
    When  user click create
    Then  notification name and description fields must be filled show on