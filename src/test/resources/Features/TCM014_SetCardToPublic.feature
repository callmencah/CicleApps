Feature: Set Card To Public
  @TC01sdTC30
  Scenario: TCM014_SetCardToPublic
    Given user on board page
    When  user click tree dot
    And   user click set card to public
    Then  update success notify