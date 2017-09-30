# Forum
## Description
Internet forum [in this case about programming language Java] powered by Spring Framework and MySQL. This web application enables inter alia: adding topics and answers, as well as browsing, editing or deleting some of them.
## Technologies
- Java:
  - Spring Framework:
    - Spring MVC:
      - application-level on the basis on design pattern: model-view-controller
      - using methods "get" and "post" with parameterising URLs which is typical of REST API
    - Spring Data:
      - using JPQL and ready-made methods from `JpaRepository` to creating, reading, updating and deleting data
      - implementation of native queries
    - Spring Security:
      - own login form with authentication of users on the basis of database
      - restricting access to some pages for offline users
      - protection against cross-site request forgery
      - encoding passwords
    - Spring Boot:
      - automatic configuration and launching application 
  - JPA & Hibernate:
    - specifying relations between entities in database and parameters of columns in tables
  - Java 8 SE:
    - Optionals, LocalDateTime
- HTML:
  - Thymeleaf
  - data validation in login form and registration form
  - semantic elements from HTML5
- CSS:
  - Materialize
## Features
- Possibility joining to the Java Forum and adding personal data to database: ![register](https://user-images.githubusercontent.com/21959354/30806138-cf444d24-a1f4-11e7-926f-aecda2da8696.png)
- Summary of activity on forum expressed in number of topics or answers and hyperlinks to them: ![profile](https://user-images.githubusercontent.com/21959354/30806136-cf2b1e30-a1f4-11e7-889d-e06ccdabbb0f.png)
- Review topics with redirecting to each of them and to each of their authors: ![topics](https://user-images.githubusercontent.com/21959354/30806140-cf53bb92-a1f4-11e7-92f2-518c2765ed9d.png)
- Browsing a topic with the possibility of adding/deleting answer, and setting it as useful: ![topic](https://user-images.githubusercontent.com/21959354/30806139-cf53cb46-a1f4-11e7-8c21-e16221205e6a.png)
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
      - templates:
        - layout:
          - offline.html
          - online.html
        - answers.html
        - error.html
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
The content of questions and answers on the screenshots comes from [Stack Overflow](https://stackoverflow.com/).
I was faced with those problems during creating application.
## License
MIT