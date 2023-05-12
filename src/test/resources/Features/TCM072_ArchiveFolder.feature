Feature: Archive Folder
  @TC62sdTC72
  Scenario: TCM072_ArchiveFolder
    #Archive Folder
    When  user click folder another folder
    And   user click tree dot on folder
    And   user click archive folder
    Then  notification archive folder successful show on
