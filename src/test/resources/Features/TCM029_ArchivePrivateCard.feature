Feature: Archive Private Card
  @TC01sdTC30
  Scenario: TCM029_ArchivePrivateCard
    Given user on board page
    When  user click dot private card for share
    And   user click archive card
    And   user click archive
    Then  user click notification
