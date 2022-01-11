@Requester_Search&Filter   
Feature: Requester Dashboard Search and Filter Functionality


Scenario Outline: Requester_Dashboard_Search_TC01: Verify that company is Searched on first list and clicking on company name gives details in right panel
Given I login to the certificial with <userName> and <password>
When I enter <CompanyName> in dashboard search box 
Then I verify that the <CompanyName> is searched successfully 
And I verify that the <CompanyName> details is displayed in right panel when I click on company label

Examples:
|userName|password|CompanyName|
|atxor1.1@gmail.com|zaq1ZAQ!|Western Corp|



Scenario Outline: Requester_Dashboard_Search_TC02:  Verify that company is Searched on any list and clicking on company name gives details in right panel
Given I login to the certificial with <userName> and <password>
When I enter <CompanyName> in dashboard search box 
Then I verify that the <CompanyName> is searched successfully 
And I verify that the <CompanyName> details is displayed in right panel when I click on company label

Examples:
|userName|password|CompanyName|
|atxor1.1@gmail.com|zaq1ZAQ!|Western Corp|


Scenario Outline: Requester_Dashboard_Search_TC03: Verify that all companies are Searched with some common text value
Given I login to the certificial with <userName> and <password>
When I enter <CompanyName> in dashboard search box 
Then I verify that the <CompanyName> is searched successfully 

Examples:
|userName|password|CompanyName|
|atxor1.1@gmail.com|zaq1ZAQ!|Corp|


Scenario Outline: Requester_Dashboard_Filter_TC01: Verify that the filter menu is displayed when Hover on filter button
Given I login to the certificial with <userName> and <password>
When I hover on filter button
Then I verify that the filter menu is displayed with following filter options
|Policies Expiring|
|Policies by Status|
|Policies by Company Record|
|Policies by Endorsements|
|Company Status|
|Compliance Review|

Examples:
|userName|password|
|atxor1.1@gmail.com|zaq1ZAQ!|


@demo
Scenario Outline: Requester_Dashboard_Filter_TC02: Verify that the companies are filtered for Complete Compliance Review option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Complete" option from  "Compliance Review" filter menu
Then I verify that the "Complete" filter for "Compliance Review" is applied successfully 

Examples:
|userName|password|
|atxor1.1@gmail.com|zaq1ZAQ!|


Scenario Outline: Requester_Dashboard_Filter_TC03: Verify that the companies are filtered for Pending Compliance Review option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Pending" option from  "Compliance Review" filter menu
Then I verify that the "Pending" filter for "Compliance Review" is applied successfully 

Examples:
|userName|password|
|atxor1.1@gmail.com|zaq1ZAQ!|


Scenario Outline: Requester_Dashboard_Filter_TC04: Verify that the companies are filtered for Policies by Company Record option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select <CompanyName> option from  "Compliance Review" filter menu
Then I verify that the "Pending" filter for "Policies by Company Record" is applied successfully 
Then I verify that the <CompanyName> is searched successfully 
And I verify that the <CompanyName> details is displayed in right panel when I click on company label

Examples:
|userName|password|
|atxor1.1@gmail.com|zaq1ZAQ!|
