# Forum
## Description
Internet forum powered by Spring Framework [ongoing]
## Technologies
- [TODO]
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
        - RepositoryInitializer.java
        - SecurityConfiguration.java
      - controller:
        - IndexController.java
        - LoginController.java
        - ProfileController.java
        - RegisterController.java
        - TopicController.java
        - TopicsController.java
      - entity:
        - Answer.java
        - Topic.java
        - User.java
      - repository:
        - AnswerRepository.java
        - TopicRepository.java
        - UserRepository.java
      - ForumApplication.java [main class]
    - resources:
      - static [TODO]
      - templates:
        - layout:
          - offline.html
          - online.html
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
