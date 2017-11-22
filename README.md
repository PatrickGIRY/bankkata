# Bank kata

## Problem description

Create a simple bank application with the following bankkata.features :

- Deposit into Account
- Withdraw from an Account
- Print a bank statement to the console

## Acceptance criteria

The statement should have 3 columns, the date of transaction, the amount of the transaction and the running balance.
The transactions should be printed in the reverse chronologic order.

The statement should have transactions in the following format :

    > DATE       | AMOUNT  | BALANCE
    > 10/04/2014 |  500.00 | 1400.00
    > 02/04/2014 | -100.00 |  900.00
    > 01/04/2014 | 1000.00 | 1000.00

## Starting point and constraints

1. Start with a class that have the following structure :

        public class Amount {
          public void deposit(int amount);
          public void withdraw(int amount);
          public void printStatement();
        }

    All the three methods are commands. They don't return anything.

2. You are not allowed to add any other method public method to the class.

3. Use Strings and Integers for dates and amounts (keep simple).

4. Don't worry about spacing in the statement printed to the console.

