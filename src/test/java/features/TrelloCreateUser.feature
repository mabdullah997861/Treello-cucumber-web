Feature: Trello Create User Login 


@TrelloSmokeTest @TrelloRegressionTests 
Scenario: verify signin page 
	Given User is on Trello Home Page "https://trello.com/" 
	When User Click on Create User Button 
	Then User on SignIn Page with title "Create a Trello Account" 
	
	
Scenario Outline: Create User and Dashboard 
	Given User is on Trello Home Page "https://trello.com/" 
	And User Click on Create User Button 
	And User on Create User Page with title "Create a Trello Account" 
	And User enters "testtrello" and "@gmail.com" in the email text box 
	And User clicks continue button 
	And User enters Password "password" 
	And User clicks on Signup Button 
	And User is on Dashboard page with title "Create Your Board | Trello" 
	And User enters "Holiday planning" in the title 
	And User clicks next button 
	When User enters "<Things to do list1>" "<Things to do list2>" "<Things to do list3>" 
	And User clicks next button 
	And User clicks next button 
	And User clicks next button 
	Then User gets on Trello Dashboard 
	
	
	Examples: 
		|Things to do list 1| Things to do list 2| Things to do list 3|
		| Book Flight       | Book Hotel         | Book Car           |
		
