Feature: Search Jump To Schedule
  @SearchJumpTo
  Scenario: TCM087_SearchJumpToSchedule
  #Navigate Search Jump To Schedule
    Given user home page
    When  user click icon search
    And   user click jumping to another team or menu
    And   user click Schedule
    Then  user success navigate to schedule page