Feature: Login to gmail

Scenario: Login to gmail as a valid user
	Given user is on Login page
	When user enters "<username>" and "<password>"
	Then verify gmail page is displayed

