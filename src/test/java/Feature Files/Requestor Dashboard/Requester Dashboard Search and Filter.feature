@functional_smoke
@Requester_Dashboard
Feature: Requester Dashboard Search and Filter Functionality

@Requester_Search
Scenario Outline: Requester_Dashboard_TC01: Verify that company is Searched on first list and clicking on company name gives details in right panel
Given I login to the certificial with <userName> and <password>
When I enter <CompanyName> in search box 
Then I verify that the <CompanyName> is searched successfully 
And I verify that the <CompanyName> details is displayed in right panel when I click on company label

Examples:
|userName|password|CompanyName|
|acuity@certificial.com_test|zaq1ZAQ!|RMH Systems|


@Requester_Search
Scenario Outline: Requester_Dashboard_TC02:  Verify that company is Searched on any list and clicking on company name gives details in right panel
Given I login to the certificial with <userName> and <password>
When I enter <CompanyName> in search box 
Then I verify that the <CompanyName> is searched successfully 
And I verify that the <CompanyName> details is displayed in right panel when I click on company label

Examples:
|userName|password|CompanyName|
|acuity@certificial.com_test|zaq1ZAQ!|Tri Lite Inc|


@Requester_Search
Scenario Outline: Requester_Dashboard_TC03: Verify that all companies are Searched with some common text value
Given I login to the certificial with <userName> and <password>
When I enter <CompanyName> in search box 
Then I verify that the <CompanyName> is searched successfully 

Examples:
|userName|password|CompanyName|
|acuity@certificial.com_test|zaq1ZAQ!|Corporation|



Scenario Outline: Requester_Dashboard_TC04: Verify that the filter menu is displayed when Hover on filter button
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
|acuity@certificial.com_test|zaq1ZAQ!|


Scenario Outline: Requester_Dashboard_TC05: Verify that the companies are filtered for Complete Compliance Review option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Complete" option from  "Compliance Review" filter menu
Then I verify that the "Complete" filter for "Compliance Review" is applied successfully 

Examples:
|userName|password|
|acuity@certificial.com_test|zaq1ZAQ!|


Scenario Outline: Requester_Dashboard_TC06: Verify that the companies are filtered for Pending Compliance Review option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "Pending" option from  "Compliance Review" filter menu
Then I verify that the "Pending" filter for "Compliance Review" is applied successfully 

Examples:
|userName|password|
|acuity@certificial.com_test|zaq1ZAQ!|


Scenario Outline: Requester_Dashboard_TC07: Verify that the companies are filtered for Policies by Company Record option
Given I login to the certificial with <userName> and <password>
When I hover on filter button
And I select "RMH Systems" option from  "Policies by Company Record" filter menu
Then I verify that the <CompanyName> is searched successfully 

Examples:
|userName|password|CompanyName|
|acuity@certificial.com_test|zaq1ZAQ!|RMH Systems|


Scenario Outline: Requester_Dashboard_TC08: Verify that Reset all filter buttons reset all the filters
Given I login to the certificial with <userName> and <password>
When I hover on filter button
Then I verify that reset button is "disabled" when "no" filter is selected
And I verify that reset button is "enabled" when "any" filter is selected

Examples:
|userName|password|
|acuity@certificial.com_test|zaq1ZAQ!|
