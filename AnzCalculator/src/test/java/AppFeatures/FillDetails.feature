#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Fill Calculator details

Background: 
Given user is on landing page

Scenario: Fill all details
When user fills all details 

 |AppType|Dependents|PropertyToBuy  |Income|OtherIncome|Expenses|HomeLoan|OtherLoan|Commitments|CreditCard|
 |Single |0         |Home to live in|80000 |10000      |500     |0       |100      |0          |10000     |
 
Then user clicks Work out how much i could borrow button And Borrowing estimate is "$500,000"
And click start over button clears the form 
And close the browser


Scenario: Fill only Living expense detail and check the unable to borrow amount message
When user fill the Living expense as $1
Then user clicks Work out how much i could borrow button 
And Verify the message "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500."
And close the browser