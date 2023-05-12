Feature: Create Project With Null Name And Null Desc
  @Add
  Scenario: TCM101_CreateProjectWithNullNameAndNullDesc
  #CCreate Project With Null Name And Null Desc
    Given user click plus button
    When  user click add new project
    And   user click create
    Then  notification name and description fields must be filled show on