@Agent_Pending_Approvals
Feature: Agent Pending Approvals Functionality


Scenario Outline: Agent_Pending_Approvals_TC01: Verify that company is Searched on first list 
Given I login to the certificial with <userName> and <password>
When I select pending approvals tab
And I enter <companyName> in search box 
Then I verify that the <companyName> is searched successfully for pending approvals
Examples:
|userName|password|companyName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|


Scenario Outline: Agent_Pending_Approvals_TC02:  Verify that company is Searched on any list 
Given I login to the certificial with <userName> and <password>
When I select pending approvals tab
And I enter <companyName> in search box 
Then I verify that the <companyName> is searched successfully for pending approvals  

Examples:
|userName|password|companyName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|


Scenario Outline: Agent_Pending_Approvals_TC03: Verify that all companies are Searched with some common text value
Given I login to the certificial with <userName> and <password>
When I select pending approvals tab
And I enter <companyName> in search box 
Then I verify that the <companyName> is searched successfully for pending approvals

Examples:
|userName|password|companyName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test|


@Test4
Scenario Outline: Agent_Pending_Approvals_TC04: Verify that Policy Shares tab is opened successfully for pending approvals 
Given I login to the certificial with <userName> and <password>
When I select pending approvals tab
And I click on "Policy Shares" tab for pending approvals 
Then I verify that "Policy Shares" tab is opened successfully for pending approvals 

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|


@Test4
Scenario Outline: Agent_Pending_Approvals_TC05: Verify that Policy Requests tab is opened successfully for pending approvals 
Given I login to the certificial with <userName> and <password>
When I select pending approvals tab
And I click on "Policy Requests" tab for pending approvals 
Then I verify that "Policy Requests" tab is opened successfully for pending approvals 

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|


@Test4
Scenario Outline: Agent_Pending_Approvals_TC06: Verify that Policy Verification tab is opened successfully for pending approvals 
Given I login to the certificial with <userName> and <password>
When I select pending approvals tab
And I click on "Policy Requests" tab for pending approvals 
And I click on "Policy Verification" tab for pending approvals 
Then I verify that "Policy Verification" tab is opened successfully for pending approvals 

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|