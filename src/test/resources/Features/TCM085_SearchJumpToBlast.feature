Feature: Search Jump To Blast
  @SearchJumpTo
  Scenario: TCM085_SearchJumpToBlast
  #Navigate Search Jump To Blast
    Given user home page
    When  user click icon search
    And   user click jumping to another team or menu
    And   user click Blast
    Then  user success navigate to blast page