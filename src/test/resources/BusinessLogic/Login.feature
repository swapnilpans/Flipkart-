Feature: Login functionality
Background: User is successsfully logged in

Given user open "Chrome" browser 
Given user open url 

@SmokeTest
Scenario: Login functionality with valid data
When user click on cancel button
When user move on login dropdown
When user able to click My profile
When user enter "Swapnilp9529@gmail.com" as username 
When user enter password as"9762589258"as password
When user click on login button
Then Application shows user profile


