# Student Management System API 🎓

A REST API built with Spring Boot for managing students.

## Tech Stack
- Java 21
- Spring Boot 4.0.6
- Spring Data JPA
- MySQL (Docker)
- Lombok
- Maven

## Features
- ✅ Create Student
- ✅ Get All Students
- ✅ Get Student By ID
- ✅ Update Student
- ✅ Delete Student
- ✅ Search By Course

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| POST | /api/students | Create student |
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get by ID |
| PUT | /api/students/{id} | Update student |
| DELETE | /api/students/{id} | Delete student |
| GET | /api/students/search?course= | Search by course |

## Project Structure

src/main/java/com/abhinav/student_management/
├── model/
│   └── Student.java
├── repository/
│   └── StudentRepository.java
├── service/
│   └── StudentService.java
├── controller/
│   └── StudentController.java
└── StudentManagementApplication.java

## Prerequisites
- Java 21
- Docker
- Maven

## Setup and Run

Step 1 - Start MySQL container:
docker start my-mysql

Step 2 - Create database (first time only):
CREATE DATABASE studentdb;

Step 3 - Configure application.properties with your DB credentials

Step 4 - Run StudentManagementApplication.java in IntelliJ

Step 5 - API is live at http://localhost:8080

## Sample Request

POST /api/students
{
  "name": "Abhinav",
  "email": "abhinav@example.com",
  "course": "Java",
  "age": 21
}

Response:
{
  "id": 1,
  "name": "Abhinav",
  "email": "abhinav@example.com",
  "course": "Java",
  "age": 21
}

## Author
Abhinav - https://github.com/Itss-Abhinav
