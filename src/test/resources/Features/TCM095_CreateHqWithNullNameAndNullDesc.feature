Feature: CreateHq With Null Name And Null Desc
  @Add
  Scenario: TCM095_CreateHqWithNullNameAndNullDesc
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
  #Create Hq
    Given user click plus button
    When  user click add new hq
    And   user click create
    Then  notification name and description fields must be filled show on