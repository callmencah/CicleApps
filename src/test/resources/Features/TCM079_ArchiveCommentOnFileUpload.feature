Feature: Archive Comment On File Upload
  @TC73sdTC80
  Scenario: TCM079_ArchiveCommentOnFileUpload
    #Archive Comment On File Upload
    When  user click tree dot comment
    And   user click archive on upload file
    And   user click Ok upload file
    Then  notification your comment has been archived successful show on
