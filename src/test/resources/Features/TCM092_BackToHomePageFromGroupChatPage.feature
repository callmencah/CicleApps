Feature: Back To Home Page From Group Chat Page
  @SearchJumpTo
  Scenario: TCM092_BackToHomePageFromGroupChatPage
  #Back To Home Page From Group Chat Page
    Given user success navigate to group chat page
    When  user click backs
    Then  user success navigate to home page
