Feature: Search Jump To Doc And File
  @SearchJumpTo
  Scenario: TCM093_SearchJumpToDocAndFile
  #Navigate Search Jump To Doc And File
    Given user home page
    When  user click icon search
    And   user click jumping to another team or menu
    And   User scroll down
    And   user click Doc And File
    Then  user success navigate to doc and file page