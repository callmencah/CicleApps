Feature: Download File On Upload File Page
  @TC73sdTC80
  Scenario: TCM075_DownloadFileOnUploadFilePage
    #Download File On Upload File Page
    When  user click file uploaded
    And   click download
    Then  notification show file downloaded on upload page

