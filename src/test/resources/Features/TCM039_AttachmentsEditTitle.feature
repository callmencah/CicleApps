Feature: Attachments Edit Title
  @TC39sdTC50
  Scenario: TCM039_AttachmentsEditTitle
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
    Given  user click plus button
    When   user click add new team
    And    user set new team name
    And    user set new team desc
    Then   user click create
  #Navigate To Board
    Given user home page
    And   user click team
    Then  user click board
  #Create Board List
    When  user on board page
    And   user click plus button
    And   user set add new board list
    And   user click submit
    Then  user success create board
  #Create Card
    When  user on board page
    And   user add new card
    Then  user click cek list
  #Set To Edit Card Page
    Given user on board page
    When  user click card
    Then  user card edit page
  #Attach file
    Given user card edit page
    When  user click attach file
    And   user click Allow
    And   user select item
    Then  user click notification
  #Attach Edit Title
    Given user card edit page
    When  user click dot attachments
    And   user click edit title
    And   user set new name file
    And   user click update
    Then  user click notification
