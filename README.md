# Mortgage-Calculator
A simple Java program that calculates monthly mortgage payments based on loan principal, interest rate, and loan term. The program takes user input for the loan amount, annual interest rate, and loan duration, and computes the monthly payment using the standard mortgage payment formula.

## Features

- Calculate monthly mortgage payments.
- Accepts user input for:
  - Loan amount (principal)
  - Annual interest rate
  - Loan term (in years)
- Outputs the monthly payment formatted as currency.
- Uses compounding interest calculations to ensure accurate results.

## Formula Used

The formula used to calculate the monthly payment is:

\[
M = P \cdot \frac{r(1+r)^n}{(1+r)^n - 1}
\]

Where:
- **M**: Monthly payment
- **P**: Loan principal (the total loan amount)
- **r**: Monthly interest rate (annual interest rate / 12)
- **n**: Total number of payments (loan term in years \* 12)
