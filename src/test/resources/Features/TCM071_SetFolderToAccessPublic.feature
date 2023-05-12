Feature: Set Folder To Access Public
  @TC62sdTC72
  Scenario: TCM071_SetFolderToAccessPublic
    #Set Folder To Access Public
    When  user click folder another folder
    And   user click tree dot on folder
    And   user click set to access public
    Then  notification update bucket successful show on
