Feature: Attachments Delete
  @TC39sdTC50
  Scenario: TCM041_AttachmentsDelete
  #Attachments Delete
    Given user card edit page
    When  user click dot attachments
    And   user click delete
    And   user click OK
    Then  user click notification

