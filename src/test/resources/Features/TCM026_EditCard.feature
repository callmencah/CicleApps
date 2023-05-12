Feature: Edit Card
  @TC01sdTC30
  Scenario: TCM026_EditCard
    Given user on board page
    When  user click card edit
    And   user edit name card
    And   user click checklist edit card
    And   user click notification
    Then  user click back card