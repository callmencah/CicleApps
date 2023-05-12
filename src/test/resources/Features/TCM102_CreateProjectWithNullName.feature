Feature: Create Project With Null Name
  @Add
  Scenario: TCM102_CreateProjectWithNullName
  #Create Project With Null Name
    Given user set new project desc
    When  user click create
    Then  notification name and description fields must be filled show on