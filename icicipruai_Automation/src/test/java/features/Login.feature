Feature: login
Scenario: Successful login with PAN and password
   Given the user is on the login page
   When User login into application with "<PanNumber>" and password "<Password>"
 	 And click on login button
   Then dashboard page should be display
   
   Examples:
   |Username | Password |
   |DZBPK4334N | Reset@1234 |
   

