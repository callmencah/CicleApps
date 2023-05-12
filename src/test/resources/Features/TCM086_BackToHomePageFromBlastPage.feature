Feature: Back To Home Page From Blast Page
  @SearchJumpTo
  Scenario: TCM086_BackToHomePageFromBlastPage
  #Back To Home Page From Blast Page
    Given user success navigate to blast page
    When  user click home for back
    Then  user success navigate to home page
