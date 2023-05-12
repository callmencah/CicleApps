Feature: Create Company With Same Name
  @TC058
  Scenario: TCM058_CreateCompanyWithSameName
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
   #Create Company With Same Name
    When  user click symbol company
    And   user click plus button company
    And   user set new company name
    And   user set new company desc
    And   user click create
    And   user click notification
    Then  user check company
