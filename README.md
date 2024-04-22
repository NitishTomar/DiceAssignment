# DiceAssignment
This repository contains implementation of Forecast APIs using Rapid APIs.

To fetch the forecast for location using the Forecast APIs on Rapid APIs, user need to first register him/her self in the application using the register endpoint.

<img width="1308" alt="Screenshot 2024-04-22 at 1 26 36 PM" src="https://github.com/NitishTomar/DiceAssignment/assets/65938089/8784808a-7c46-4d55-ad20-5e5314cd3e11">


User then need to login into the application using the login endpoint with correct username which will generate the JWT token.

<img width="1308" alt="Screenshot 2024-04-22 at 1 26 53 PM" src="https://github.com/NitishTomar/DiceAssignment/assets/65938089/356b90ea-efd9-4333-a38d-31e9f7a53f52">

Then user can hit the forecast endpoint along with X-RapidAPI-Key and Authorization as header values.

RapidApplicationKey : X-RapidAPI-Key, which can be generated on the Rapid API website.             
Authorization  : JWT token generated on the above step.
<img width="653" alt="Screenshot 2024-04-15 at 2 50 50 PM" src="https://github.com/NitishTomar/DiceAssignment/assets/65938089/3089b6b5-bf4f-4b11-8b70-9a9d87d59062">
<img width="1319" alt="Screenshot 2024-04-22 at 2 11 28 PM" src="https://github.com/NitishTomar/DiceAssignment/assets/65938089/14e88818-d40f-4682-9df8-d6de5c5ec374">




**NOTE : Application uses the H2 database (In Memory database to store the user details).**
