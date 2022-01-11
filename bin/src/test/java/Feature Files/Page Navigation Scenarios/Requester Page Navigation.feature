@Certificial_Page_Navigation
@Requester_Page_Navigation   
Feature: Navigate to the various certificial Pages

Scenario Outline: Verify the certificial Dashboard page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Dashboard" Page with <DashboardURL>

Examples:
|userName|password|DashboardURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/dashboard|



Scenario Outline:  Verify the Request Policy Page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Request Policy" Page with <RequestPolicyURL>

Examples:
|userName|password|RequestPolicyURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/request-policies|




Scenario Outline:  Verify the Policy templates Page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Templates" Page with <TemplatesURL>

Examples:
|userName|password|TemplatesURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/templates|



Scenario Outline:  Verify the My Profile Page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "My Profile" Page with <MyProfileURL>

Examples:
|userName|password|MyProfileURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/myProfile|




