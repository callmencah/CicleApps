Feature: Create Company
  @TC01sdTC30
  Scenario: TCM002_CreateCompany

    Given user success login with google account
    Then  user click button create new company
    And   user set new company name
    And   user set new company desc
    And   user click create
    And   user success create company
