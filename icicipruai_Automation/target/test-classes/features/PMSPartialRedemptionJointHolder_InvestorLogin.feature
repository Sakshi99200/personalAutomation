Feature: Investor Login PMS Partial Redemption for Joint Holder
@SmokeTest
Scenario: Investor logs in and navigates to the redemption page
 Given the investor is logged in
 And the dashboard page is displayed
 When the investor clicks on the redemption option
 Then the redemption page should be displayed
 
 Scenario: Investor selects redmeption options
 Given the Investor selects "<Joint Holder>" from the dropdown
 And the Investor selects the stratergy checkbox
 And the Investor clicks on the partial radio button
 
 Scenario: Verify AUM AMount for partial redmeption
 Given the investor is on the redemption page
 When the investor verifies that selected stratergy cards total AUM amount is greater than 2L
 Then No error validation should be displayed for the selected Card
 
 Scenario: Verify Error validation for AUM amount field
 Given the investor is on the redemption page
 When the investor enteres an amount less than 2L in the amount field
 Then the investor should see a error validation message for the minimum amount requirement
 
 Scenario: Verify error validation message for entering AUM amount value is equal to selected Stretergy cards total AUM Amount
 Given the investor is on redemption page
 When the investor enters an AUM Amount value is equal to selected Stretergy cards total AUM Amount
 Then the investor should see a error validation message for the minimum amount requirement
 
 Scenario: Verify flow for attempt redemption without entering AUM Amount
 Given the investor is on redemption page
 When the investor does not enter an AUM Amount and clicks on the redeem button
 Then the investor should see the redeem button is disablead
 
 Scenario: Verify Investor enters valid AUM amount and click on Redeem Button
 Given the investor is on redemption page
 When the investor enteres an AUM amount value is greater than 2L or equal to 2L
 And click on Redeem button
 Then the investor should see L2 screen 
 
 Scenario: Complete redemption Process
 Given the investor is on L2 screen
 When the investor clicks on T&C checkbox button 
 And Click on Redeem Amount button
 And Enteres OTP and clicks on proceed button
 
 Scenario: Verify placed transaction entry on Recent Transaction Page
 Given the investor is on the dashboard page
 When the investor clicks on Recent transaction page from side menu
 Then the investor should see the placed transcation entry on recent transaction page
 and the status of transaction should be displayed correctly
  
Scenario: Joint holder logs in and navigates to JH approval request tab
Given the Joint holder logged in 
And the dashbaord page is displayed
When the Joint holder clicks on JH approval request tab
Then the JH request page is displayed

#Scenario: 
 