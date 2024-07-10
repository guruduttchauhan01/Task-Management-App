# Task Management Application
## Overview
This is a Task Management Application that allows users to create, read, update, and delete tasks. The application includes a front-end built with React and a back-end built with Spring Boot. The application is connected to a MySQL database.

## Features
+ **Create Task:** Users can add new tasks with a title, description, due date, and status.
+ **Read Tasks:** Users can view a list of all tasks on the landing page.
+ **Update Task:** Users can edit existing tasks.
+ **Delete Task:** Users can delete tasks.
+ **Status Update:** Users can update the status of tasks directly from the task list without navigating to the task details page.
+ **Responsive Design:** The application is usable on both desktop and mobile devices.

## Technology Stack
+ **Front-end:** React, Axios, React Router
+ **Back-end:** Spring Boot, Hibernate, MySQL
+ **Build Tools:** Maven

## Prerequisites
+ Java 17
+ Node.js
+ MySQL
+ Maven

## Getting Started
### 1. Clone the Repository

```bash
git clone https://github.com/guruduttchauhan01/Task-Management-App.git
cd Task-Management-App
```

### 2. Set Up the Back-end
#### 2.1 Configure MySQL Database
1. Create a MySQL database.

2. Update the application.properties file in the src/main/resources directory with your database details.
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your-db-name
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```
#### 2.2 Build and Run the Back-end
```bash
./mvnw clean package
java -jar target/task-management-app.jar
```
### 3. Set Up the Front-end
#### 3.1 Install Dependencies
Navigate to the client directory and install the dependencies:

```
cd client
npm install
```

#### 3.2 Run the Front-end
```bash
npm start
```

## API Endpoints
### Task Endpoints
+ Retrieve All Tasks
  + GET /api/tasks
+ Create a New Task
  + POST /api/tasks
  + Request Body:
```json
{
  "title": "Task Title",
  "description": "Task Description",
  "dueDate": "2024-07-15",
  "status": "Open"
}
```

+ Retrieve a Single Task
  + GET /api/tasks/{id}
+ Update an Existing Task
  + PUT /api/tasks/{id}
  + Request Body:
```json
{
  "title": "Updated Task Title",
  "description": "Updated Task Description",
  "dueDate": "2024-07-20",
  "status": "On Progress"
}
```
+ Delete a Task
  + DELETE /api/tasks/{id}
+ Update Task Status
  + PATCH /api/tasks/{id}/status?status=NewStatus
## Directory Structure
```plaintext
task-management-app/
├── client/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   │   ├── Header/
│   │   │   │   ├── Header.js
│   │   │   │   └── Header.css
│   │   │   ├── HomePage/
│   │   │   │   └── Home.js
│   │   │   ├── TaskForm/
│   │   │   │   ├── TaskForm.js
│   │   │   │   └── TaskForm.css
│   │   │   ├── EditTask/
│   │   │   │   └── EditTask.js
│   │   │   └── TaskList/
│   │   │       ├── TaskList.js
│   │   │       └── TaskList.css
│   │   ├── App.js
│   │   └── index.js
│   ├── package.json
│   └── ...
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/taskmanagement/
│   │   │       ├── controller/
│   │   │       │   └── TaskController.java
│   │   │       ├── model/
│   │   │       │   └── Task.java
│   │   │       ├── repository/
│   │   │       │   └── TaskRepository.java
│   │   │       └── TaskManagementApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── ...
├── pom.xml
└── README.md
```

