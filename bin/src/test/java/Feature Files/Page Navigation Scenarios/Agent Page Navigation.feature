@Certificial_Page_Navigation
@Agent_Page_Navigation   
Feature: Navigate to the various certificial Pages


Scenario Outline: Verify the Agent Clients page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Clients" Page with <ClientsURL>

Examples:
|userName|password|ClientsURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/agent-clients|



Scenario Outline: Verify the Agent Pending Approvals page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Pending Approvals" Page with <PendingApprovalsURL>

Examples:
|userName|password|PendingApprovalsURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/agent-pending-approval|




Scenario Outline: Verify the Agent Open Requests page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Open Requests" Page with <OpenRequestsURL>

Examples:
|userName|password|OpenRequestsURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/agent-insured-requests|




Scenario Outline: Verify the Agent Notifications page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Notifications" Page with <NotificationsURL>

Examples:
|userName|password|NotificationsURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/notifications|



Scenario Outline: Verify the Agent My profile page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Agent My profile" Page with <AgentMyprofileURL>

Examples:
|userName|password|AgentMyprofileURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/myProfile|


Scenario Outline: Verify the Agent Pending Users page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Pending Users" Page with <PendingUsersURL>

Examples:
|userName|password|PendingUsersURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://test.certificial.com/app/my-pending-users|



Scenario Outline: Verify the Agent The difference between user and agent page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "The difference between user and agent" Page with <AgentGuidedAssistanceURL>

Examples:
|userName|password|AgentGuidedAssistanceURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://support.certificial.com/portal/en/kb/articles/the-difference-between-user-and-agent|



Scenario Outline: Verify the Agent Registering with an-existing company or a new company page URL endpoint
Given I login to the certificial with <userName> and <password>
Then I verify "Registering with an-existing company or a new company" Page with <AgentGuidedAssistanceURL>

Examples:
|userName|password|AgentGuidedAssistanceURL|
|akashxor2023@gmail.com|zaq1ZAQ!|https://support.certificial.com/portal/en/kb/articles/registering-with-an-existing-company-or-a-new-company|

