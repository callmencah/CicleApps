Feature: Login with Skip
  @TC01sdTC30
  Scenario: TCM001_LoginWithSkip

    Given user is on boarding screen
    When  user click skip
    And   user click go to sign button
    And   user click go to sign button with google account
    And   user choose account google
    And   user click button x notification
    Then  user success login with google account