# User Service for the Box Academy

Welcome to the User Service for the Box Academy! This service provides a convenient interface for user registration, authentication using JWT tokens, and role-based authorization.

## Prerequisites

Before executing the commands, make sure you have Maven and PostgreSQL installed on your machine.

You also need to connect to PostgreSQL.

You can create the database using the terminal with the following command:

```bash
psql -U postgres -c "CREATE DATABASE user_auth_service_db;"
```

## Application Launch

1. To download the repository from GitHub, use the following command in your terminal:

    ```bash
    git clone git@github.com:WomenInTechMentorProgramBackend/user-service.git
    ```

2. Navigate to the project folder:

    ```bash
    cd user-service
    ```

3. Build the project with Maven:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

The application will be available at `http://localhost:8080`.

## Swagger Documentation

Once the application is running, you can view the Swagger UI at:

```http://localhost:8080/swagger-ui/index.html```