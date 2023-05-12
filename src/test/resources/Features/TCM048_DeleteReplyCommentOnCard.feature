Feature: Delete Reply Comment On Card
  @TC39sdTC50
  Scenario: TCM048_DeleteReplyCommentOnCard.feature
  #Delete Reply Comment On Card
    Given user on reply page
    When  user click dot comment reply
    And   user click archive comment
    And   user click ok
    Then  user click notification