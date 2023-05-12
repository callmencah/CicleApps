Feature: Create New Doc
  @TC62sdTC72
  Scenario: TCM063_CreateNewDoc
    #Create New Doc
    Given user success navigate to doc and file
    When  user click plus button
    And   user click add a new doc
    And   user type a title doc
    And   user type a Description doc
    And   user click publish doc
    Then  notification create doc successful show on
