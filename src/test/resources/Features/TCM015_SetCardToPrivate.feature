Feature: Set Card To Private
  @TC01sdTC30
  Scenario: TCM015_SetCardToPrivate
    Given user on board page
    When  user click tree dot
    And   user click set card to private
    Then  update success notify