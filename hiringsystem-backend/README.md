# Human Resources Management System

*In this study, there is an example for human resources management system. 
In addition, spring boot, swagger and mernis person verification systems were used in this study.
Mernis verification system is a system used for Turkey. 
A person's year of birth, national identity number, first name and last name are given. <br/> With this information, person verification can be done. 
([Mernis verification system](https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL)) <br/>
Database created with PostgreSQL.* <br/> <br/> Updates will be made over time. After finishing the back-end part, it will be used with React for front-end. <br/>

### Objectives of the project; <br/>
#### Req 1: Job Seekers must be able to register in the system.
##### Accept conditions:
- During registration, the user is asked for name, surname, national identity number, year of birth, e-mail, password, password repeat information.
- All fields are required. The user is informed.
- After the Mernis verification, the it is registered at the system.
- If the validation is not valid, the user is notified.
- If there is a previously registered e-mail or national identity number, registration is not done. The user is informed.
- Email verification is required for registration. (There really is no need to send an email.) <br/>

#### Req 2: Employers must be able to register in the system.
##### Accept conditions:
- During registration, the user is asked for company name, website, e-mail with the same domain as the website, phone, password, password repeat information. The purpose here is to prevent non-companies from joining the system.
- All fields are required. The user is informed.
- Company records are verified in two ways. Email verification is required for registration to take place. Approval from HRMS staff is required.
- If there is a previously registered e-mail, registration is not done. The user is informed. <br/>
#### Req 3: General job position names can be added to the system. For example Software Developer, Software Architect.
##### Accept conditions:
- These positions cannot be repeated. The user is informed. <br/>
#### Req 4: Employers can be listed. (Whole list only) <br/>
#### Req 5: Job seekers can be listed. (Whole list only) <br/>
#### Req 6: Job positions can be listed. (Whole list only) <br/>

*ERD diagram of the database created with PostgreSQL:* <br/>
![ERD Diagram](https://github.com/RecepFatih/JavaReactCamp/blob/main/hiringsystem/ERDdiagram.png)

*All written codes have been tried to be made in accordance with SOLID principles.*
