Feature: Back To Home Page From Kanban Page
  @SearchJumpTo
  Scenario: TCM084_BackToHomePageFromKanbanPage
  #Back To Home Page From Kanban Page
    Given user success navigate to kanban page
    When  user click home for back
    Then  user success navigate to home page
