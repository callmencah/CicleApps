Feature: Set Due Date
  @TC31sdTC38
  Scenario: TCM031_SetDueDate
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
  #Set Due Date
    When  user on board page
    And   user click card
    And   user card edit page
    And   user click set due date
    And   user click symbol pencil and set date
    And   user click ok select date
    And   user click ok select time
    Then  user click notification
