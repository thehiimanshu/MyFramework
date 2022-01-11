@Certificial_Page_Navigation
@Insurer_Page_Navigation   
Feature: Navigate to the various certificial Pages


Scenario Outline: Verify the Insurer Shared Policies page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Share Policies" Page with <SharePoliciesURL>


Examples:
|userName|password|SharePoliciesURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/shared-policies|


Scenario Outline: Verify the Insurer My Policies page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "My Policies" Page with <MyPoliciesURL>


Examples:
|userName|password|MyPoliciesURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/my-policies|




Scenario Outline: Verify the Insurer Pending Requests page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Pending Requests" Page with <PendingRequestsURL>

Examples:
|userName|password|PendingRequestsURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/pending-requests|




Scenario Outline: Verify the Insurer My Policies page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Upgrade" Page with <UpgradeURL>

Examples:
|userName|password|UpgradeURL|
|atxor1.1@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/upgrade|

