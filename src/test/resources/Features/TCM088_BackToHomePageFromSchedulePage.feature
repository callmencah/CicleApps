Feature: Back To Home Page From Schedule Page
  @SearchJumpTo
  Scenario: TCM088_BackToHomePageFromSchedulePage
  #Back To Home Page From Schedule Page
    Given user success navigate to schedule page
    When  user click home for back
    Then  user success navigate to home page
