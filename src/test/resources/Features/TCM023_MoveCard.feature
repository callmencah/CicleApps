Feature: Move Card
  @TC01sdTC30
  Scenario: TCM023_MoveCard
    Given user on board page
    When  user click dot card
    And   user click move card
    And   user click list and choose board list
    And   user click checklist
    Then  user click notification
