Feature: Update Due Date
  @TC31sdTC38
  Scenario: TCM032_UpdateDueDate
 #Update Due Date
    Given user card edit page
    And   user click set due date for update
    And   user click symbol pencil and set date for update
    And   user click ok select date
    And   user click ok select time
    Then  user click notification