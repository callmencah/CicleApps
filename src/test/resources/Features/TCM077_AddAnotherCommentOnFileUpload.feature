Feature: Add Another Comment On File Upload
  @TC73sdTC80
  Scenario: TCM077_AddAnotherCommentOnFileUpload
    #Add Another Comment On File Upload
    When  user click add comment on upload file
    And   user set another comment on upload file
    Then  user click submit comment on upload file
