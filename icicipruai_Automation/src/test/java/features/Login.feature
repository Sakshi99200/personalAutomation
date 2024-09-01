Feature: login
Scenario: Successful login with PAN and password
   Given the user is on the login page
   When User login into application with "<PanNumber>" and password "<Password>"
 	 And Click on login button
   Then dashboard page should be display
   
   Examples:
   |Username | Password |
   |DZBPK4334N | Test@1234 |
   

