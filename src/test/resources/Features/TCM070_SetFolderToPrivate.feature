Feature: Set Folder To Private
  @TC62sdTC72
  Scenario: TCM070_SetFolderToPrivate
    #Set Folder To Private
    When  user click folder another folder
    And   user click tree dot on folder
    And   user click set to private
    Then  notification update bucket successful show on
