Feature: Print a bank statement to the console

  As a customer I want to print my bank statement in order to know all the transactions on my account.

  Scenario: Print statement should containing all transactions
    Given a client makes a deposit of 1000 on 10-01-2012
    And a deposit of 2000 on 13-01-2012
    And a withdrawal of 500 on 14-01-2012
    When she prints her bank statement
    Then she would see
      """
      DATE       | AMOUNT  | BALANCE
      10/04/2014 |  500.00 | 1400.00
      02/04/2014 | -100.00 |  900.00
      01/04/2014 | 1000.00 | 1000.00
      """