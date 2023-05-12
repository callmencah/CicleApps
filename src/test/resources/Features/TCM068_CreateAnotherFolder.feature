Feature: Create Another Folder
  @TC62sdTC72
  Scenario: TCM068_CreateAnotherFolder
    #Create Another Folder
    When  user click plus button
    And   user click create a new folder
    And   user type a folder another name
    And   user click create
    Then  notification create bucket successful show on
