Feature: Create Another Doc
  @TC62sdTC72
  Scenario: TCM064_CreateAnotherDoc
 #Create Another Doc
    When  user click plus button
    And   user click add a new doc
    And   user type a title another doc
    And   user type a Description another doc
    And   user click publish doc
    Then  notification create doc successful show on
