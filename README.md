# Fundamentals Project
This Project aims to utilize all of the technologies I have learnt so far in the academy. These include: Intellij, Jira, Springboot, CircleC & GCP. Below I will illustrate how I have applied these technologies I have learnt to create a web based application that conforms to the CRUD (Create, Read, Update and Remove) criteria. 


---
## Key Terms Dictionary

Here I have included some snapshots of the application working. 
(gif of its functionality)




---
## Contents
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

<p align="center">
  <img width="1400" height="500" src="https://i.imgur.com/KvHGeft.png">
</p>

## Creation

### Planning
This project in its very nature required an agile planning strategy. I learned the technologies required as I progressed through the project. This made it impossible for me to properly plan the project at the begining. Also, as I learnt the relevant technologies, previous ideas proved too difficult considering the time constraint. Because of this, I used Jira to plan my project, which allowed for easily digestable, agile planning. Below I have included a snapshot of my backlog taken just before I had my application up and running. 

<p align="left">
  <img width="383" height="250" src="https://i.imgur.com/7z9SHO2.png">
</p>

### Version Control
This project uses git as the version control system and Github as the Host. Intellij makes it incredibly easy to maintain an agile github repository with inbuilt functionality allowing commits and pushes to be made with one button. 

This has given me confidence that my application data is safe from deletion and made it easy for me to track changes to my code. Also, if I decide to go back to this project at a later date to implement further features I can rest assured that I can continue where I left off. 

### Cloud Server
The cloud server chosen to host this application for the meantime is GCP. This is because they offer a sufficient free trial for this kind of project and provide a highly secure and reliable server. 

### Database
mySQL- hosted on GCP

### Front-End
The front end of this project is written in HTML. While I would have liked to encorperate some CSS & make the web page more aesthetically pleasing, time constraints have prevent this.
This project utilizes Javascript to "glue" the front end to the back end. Allowing for user operated forms to add data to the back end databases. Additionally, Javascript has also allowed to me to "pass" the update and delete functionality onto the user.  

### Back-End
The back-end code for this project handles database manipulation; adding the CRUD functionality to the databases which are created by the user in the front-end. This project utilizes Java and other supporting technologies such as Maven & the Springboot library. 



The back-end also works to make my ERD diagram come into fruition. I used Springs inbuilt relationship functionality to create the Many-to-One and One-to-Many relationships needed between my User Details and User Word databases. 



Finally, it was used to initialise the web server & the relevant domain addresses, open on port 8080.


## System Integration


## Additional Information & Resources









