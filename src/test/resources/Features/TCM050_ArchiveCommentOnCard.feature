Feature: Archive Comment On Card
  @TC39sdTC50
  Scenario: TCM050_ArchiveCommentOnCard
  #Archive Comment On Card
    Given user card edit page
    When  user click dot comment
    And   user click archive comment
    And   user click ok
    Then  user click notification
