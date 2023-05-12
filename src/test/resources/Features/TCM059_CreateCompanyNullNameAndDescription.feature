Feature: Create Company Null Name & Description
  @TC59sdTC61
  Scenario: TCM059_CreateCompanyNullNameAndDescription
  #Login With Skip
    Given user is on boarding screen
    When  user click skip
    And   user click go to sign button
    And   user click go to sign button with google account
    And   user choose account google
    And   user click button x notification
    Then  user success login with google account
  #Create Company Null Name & Description
    When  user success login with google account
    And   user click button create new company
    And   user click create
    Then  user click notification Name and description fields must be filled
