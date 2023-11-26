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

Feature: Login
  Login into Naukri application
  Background:
	Given Launch Browser


   Scenario Outline: Successful login with Valid Credentials
    Given User navigates to loginpage
    When enter valid username "<usernames>"
    And enter valid password "<passwords>"
    Then click on login button
    And click on profileableEditHeadline
    Then click on logout



    Examples:
		|usernames|passwords|
#		|Shubhampanegaon@gmail.com|Sunitha@1994|
#		|shubhampanegaon79@gmail.com|323039323039@Sp|
        |ashu.honnungar@gmail.com|rani28091994|
#        |marutibadiger073@gmail.com|Hilux@13|




