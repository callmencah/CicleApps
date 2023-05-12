Feature: Rename Doc
  @TC62sdTC72
  Scenario: TCM065_RenameDoc
 #Rename Doc
    When  user click doc1 to rename title
    And   user click symbol tree dot on doc
    And   user click edit doc
    And   user rename a title doc
    And   user rename a description doc
    And   User click publish changes
    Then  notification update doc successful show on