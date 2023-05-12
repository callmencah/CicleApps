Feature: Search Jump To Check In
  @SearchJumpTo
  Scenario: TCM089_SearchJumpToCheckIn
  #Navigate Search Jump To Check In
    Given user home page
    When  user click icon search
    And   user click jumping to another team or menu
    And   user click CheckIn
    Then  user success navigate to check in page