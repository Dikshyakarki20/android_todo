# android_todo

## Introduction

Todolist is an android application which is designed to keep record of activities or work people need to do. As human beings are being so busy in their life they need an application to remind what work they need to complete. Todolist app is designed so people don't need to remember all their work they need to do. foreg: assignment deadline, meeting they should attend and other.They keep the record of the work with date they must complete.

<hr>

## Features

Some basic features of this ToDolist include add new tasks, edit an existing task, delete an existing task by swiping the task, set the task priority to high, medium or low. Besides these other features are mentioned below:

- Register and Login 

- Speech to text for adding description of task

- Menu that display About page

-  Swipe Navigation tab

- Calendar 

- TimePicker

## RoomDatabase

Room uses annotation with three main components

- @Entity - to define database table

- @DAO - to provide an API for reading and writing data

- @Database - represents a database holder

## Framework Used

### Model View View Model (MVVM) 

 MVVM is a structural design pattern that seperates objects into three distinct groups:

#### Models

##### Database

- App Database

- DateConverter

- TaskDao

- TaskEntry

- UserDao

- UserDatabase

- UserEntry

##### Adapter

- TabAdapter

- TaskAdapter

#### Views

<i>Fragment </i>

 - ProfileFragment
  
 - ReminderFragment
 
 - TodolistFragment
 
 <i>Activity</i>
 
 - AddEditTaskActivity
 
 - LoginActivity
 
 - RegisterActivity
 
 - MainActivity
 
 - MainFragment

#### View Models

- AddEditTaskViewModel

- AddEditTaskViewModelFactory

- TaskDateViewModel

- MainActivityViewModel

## Layout 

- Relative Layout

- Linear Layout

- Scroll View

- Frame Layout

## Coding Standards Used

- Proper Packaging

- Proper Commenting

- Proper Naming Convention

- XML Naming Convention

## Features

Login          |  Register                       | Calender             |  Time
:----------------------------:|:--------------------------------------:|:----------------------:|:-----------------
<img src = "Screenshot/Login.png" width="200" height="360">  |  <img src = "Screenshot/Register.png" width="200" height="360">        |  <img src = "Screenshot/Calender.png" width="200" height="360">  | <img src = "Screenshot/Time.png" width="200" height="360">

Swipe Views in Tabs         |  Swipe to Delete                     |  About            |  Logout
:----------------------------:|:--------------------------------------:|:----------------------:|:-----------------
<img src = "Screenshot/SwipeTab.gif" width="200" height="360">  |  <img src = "Screenshot/SwipetoDelete.gif" width="200" height="360"> | <img src = "Screenshot/AboutPage.gif" width="200" height="360">  | <img src = "Screenshot/Logout.gif" width="200" height="360">

AddTask         |  UpdateTask       |             
:----------------------------:|:--------------------------------------:|
<img src = "Screenshot/AddTask.gif" width="200" height="360">  |  <img src = "Screenshot/Update.gif" width="200" height="360">

<hr>

## Validation 

### Register

User-Name Validate      |  Email Validate                    |  Password Validate            |  Re-Password Validate
:----------------------------:|:--------------------------------------:|:----------------------:|:-----------------
<img src = "Screenshot/UsernameValidate.png" width="200" height="360">  |  <img src = "Screenshot/FieldValidate.png" width="200" height="360"> | <img src = "Screenshot/PasswordFieldValidate.png" width="200" height="360">  | <img src = "Screenshot/Repassvali.png" width="200" height="360">


Un-Match Password      |
:----------------------------:|
<img src = "Screenshot/passdidn'tmatch.png" width="200" height="360"> 

### Login

User-Name Validate      |  Password Validate                   |  Non Register User |
:----------------------------:|:--------------------------------------:|:----------------------:|
<img src = "Screenshot/UserField.png" width="200" height="360">  |  <img src = "Screenshot/PasswordField.png" width="200" height="360"> | <img src = "Screenshot/NotMatch.png" width="200" height="360"> 

## ToDoList App Guide

Home Page      |                           Login Page                   |  Register Page            | UserLogin
:----------------------------:|:--------------------------------------:|:----------------------:|:-----------------
<img src = "Screenshot/Home.png" width="200" height="360">  |  <img src = "Screenshot/Login.png" width="200" height="360"> | <img src = "Screenshot/Register1.png" width="200" height="360">  | <img src = "Screenshot/Login1.png" width="200" height="360">

ToDoPage       |                                  AddTask                   |  Task           |        Update
:----------------------------:|:--------------------------------------:|:----------------------:|:-----------------
<img src = "Screenshot/ToDoList.png" width="200" height="360">  |  <img src = "Screenshot/AddTask.png" width="200" height="360"> | <img src = "Screenshot/Task.png" width="200" height="360">  | <img src = "Screenshot/Update.png" width="200" height="360">



Profile                |           PriorityHigh               |     About          |        
:----------------------------:|:--------------------------------------:|:--------------------------------------:|
<img src = "Screenshot/Profile.png" width="200" height="360">  |  <img src = "Screenshot/ImportantTab.gif" width="200" height="360"> | <img src = "Screenshot/About.png" width="200" height="360">

## Documentation

### MVVM

MVVM is one of the architectural patterns which enhances separation of concerns, it allows separating the user interface logic from the business (or the back-end) logic. Its target (with other MVC patterns goal) is to achieve the following principle “Keeping UI code simple and free of app logic in order to make it easier to manage”.MVVM stands for Model, View, ViewModel.

Model: This holds the data of the application. It cannot directly talk to the View. Generally, it’s recommended to expose the data to the ViewModel through Observables.
View: It represents the UI of the application devoid of any Application Logic. It observes the ViewModel.
ViewModel: It acts as a link between the Model and the View. It’s responsible for transforming the data from the Model. It provides data streams to the View. It also uses hooks or callbacks to update the View. It’ll ask for the data from the Model.

<img src = "Screenshot/MVVM.png" height ="400" width = "350"> 




## References












