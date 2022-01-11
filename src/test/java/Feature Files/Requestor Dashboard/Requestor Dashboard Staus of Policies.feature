Feature: Requestor Dashboard Staus of Policies Functionality


Scenario Outline: Requester_Dashboard_Search_TC01: Verify that company status is corresponding to the combine status of all policies
Given I login to the certificial with <userName> and <password>
When I enter <CompanyName> in dashboard search box 
Then I verify that the <CompanyName> is searched successfully 
And I verify that the <CompanyName> details is displayed in right panel when I click on company label
When I select project from project dropdown  
Then I verify that company status is corresponding to the combine status of all policies
|Priority|Policy|
|1|Processing|
|2|Expired|
|3|Canceled|
|4|Compliance|
|5|Unverified|
|6|Rejected|
|7|Requires Review|
|8|Expiring|
|9|Reviewed|
|10|Verified|
Examples:
|userName|password|CompanyName|
|acuity@certificial.com_test|zaq1ZAQ!|Western Corp|