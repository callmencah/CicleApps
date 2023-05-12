Feature: Search Jump To Group Chat
  @SearchJumpTo
  Scenario: TCM091_SearchJumpToGroupChat
  #Navigate Search Jump To Group Chat
    Given user home page
    When  user click icon search
    And   user click jumping to another team or menu
    And   user click GroupChat
    Then  user success navigate to group chat page