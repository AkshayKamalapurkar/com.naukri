Feature: Login into Naukri application
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
		|Shubhampanegaon@gmail.com|Sunitha@1994|
		|shubhampanegaon79@gmail.com|323039323039@Sp|
        |ashu.honnungar@gmail.com|rani28091994|
#        |marutibadiger073@gmail.com|Hilux@13|




