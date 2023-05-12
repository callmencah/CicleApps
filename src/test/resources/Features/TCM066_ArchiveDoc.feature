Feature: Archive Doc
  @TC62sdTC72
  Scenario: TCM066_ArchiveDoc
 #Archive Doc
    When  user click anotherdoc to Archive
    And   user click symbol tree dot on doc
    And   user click archive doc
    And   user click Ok doc
    Then  notification archive doc successful show on