Feature: Archive All Card In This List
  @TC01sdTC30
  Scenario: TCM020_ArchiveAllCardInThisList
    Given user on board page
    When  user click dot board list un complete list
    And   user click archive all card in this list
    Then  user click notification
