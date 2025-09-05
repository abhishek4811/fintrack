# FinTrack

FinTrack is a **full-stack microservices-based finance tracker** project.  

## Project Structure

- **user-service**: Spring Boot service for user authentication and profile management.  
- **transaction-service**: Spring Boot service to handle financial transactions.  
- **analytics-service**: Spring Boot service for reporting and analytics.  
- **notification-service**: Spring Boot service for emails/SMS notifications.  
- **frontend-app/fintrack-ui**: Angular frontend application.  
- **shared-libs**: Common libraries used by multiple services.

## Setup

1. Clone the repo
2. Run `docker-compose up -d` to start PostgreSQL & RabbitMQ
3. Build backend & frontend using CI/CD workflow

## Action
Trigger CI/CD workflow