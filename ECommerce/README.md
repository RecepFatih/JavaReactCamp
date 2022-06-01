# e-commerce System Example for Layered Architecture 
*In this study, there is an example for e-commerce using layered architecture.* <br/>

### Objectives of the project; <br/>
#### Users should be able to become a member by entering their information into the system.
- It should be able to be a member of the system with basic user information, e-mail and password. Basic user information: first name, last name, email, password. All the basics are mandatory.
- Password must be at least 6 characters.
- The e-mail field must be in e-mail format.
- The e-mail must not have been used before.
- First and last name must be at least two characters.
- A confirmation e-mail should be sent to the user as a result of membership. (Simulation)
- When the verification link is clicked, the subscription should be completed. (Simulation) (Clicking on the link was defined as the entry 1 on the screen.)
- In case of failure or success, the user should be informed.
#### Users should be able to sign up to the system with their Google accounts. (Simulation)
- Other authorization services may be used in the future. (Configure the system as external service integration.) (Here google service is included in the system with adapter.)
- In case of failure or success, the user should be informed.
#### Users should be able to login to the system with their e-mail and password information.
- Email and password are required.
- In case of failure or success, the user should be informed. (The code cannot be used actively because the real data set is not used.) <br/> <br/>

*All written codes have been tried to be made in accordance with SOLID principles.*
