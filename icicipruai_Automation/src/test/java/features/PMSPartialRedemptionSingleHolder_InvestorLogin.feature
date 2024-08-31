Feature: Investor Login PMS Partial Redemption for Single Holder

  Background:
    Given the investor is logged in
    And the dashboard page is displayed

  Scenario: Successful login with PAN and password
    Given the user is on the login page
    When the user logs into the application with "<PanNumber>" and password "Reset@1234"
    And the user clicks on the login button
    Then the dashboard page should be displayed

  Scenario: Investor navigates to the redemption page
    When the investor clicks on the Redemption Module from the side menu
    Then the PMS Redemption page should be displayed on the screen

  Scenario: Investor selects PMS redemption option
    Given the investor is on the redemption page
    When the investor selects "Single Holder" from the dropdown
    And the investor selects the Strategy checkbox
    And the investor clicks on the Partial radio button

  Scenario: Investor enters invalid and valid amounts and verifies error validation messages
    Given the investor is on the redemption page
    When the investor enters an amount less than 2 Lakhs in the amount field
    Then the investor should see a validation message for the minimum amount requirement
    When the investor enters an amount equal to the AUM amount
    Then the investor should see a validation message for the maximum amount
    When the investor does not enter an amount and clicks on the redeem button
    Then the redeem button should be disabled

  Scenario: Investor redeems investment and verifies details
    Given the investor is on the redemption page
    When the L2 screen is displayed
    And the entered amount is displayed on the L2 screen
    And the investor clicks on the T&C checkbox and clicks on the redeem amount button
    And the investor enters the OTP
    Then the investor should see a success validation message

  Scenario: Investor verifies transaction in recent transactions page
    Given the investor is on the dashboard page
    When the investor clicks on the recent transaction option from the side menu
    Then the investor should see the entry in the transaction list
    And the status of the transaction should be displayed correctly