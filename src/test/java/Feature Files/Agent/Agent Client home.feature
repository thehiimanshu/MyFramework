@functional_smoke
@Agent_Client
Feature: Agent Client Search and Filter Functionality

@Agent_Search
Scenario Outline: Agent_Client_TC01: Verify that client is Searched on first list 
Given I login to the certificial with <userName> and <password>
When I enter <clientName> in search box 
Then I verify that the <clientName> is searched successfully 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|


@Agent_Search
Scenario Outline: Agent_Client_TC02:  Verify that client is Searched on any list 
Given I login to the certificial with <userName> and <password>
When I enter <clientName> in search box 
Then I verify that the <clientName> is searched successfully 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|


@Agent_Search
Scenario Outline: Agent_Client_TC03: Verify that all companies are Searched with some common text value
Given I login to the certificial with <userName> and <password>
When I enter <clientName> in search box 
Then I verify that the <clientName> is searched successfully 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test|



Scenario Outline: Agent_Client_TC04: Verify that the filter menu is displayed when Hover on filter button
Given I login to the certificial with <userName> and <password>
When I hover on filter button
Then I verify that the filter menu is displayed with following filter options
|Policies Expiring|
|Policies by Status|
|Policies by Company Record|
|Policies by Endorsements|

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|



Scenario Outline: Agent_Client_TC05: Verify that the clients are filtered for Canceled Policies by Status option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Canceled" option from  "Policies by Status" filter menu
Then I verify that the "Canceled" filter for "Policies by Status" is applied successfully 

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|



Scenario Outline: Agent_Client_TC06: Verify that the clients are filtered for Rejected Policies by Status option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Rejected" option from  "Policies by Status" filter menu
Then I verify that the "Rejected" filter for "Policies by Status" is applied successfully 

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|


Scenario Outline: Agent_Client_TC07: Verify that the clients are filtered for Unverified Policies by Status option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Unverified" option from  "Policies by Status" filter menu
Then I verify that the "Unverified" filter for "Policies by Status" is applied successfully 

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|



Scenario Outline: Agent_Client_TC08: Verify that the clients are filtered for Policies by Company Record option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Test Company" option from  "Policies by Company Record" filter menu
Then I verify that the <clientName> is searched successfully 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|


Scenario Outline: Agent_Client_TC09: Verify that Reset all filter buttons reset all the filters
Given I login to the certificial with <userName> and <password>
When I hover on filter button
Then I verify that reset button is "disabled" when "no" filter is selected
And I verify that reset button is "enabled" when "any" filter is selected

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|


Scenario Outline: Agent_Client_TC10: Verify that Issue COI side bar is displayed when click on Issue COI button
Given I login to the certificial with <userName> and <password>
Then I verify that Issue COI side bar is displayed when I click on Issue COI button

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|


Scenario Outline: Agent_Client_TC11: Verify that preview to download COI is displayed when click on preview & Download COI Button
Given I login to the certificial with <userName> and <password>
Then I verify that a preview to download COI is displayed when I click on preview & Download COI Button

Examples:
|userName|password|
|axortest.03@gmail.com|zaq1ZAQ!|



Scenario Outline: Agent_Client_TC12: Verify that all companies associated with client on manage shares page
Given I login to the certificial with <userName> and <password>
When I click on manage shares button for client <clientName>
And I verify that all companies associated with client <clientName> are displayed

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|



Scenario Outline: Agent_Client_TC13: Verify that agent clients page is displayed when I click on manage shares back button
Given I login to the certificial with <userName> and <password>
When I click on manage shares button for client <clientName>
And I verify that agent clients page is displayed when I click on manage shares back button

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|



Scenario Outline: Agent_Client_TC14: Verify that Generate & Download COI button is getting displayed on manage shares page
Given I login to the certificial with <userName> and <password>
When I click on manage shares button for client <clientName>
And I verify that "Generate & Download COI" button is getting displayed 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|



Scenario Outline: Agent_Client_TC15: Verify that All Attachments button is getting displayed on manage shares page
Given I login to the certificial with <userName> and <password>
When I click on manage shares button for client <clientName>
And I verify that "All Attachments" button is getting displayed 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|



Scenario Outline: Agent_Client_TC16: Verify that Download Company History button is getting displayed on manage shares page
Given I login to the certificial with <userName> and <password>
When I click on manage shares button for client <clientName>
And I verify that "Download Company History" button is getting displayed 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|



Scenario Outline: Agent_Client_TC17: Verify that Issue COI button is getting displayed on manage shares page
Given I login to the certificial with <userName> and <password>
When I click on manage shares button for client <clientName>
And I verify that "Issue COI" button is getting displayed 

Examples:
|userName|password|clientName|
|akashxor22@gmail.com_test|zaq1ZAQ!|Test Company|



Scenario Outline: Agent_Client_TC17: Verify that Issue COI button is getting displayed on manage shares page
Given I login to the certificial with <userName> and <password>
And I verify that "Add New Policy" button is getting displayed 

Examples:
|userName|password|
|akashxor22@gmail.com_test|zaq1ZAQ!|