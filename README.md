# School Management Backend

A Spring Boot application for school management system.

## Features

- RESTful API endpoints
- H2 in-memory database
- JPA/Hibernate for data persistence
- Spring Boot 3.2.0
- Java 17

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## Running the Application

1. Navigate to the project directory:

   ```bash
   cd school/backend/spring
   ```

2. Build the project:

   ```bash
   mvn clean install
   ```

3. Run the application:

   ```bash
   mvn spring-boot:run
   ```

4. The application will start on `http://localhost:8080`

## Available Endpoints

- `GET /` - Welcome message
- `GET /health` - Health check
- `GET /h2-console` - H2 Database Console (username: sa, password: password)

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── school/
│   │           └── backend/
│   │               ├── SchoolBackendApplication.java
│   │               └── controller/
│   │                   └── HomeController.java
│   └── resources/
│       └── application.properties
```

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- H2 Database
- Spring Boot Starter Test
