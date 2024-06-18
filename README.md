# User Regesteration

This is a simple RESTful API for user registration and fetching user details using Spring Boot.

## Endpoints

1. **Register User**
    - **URL**: `/api/user/register`
    - **Method**: `POST`
    - **Request Body**:
        ```json
        {
            "username": "your_username",
            "email": "your_email",
            "password": "your_password"
        }
        ```
    
2. **Fetch User**
    - **URL**: `/api/user/fetch`
    - **Method**: `GET`
    - **Query Parameter**: `username`
  

## Running the Application

### Prerequisites

- Java 11 or higher
- Maven

### Steps to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/Abhaytomar2004/User-Regesteration
    cd User-Regesteration
    ```

2. Build and run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

3. The application will start on `http://localhost:8080`.
### CURL Commands

1. **Register User**:
    ```bash
    curl -X POST http://localhost:8080/api/user/register -H "Content-Type: application/json" -d '{"username":"your_username","email":"your_email","password":"your_password"}'
    ```

2. **Fetch User**:
    ```bash
    curl -X GET http://localhost:8080/api/user/fetch?username=your_username
    ```

## Exception Handling

- `UserAlreadyExistsException`: Thrown when a user with the same username already exists.
- `UserNotFoundException`: Thrown when the requested user is not found.
- `GlobalExceptionHandler`: Handles all exceptions and returns appropriate HTTP status codes and messages.

## Repository URL

[GitHub Repository](https://github.com/Abhaytomar2004/User-Regesteration)
