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
#Author: naturefury@gmail.com
@functionaltest
Feature: Application functional test

	Background:
	Given user enter userid and paasword
	And click on login button

  @smoketest
  Scenario: cardholder search scenario using cardnumber
    Given user enters "1122384000735505"
    And click on search button
    Then trsnaction page is displayed as default
   
  @sanitytest
  Scenario: cardholder search scenario using LastName
    Given user enters LastName as "TITANS"
    And click on search button for LastName search
    Then transaction page is displayed as default
    
@sanitytest
  Scenario: cardholder transaction detail page
  Given perform valid "1122384000735505"
  Then transaction page displays and user clicks on first trasnaction from list

