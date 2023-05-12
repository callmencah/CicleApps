Feature: Create Project With Same Name
  @Add
  Scenario: TCM105_CreateProjectWithSameName
  #Create Project With Same Name
    Given user click plus button
    When  user click add new project
    And   user set new project name
    And   user set new project desc
    Then  user click create