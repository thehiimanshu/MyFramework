@Certificial_Page_Navigation
@Requester_Page_Navigation   
Feature: Navigate to the various certificial Pages

Scenario Outline: Requester_Page_Navigation_TC01: Verify the certificial Dashboard page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Dashboard" Page with <DashboardURL>

Examples:
|userName|password|DashboardURL|
|acuity@certificial.com_test|zaq1ZAQ!|https://test.certificial.com/app/dashboard|



Scenario Outline: Requester_Page_Navigation_TC02: Verify the Request Policy Page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Request Policy" Page with <RequestPolicyURL>

Examples:
|userName|password|RequestPolicyURL|
|acuity@certificial.com_test|zaq1ZAQ!|https://test.certificial.com/app/request-policies|



Scenario Outline: Requester_Page_Navigation_TC03: Verify the Policy templates Page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Templates" Page with <TemplatesURL>

Examples:
|userName|password|TemplatesURL|
|acuity@certificial.com_test|zaq1ZAQ!|https://test.certificial.com/app/templates|



Scenario Outline: Requester_Page_Navigation_TC04: Verify the My Profile Page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "My Profile" Page with <MyProfileURL>

Examples:
|userName|password|MyProfileURL|
|acuity@certificial.com_test|zaq1ZAQ!|https://test.certificial.com/app/myProfile|

