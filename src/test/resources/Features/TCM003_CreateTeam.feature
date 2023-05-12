Feature: Create Team
  @TC01sdTC30
  Scenario: TCM003_CreateTeam

    Given  user click plus button
    When   user click add new team
    And    user set new team name
    And    user set new team desc
    Then   user click create

