Feature: Login to Google Account

Scenario: Successful login with Valid Credentials
	Given User is on HomePage
	When User navigates to Login Page
	And User enters Username 
	And User clicks Next
	And User enters Password
	And User clicks Submit
	Then User is on Account Home Page
	
	