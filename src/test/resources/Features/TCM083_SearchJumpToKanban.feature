Feature: Search Jump To Kanban
  @SearchJumpTo
  Scenario: TCM083_SearchJumpToKanban
  #Navigate Search Jump To Kanban
    Given user home page
    When  user click icon search
    And   user click jumping to another team or menu
    And   user click Kanban
    Then  user success navigate to kanban page