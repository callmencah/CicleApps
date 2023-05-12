Feature: Share Card Link
  @TC01sdTC30
  Scenario: TCM028_ShareCardLink
    Given user on board page
    When  user click dot card for share
    And   user click share card link
    And   user click copy
    Then  user success copy
