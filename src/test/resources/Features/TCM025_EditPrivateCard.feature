Feature: Edit Private Card
  @TC01sdTC30
  Scenario: TCM025_EditPrivateCard
    Given user on board page
    When  user click private card edit
    And   user edit name private card
    And   user click checklist edit private card
    And   user click notification
    Then  user click back private card