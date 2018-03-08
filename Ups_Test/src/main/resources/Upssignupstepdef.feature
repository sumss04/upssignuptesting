Feature: Signup functionality validation

Scenario: Successfully signup with valid credentials
	Given User able to open browser
	
	And go to UPS home page
	
	When User navigate signup button link
	
	And User put user name-Sumon
	
	And User put valid user email-sumss04@yahoo.com
	
	And User put user id-Sumss1238cdm
	
	And User put valid password-M131188a$$
	
	And User able to Nevigate to check box button link
	
	And User able to click continue button
	
	Then Signup successfully