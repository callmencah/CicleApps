Feature: Create A New Folder
  @TC62sdTC72
  Scenario: TCM067_CreateANewFolder
    #Create A New Folder
    When  user click plus button
    And   user click create a new folder
    And   user type a folder name
    And   user click create
    Then  notification create bucket successful show on
