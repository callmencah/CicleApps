Feature: Move Private Card
  @TC01sdTC30
  Scenario: TCM022_MovePrivateCard
    Given user on board page
    When  user click dot private card
    And   user click move card
    And   user click list and choose board list
    And   user click checklist
    Then  user click notification
