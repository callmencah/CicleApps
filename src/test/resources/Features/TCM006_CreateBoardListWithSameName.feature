Feature: Create board list With Same Name
  @TC01sdTC30
  Scenario: TCM006_CreateBoardListWithSameName

    Given  user on board page with same name
    And    user click plus button
    And    user set add new board list with same name
    And    user click submit with same name
    Then   user success create board with same name
