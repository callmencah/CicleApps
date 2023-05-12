Feature: Create Card With Same Name
  @TC01sdTC30
  Scenario: TCM009_CreateCardWithSameName

    Given  user on board page
    And    user add new card WithSameName
    Then   user click cek list WithSameName
