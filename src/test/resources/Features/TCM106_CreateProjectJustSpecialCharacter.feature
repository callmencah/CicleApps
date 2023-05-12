Feature: Create Project Just Special Character
  @Add
  Scenario: TCM106_CreateProjectJustSpecialCharacter
  #Create Project Just Special Character
    Given user click plus button
    When  user click add new project
    And   user set new project name Special Character
    And   user set new project desc Special Character
    Then  user click create