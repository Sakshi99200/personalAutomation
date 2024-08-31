

Feature: Investor Login PMS Partial Redemption for Single Holder 
@SmokeTest
  Scenario: Investor logs in and navigates to redemption page
  Given The investor is logged in 
  And the dashboard page is displayed
  When the investor clicks on the Redemption Module from side menu
  Then the PMS Redmeption page should be displayed on screen
  
  Scenario: Investor selects PMS redemption Option
  Given the investor is on the redemption page
  When the investor selects "Single Holder " single holder from the dropdown
  And the investor selects the Stratergy checkbox 
  And the investor clicks on the Partial radio button
  
  Scenario: Investor enteres invalid and valid amounts and verify Error validation Message
  Given the investor is on redemption page
  When the investor enteres an amount less than 2Lakhs in the amount field
  Then the investor should see a validation message for the minimum amount requirement
  When the investoe enteres an amunt equal to the AUM amount
  Then the investor should see a valiation message for the maximum amount
  When the investor does not enter amount and clicks on the redeem button
  Then the redeem button should be disabled
  
  Scenario: Investor redeem investment and Verifies Details
  Given the investor is on the redemption page
  When the L2 screen should be displayed 
  And the entered amount should be displayed on the L2 screen
  When the investor clicks on the T&C checkbox and clicks on the redeem Amount button
  And the investor enters the OTP
  Then the investor should see a success validation message
   

 Scenario: Investor verifies transaction in recent transactions page 
 Given the investor is on the dashboard page
 When the investor clicks on the recent transaction option from the side menu
 Then the investor should see the entry in the transaction list
 And the staus of the transaction should be displayed correctly

    Examples: 
      | username  | password |
      | DZBPK4334N |  Reset@1234  |
  
