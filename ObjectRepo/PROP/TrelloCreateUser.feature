Feature: Trello Create User Login


@TrelloSmokeTest @TrelloRegressionTests
Scenario: verify signin page 
Given User is on Trello Home Page "https://trello.com/"
When User Click on Create User Button 
Then User on SignIn Page with title "Create a Trello Account"


Scenario: Create User  
Given User is on Trello Home Page "https://trello.com/"
And User Click on Create User Button 
And User on Create User Page with title "Create a Trello Account"
And User enters "testtrello" and "@gmail.com" in the email text box 
And User clicks continue button 
And User enters Password "password"
When User clicks on Signup Button 


