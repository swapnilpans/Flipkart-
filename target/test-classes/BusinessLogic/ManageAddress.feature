Feature: Manage Address Functionality
Background: User is successsfully logged in

Given user open "Chrome" browser 
Given user open url 
Given user click on cancel button
Given user move on login dropdown
Given user able to click My profile
Given user enter "Swapnilp9529@gmail.com" as username 
Given user enter password as"9762589258"as password
Given user click on login button

@SmokeTest
Scenario: Manage addressess Functionality with valid data

When user click on Manage addresses
When user click on Add a new address
When user enter "Swapnil Pansare" as a name
When user enter "9370831323" as mobile number
When user enter "411015" as pincode
When user enter "Dighi" as Locality
When user enter "Bharat Mata nagar " as address
When user enter "Pune" as Loaclity
When user enter "9762589258" as Alternate phone
When user select Home as a aadress type
When user click on save button
Then application shows new address added successfully










