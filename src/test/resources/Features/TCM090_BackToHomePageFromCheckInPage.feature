Feature: Back To Home Page From Check In Page
  @SearchJumpTo
  Scenario: TCM090_BackToHomePageFromCheckInPage
  #Back To Home Page From Check In Page
    Given user success navigate to check in page
    When  user click home for back
    Then  user success navigate to home page
