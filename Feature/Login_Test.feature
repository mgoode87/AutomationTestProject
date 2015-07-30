Feature: Google Account

Scenario: Successful login with Valid Credentials
	Given User is on HomePage
	When User navigates to Login Page
	And User enters Username 
	And User clicks Next
	And User enters Password
	And User clicks Submit
	Then User is on Account Home Page
	
Scenario: Successful logout with Valid Credentials
	Given User is on HomePage
	When User Clicks on the account dropdown arrow
	Then User account dropdown appears
	When User clicks on Sign out 
	Then User is on the HomePage 
	And User sees SigninButton 
	
	