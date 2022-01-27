@Red_Bus_Search
Feature: Red Bus Search Functionality
Scenario Outline: Red_Bus_TC01: Verify that Red Bus is Searched successfully 
When I search buses from <From_City> to <To_City> for the date <Date>
Then I verify that the Red Bus is Searched successfully from <From_City> to <To_City>
Examples:
|From_City|To_City|Date|
|Mumbai|Pune|22 February 2022|





