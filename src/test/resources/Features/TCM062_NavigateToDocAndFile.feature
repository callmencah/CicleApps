Feature: Navigate To Doc And File
  @TC62sdTC72
  Scenario: TCM062_NavigateToDocAndFile
 #Login With Skip
    Given user is on boarding screen
    When  user click skip
    And   user click go to sign button
    And   user click go to sign button with google account
    And   user choose account google
    And   user click button x notification
    Then  user success login with google account
  #Create Company
    When  user success login with google account
    And   user click button create new company
    And   user set new company name
    And   user set new company desc
    And   user click create
    Then  user success create company
  #Create Team
    Given user click plus button
    When  user click add new team
    And   user set new team name
    And   user set new team desc
    Then  user click create
  #Navigate To Doc And File
    Given user home page
    When  user click team
    And   user click doc and file
    Then  user success navigate to doc and file
