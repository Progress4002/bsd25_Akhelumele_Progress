# iSupervison

A intellije based programm that let's users sign in, based on their profile they can either register for a project or remove or create a new project.

---

## Installation

It's important to have a JRE to run the code. 
1. Download the files
2. Open the file in your JRE 
3. Enter application.java 

## Recommanded IDE

[IntelliJ](https://blog.jetbrains.com/idea/2025/07/intellij-idea-2025-2-beta/) IDEA is an Integrated Development Environment (IDE) designed to maximize developer productivity, particularly for Java and Kotlin
![screenshot](https://i.imgur.com/9mA3uUh.jpeg)

## iSuperviosn function

Your are welcomed with a sign in screen in the file that you should have already downloaded there are four files 

- user.csv(which includes all the users personal informations 
their Id and password)
- topic.csv(all topics that are available)
- student.csv(all students and their id)
- enrollment.csv(and topics each student is enrolled to)

Student can register for a topic:

1. The topic has to be free 
2. The student can only register for a bachelor topic if 
project has been done before and for a masters topic if bachelor has been done 
3. Student can be removed from a topic by admin

Admin & assistant :

- Admin function
  - can remove student from topic
  - checks if enrollments are valid
- assistant function
  - can create new topics
  - can see all the topics
