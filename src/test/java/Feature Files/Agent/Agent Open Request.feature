@Agent_Open_Request
Feature: Agent Open Request Functionality


Scenario Outline: Agent_Open_Request_TC01: Verify that company is Searched on first list 
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I enter <companyName> in search box 
Then I verify that the <companyName> is searched successfully 
Examples:
|userName|password|companyName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|


Scenario Outline: Agent_Open_Request_TC02:  Verify that company is Searched on any list 
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I enter <companyName> in search box 
Then I verify that the <companyName> is searched successfully  

Examples:
|userName|password|companyName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|


Scenario Outline: Agent_Open_Request_TC03: Verify that all companies are Searched with some common text value
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I enter <companyName> in search box 
Then I verify that the <companyName> is searched successfully 

Examples:
|userName|password|companyName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test|



Scenario Outline: Agent_Open_Request_TC04: Verify the end to end flow for Respond to policy request 
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I enter <companyName> in search box 
Then I verify that the <companyName> is searched successfully 
When I click on respond to request button
Then I verify end to end flow for Respond to policy request

Examples:
|userName|password|companyName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|



Scenario Outline: Agent_Open_Request_TC05: Verify that Certificate upload button is getting displayed on open request page
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I verify that "Certificate Upload" button is getting displayed for agent open request

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|


Scenario Outline: Agent_Open_Request_TC06: Verify that Certificate upload button is getting displayed on open request page
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I verify that "All Attachments" button is getting displayed for agent open request

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|



Scenario Outline: Agent_Open_Request_TC07: Verify that Certificate upload button is getting displayed on open request page
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I verify that "Respond To request" button is getting displayed for agent open request

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|


Scenario Outline: Agent_Open_Request_TC08: Verify that Deny Request button is getting displayed on open request page
Given I login to the certificial with <userName> and <password>
When I select open request tab
And I verify that "Deny Request" button is getting displayed for agent open request

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|