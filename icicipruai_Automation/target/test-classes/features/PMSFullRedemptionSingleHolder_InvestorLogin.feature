Feature: Investor Login PMS Full Redemption for Single Holder 
@SmokeTest
  Scenario: Investor logs in and navigates to redemption page
  Given The investor is logged in 
  And the dashboard page is displayed
  When the investor clicks on the Redemption Module from side menu
  Then the PMS Redmeption page should be displayed on screen
  
  Scenario: Investor selects PMS redemption Option and verify Selected Stretegy card AUM amount is greater than 15L
  Given the investor is on the redemption page
  When the investor selects "<Single Holder>" single holder from the dropdown
  And the investor selects the Stratergy checkbox 
  And the investor Verifies that the selected Stretegy card AUM amount is greater than 15L 
  And the investor clicks on the redeem button
  Then the L2 screen should be displayed  
  
  Scenario: Investor redeem investment and Verifies Details
  Given the investor is on the L2 Screen
  When the investor clicks on the T&C checkbox 
  And the investor clicks on the redeem Amount button
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
