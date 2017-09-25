# Forum
## Description
Internet forum [in this case about programming language Java] powered by Spring Framework.
## Technologies
- Java:
  - Spring Framework:
    - Spring MVC:
      - application-level on the basis on design pattern: model-view-controller
      - using methods "get" and "post" with parameterising URLs which is typical of REST API
    - Spring Data:
      - implementation of native queries
      - using JPQL and ready methods from repository to creating, reading, updating and deleting data
    - Spring Security:
      - own login form with authentication of users on the basis of database
      - restricting access to some pages for offline users
      - encoding passwords
    - Spring Boot:
      - automatic configuration and launching application 
  - JPA & Hibernate:
    - specifying relations between entities in database and parameters of columns in tables
  - Java 8 SE:
    - Optionals
- HTML:
  - Thymeleaf
  - Data validation in login form and registration form
  - Semantic elements from HTML5
- CSS:
  - Materialize
## Features
- [TODO]
## Software tools
- IntelliJ IDEA 2017.2.4
- Gradle 3.5.1
- XAMPP [MySQL]
## Structure project's
- src:
  - main:
    - java/com/plkpiotr/forum:
      - configuration:
        - AdditionalLoginConfiguration.java
        - SecurityConfiguration.java
      - controllers:
        - AnswersController.java
        - IndexController.java
        - LoginController.java
        - ProfileController.java
        - RegisterController.java
        - TopicController.java
        - TopicsController.java
      - entities:
        - Answer.java
        - Topic.java
        - User.java
      - repositories:
        - AnswerRepository.java
        - TopicRepository.java
        - UserRepository.java
      - ForumApplication.java [main class]
    - resources:
      - static/js:
        - backToTheSamePlace.js
      - templates:
        - layout:
          - offline.html
          - online.html
        - answers.html
        - index.html
        - login.html
        - profile.html
        - register.html
        - topic.html
        - topics.html
      - application.properties
  - test/java/com/plkpiotr/forum
    - ForumApplicationTests.java [TODO]
- build.gradle
## Comments
[TODO]
## License
MIT
