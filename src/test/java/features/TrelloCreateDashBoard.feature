@TrelloSmokeTest @TrelloRegressionTests 
Feature: Trello Create Dashboard For the first time 


Background: Login with Existing User 
	Given User is on Trello Home Page "https://trello.com/" 
	And User Clicks on Sign In Button 
	And User on SignIn Page with title "Log in to Trello" 
	And User enters credentials as "mabdullah997861@gmail.com" and "Password@123" 
	And User clicks Login button 
	
	
Scenario Outline: Create DashBoard if there is no dashboards available to the user
	Given User is on Dashboard page with title "Create Your Board | Trello"
	And User enters "Holiday planning" in the title 
	And User clicks next button 
	When User enters "<Things to do list1>" "<Things to do list2>" "<Things to do list3>" 
	And User clicks next button 
	And User clicks next button
	And User clicks next button 
	And User gets on Trello Dashboard
	
	
	
	Examples: 
		|Things to do list 1| Things to do list 2| Things to do list 3|
		| Book Flight       | Book Hotel         | Book Car           |
		
		
