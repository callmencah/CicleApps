Feature: Attachments Download
  @TC39sdTC50
  Scenario: TCM040_AttachmentsDownload
  #Attachments Download
    Given user card edit page
    When  user click dot attachments
    And   user click download
    And   user click Allow Button
    And   user click OK
    Then  user click notification downloaded