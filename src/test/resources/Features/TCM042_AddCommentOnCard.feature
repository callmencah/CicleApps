Feature: Add Comment On Card
  @TC39sdTC50
  Scenario: TCM042_AddCommentOnCard
  #Add Comment On Card
    Given user card edit page
    When  user click add comment
    And   user add comment
    And   user click publish comment
    Then  user move to comment
