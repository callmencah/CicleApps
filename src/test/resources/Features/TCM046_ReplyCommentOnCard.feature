Feature: Reply Comment On Card
  @TC39sdTC50
  Scenario: TCM046_ReplyCommentOnCard
  #Reply Comment On Card
    Given user card edit page
    When  user click reply
    And   user click add comment
    And   user add reply comment
    Then  user click submit reply
