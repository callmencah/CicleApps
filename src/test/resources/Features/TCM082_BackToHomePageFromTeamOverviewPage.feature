Feature: Back To Home Page From Team Overview Page
  @SearchJumpTo
  Scenario: TCM082_BackToHomePageFromTeamOverviewPage
  #Back To Home Page From Team Overview Page
    Given user success navigate to teams overview page
    When  user click back
    Then  user success navigate to home page
