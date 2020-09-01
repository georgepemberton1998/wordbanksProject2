# Fundamentals Project
This Project aims to utilize all of the technologies I have learnt so far in the academy. These include: Java, Jira, etc etc etc etc. Below I will illustrate how I have applied these technologies I have learnt to create a web based application that conforms to the CRUD (Create, Read, Update and Remove) criteria. 


---
## Key Terms Dictionary

Here I have included some snapshots of the application working. 
(gif of its functionality)




---
## Contents
- [Fundamentals Project](#fundamentals-project)
  - [Key Terms Dictionary](#key-terms-dictionary)
  - [Contents](#contents)
  - [Inspiration](#inspiration)
  - [Design](#design)
  - [Risk Assessment](#risk-assessment)
  - [Creation](#creation)
    - [Planning](#planning)
    - [Version Control](#version-control)
    - [Cloud Server](#cloud-server)
    - [Database](#database)
    - [Front-End](#front-end)
    - [Back-End](#back-end)
  - [Testing](#testing)
  - [System Integration](#system-integration)
  - [Additional Information & Resources](#additional-information--resources)

  
 ----
 ## Inspiration
 Upon starting the course as a cloud native trainee I quickly recoginsed that a lot of the key terms were going straight over my head, So I began noting down any words I was unfamiliar with, along with their definition. When this project was proposed, I recognised that a word bank fir the CRUD criteria perfectly. 

<p align="left">
  <img width="383" height="250" src="https://i.imgur.com/rFfg6L6.png">
</p>


 


## Design
The basic functionality of the application is very simple. The user can create an account, log into their account and create their own word bank. However, throughout this project I have used many tools to streamline production (See, [Planning](#planning), [Version Control](#Version-Control), etc.. ). 

While the MVP is quite simple, I have plans to implement additional features that I have not yet been able to implement. For example, <br> 1. The ability for the user to search for terms they have added.<br> 2. To have a seperate bank of pre-filled definitions accessable to the user.<br> 3. Improve the database structure so that the user can have two different wordbanks, the second one being used for words the user has grown comfortable with. The user would be able to "push" words between word banks. 
<p align="left">
  <img width="383" height="250" src="https://i.imgur.com/LcHQjx4.png">
</p>

## Risk Assessment
While in reality the risks associated with this project are relatively low, a risk assessment is still neccessary. Below is a collection of the risks I have identified with their corresponding likelihood & impact.

<p align="left">
  <img width="383" height="250" src="https://www.austinpetsalive.org/assets/placeholder/cat-placeholder-tall.svg">
</p>

## Creation


### Planning

### Version Control
This project uses git as the version control system and Github as the Host. Intellij makes it incredibly easy to maintain an agile github repository with inbuilt functionality allowing commits and pushes to be made with one button. 

This has given me confidence that my application data is safe from deletion and made it easy for me to track changes to my code. Also, if I decide to go back to this project at a later date to implement further features I can rest assured that I can continue where I left off. 

### Cloud Server
GCP - REASON WHY CHOSE GCPOVER AMASON _ BULLSHIT

### Database
mySQL- hosted on GCP

### Front-End
HTML & CSS - talk about ports n shit <br>
java script???

### Back-End
The back-end code for this project handles database manipulation; adding the CRUD functionality to the databases which are created by the user in the front-end. This project utilizes Java and other supporting technologies such as Maven & the Springboot library. 



The back-end also works to make my ERD diagram come into fruition. I used Springs inbuilt relationship functionality to create the Many-to-One and One-to-Many relationships needed between my User Details and User Word databases. 



Finally, it was used to initialise the web server & the relevant domain addresses, open on port 8080.

## Testing
unit testing in Junit 
live testing done with CIRCLECI


## System Integration


## Additional Information & Resources









