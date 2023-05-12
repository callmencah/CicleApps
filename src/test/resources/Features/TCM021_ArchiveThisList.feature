Feature: Archive This List
  @TC01sdTC30
  Scenario: TCM021_ArchiveThisList
    Given user on board page
    When  user click dot board list un complete list
    And   user click archive this list
    Then  user click notification
