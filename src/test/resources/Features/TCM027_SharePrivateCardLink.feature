Feature: Share Private Card Link
  @TC01sdTC30
  Scenario: TCM027_SharePrivateCardLink
    Given user on board page
    When  user click dot private card for share
    And   user click share card link
    And   user click copy
    Then  user success copy
