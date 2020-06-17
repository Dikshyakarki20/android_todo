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

## Development

1. Master

1.1 LoginRegister Branch

1.2 Navigation  Branch 

1.3 AddTodoList Branch

1.4 SpeechtoText Branch

1.5 Menu Branch

1.6 Profile Branch

1.7 Calendar Branch

1.8 Reminder Branch

1.9 Timepicker Branch

<img src="Screenshot/branch.png" height="500" width="900">


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
<img src = "Screenshot/Profile.png" width="200" height="360">  |  <img src = "Screenshot/ImportantTab.gif" width="200" height="360"> | <img src = "Screenshot/About.png"  width="200" height="360">

## Documentation

### MVVM

MVVM is one of the architectural patterns which enhances separation of concerns, it allows separating the user interface logic from the business (or the back-end) logic. Its target (with other MVC patterns goal) is to achieve the following principle “Keeping UI code simple and free of app logic in order to make it easier to manage”.MVVM stands for Model, View, ViewModel.

Model: This holds the data of the application. It cannot directly talk to the View. Generally, it’s recommended to expose the data to the ViewModel through Observables.
View: It represents the UI of the application devoid of any Application Logic. It observes the ViewModel.
ViewModel: It acts as a link between the Model and the View. It’s responsible for transforming the data from the Model. It provides data streams to the View. It also uses hooks or callbacks to update the View. It’ll ask for the data from the Model.

<img src = "Screenshot/MVVM.png" height ="400"  width = "350"> 

### Activity LifeCycle

Activity has four states
active (or running at the top of the activity stack)
paused — alive in memeory, visible, lost focus
stopped — obscured by another activity, alive in memory, not visible
paused or stopped — may lead to destroyed and restarted to previous state

<img src = "Screenshot/ActivityLifecycle.png"  height ="400" width = "350"> 

### LifeCycle Class and Observer Pattern

<img src = "Screenshot/Lifecyclestages.png"  height ="400" width = "350"> 

### Activity

 Activity is a single screen in an app
 
 ### Intent
 
 Intent is a messaging object to request an action from another app component. 
 Intent is a message object to start an activity.

### Fragment

A Fragment represents a behaviour or a portion of user interface, has its own lifecycle, receives its own input events, and can be added or removed while the activity is running. Fragment can be dynamically loaded allowing for flexible UI.

<img src = "Screenshot/Activity.png"  height ="400" width = "350"> 


### ViewModel

ViewModel is lifecycle aware. ViewModel objects scoped to the lifecycle passed to the ViewModelProvider.

<img src = "Screenshot/ViewModelLifecycle.png"  height ="400" width = "350"> 


## References

- Navigation Components : https://developer.android.com/guide/navigation/navigation-getting-started

- Material Components : https://material.io/develop/android/docs/getting-started/

- Android Widget : https://developer.android.com/reference/android/widget/package-summary

- Creating Task Fragment:https://github.com/ebbi/TaskFragment]TodoViewModel:https://github.com/ebbi/TodoViewModel

- Todo app Model View ViewModel architecture:https://github.com/ebbi/TodoMVVM

- Entity : https://developer.android.com/reference/android/arch/persistence/room/Entity

- Options Menus  : https://developer.android.com/guide/topics/ui/menus

- Create views : https://developer.android.com/training/data-storage/room/creating-views

- Query for Database : https://developer.android.com/reference/android/arch/persistence/room/Query

- Calendar Builder for Todo : https://developer.android.com/reference/java/util/Calendar.Builder



## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)
[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)  


- **[MIT license](http://opensource.org/licenses/mit-license.php)**











