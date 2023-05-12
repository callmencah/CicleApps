Feature: Attach File PNG On Card
  @TC31sdTC38
  Scenario: TCM038_AttachFilePNGOnCard
 #Attach File PNG On Card
    Given user card edit page
    When  user click attach file
    And   user click Allow
    And   user select item
    Then  user click notification