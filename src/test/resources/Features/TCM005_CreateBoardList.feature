Feature: Create board list
  @TC01sdTC30
  Scenario: TCM005_CreateBoardList

    Given  user on board page
    And    user click plus button
    And    user set add new board list
    And    user click submit
    Then   user success create board