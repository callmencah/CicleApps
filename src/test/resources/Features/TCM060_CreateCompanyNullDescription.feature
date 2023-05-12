Feature: Create Company Null Description
  @TC59sdTC61
  Scenario: TCM060_CreateCompanyNullDescription
  #Create Company Description Null
    When  user set new company name
    And   user click create
    Then  user click notification Name and description fields must be filled