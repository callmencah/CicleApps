Feature: Change Name Folder
  @TC62sdTC72
  Scenario: TCM069_ChangeNameFolder
    #Change Name Folder
    When  user click folder 1
    And   user click tree dot on folder
    And   user click change name
    And   user set new name folder
    And   user click cek list on folder
    Then  notification update bucket successful show on
