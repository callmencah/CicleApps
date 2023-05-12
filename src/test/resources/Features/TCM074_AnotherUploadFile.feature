Feature: Another Upload File
  @TC73sdTC80
  Scenario: TCM074_AnotherUploadFile
    #Another Upload File
    When  user click plus button
    And   user click upload file
    And   user select file doc
    Then  notification create file successful show on

