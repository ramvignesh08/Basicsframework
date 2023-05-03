Feature: Login functionality for opencart website

				As a user of the open cart website
				I want to be login with in my account
				So that I can access my account related features and manage by orders
				
Background: 
				Given i am on the opencart login page
@noissue
Scenario: Successful login with valid credentials
				Given I have entered valid username and password
				When I click on the login button
				Then I should be logged in successfully
@issue
Scenario Outline: Unsuccessful login with invalid and empty credentials
				Given I have entered invalid "<username>" and "<password>"
				When I click on the login button
				Then I should see an error message indicating as warning message
				
Examples:
|username|password|
|ramvignesh85@email.com|vicky999|
|ramviknesh85@gmail.com|vicky007|
|ramviknesh85@email.com|abccc|

@noissue
Scenario: Navigating to the forgotten password page
				Given I click on the forgotten password link
				Then I should be redirected to the forgot password page
				
				