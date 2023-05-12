Feature: Back To Home Page From Doc And File Page
  @SearchJumpTo
  Scenario: TCM094_BackToHomePageFromDocAndFilePage
  #Back To Home Page From Doc And File Page
    Given user success navigate to doc and file page
    When  user click home for back
    Then  user success navigate to home page