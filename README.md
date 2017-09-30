# Kanban
## Description
Web application based on scheduling system **Kanban**. The program helps manage programming projects (and not just programming) on the basis of tasks divided into three category: "to do", "doing" and "done". Each of users belongs to one team and user can inter alia: start new project, add tasks to its, change tasks' category or remove them.
## Technologies
- Java:
  - Java EE:
    - JSP [view of websites]
    - JSTL [core, functions]
    - Expression Language
  - JPA & Hibernate:
    - JPQL [adding, updating, selecting and deleting queries]
    - specifying relations between entities in database and parameters of columns in tables
  - Java 8 SE:
    - Stream API
  - JavaDoc:
    - [Documentation](http://plkpiotr.ayz.pl/)
   - servlets, listeners, annotations, hashing passwords
- HTML:
  - Bootstrap 3.0.3 [Responsive Web Design]
  - data validation in login form and registration form
  - semantic elements from HTML5
- CSS
## Features
- Overall review of projects carried by company, adding new project or deleting existed: ![company](https://user-images.githubusercontent.com/21959354/30253767-f158fd7a-968b-11e7-95e5-c0c10e33ce16.png)
- Summary tasks in the projects to which employee belongs: ![profile1](https://user-images.githubusercontent.com/21959354/30253768-f4bc891e-968b-11e7-983d-6f3966291f9f.png)
- Changing category of tasks or removing what have been done: ![profile2](https://user-images.githubusercontent.com/21959354/30253769-f72bab8a-968b-11e7-89f3-3d18a71fa432.png)
- Summary tasks in the projects for all team: ![project](https://user-images.githubusercontent.com/21959354/30253770-f925cba0-968b-11e7-9d86-b80eb02b9afa.png)
- Possibility of adding new tasks setting person responsible for its execution: ![addtask](https://user-images.githubusercontent.com/21959354/30253771-fbef0158-968b-11e7-9830-9f567686e384.png)
## Software tools
- IntelliJ IDEA 2017.2.2
- pgAdmin 4 [PostgreSQL 9.6]
- Apache Tomcat 8.5.20
- Maven 4.0.0
## Structure project's
- src:
  - main:
    - java/com/plkpiotr/kanban/dao:
      - CompanyDAO.java
      - EmployeeDAO.java
      - ProjectDAO.java
      - TaskDAO.java
    - java/com/plkpiotr/kanban/domain:
      - Company.java
      - Employee.java
      - Project.java
      - Task.java
    - java/com/plkpiotr/kanban/listeners:
      - ConfigurationListener.java
      - InitializationListener.java
    - java/com/plkpiotr/kanban/servlets:
      - AddTaskServlet
      - CompanyServlet.java
      - IndexServlet.java
      - LogInServlet.java
      - LogOutServlet.java
      - ProfileServlet.java
      - ProjectServlet.java
      - RegistrationServlet.java
    - resources/META-INF:
      - persistence.xml
    - webapp:
      - css:
        - bootstrap.min.css [ready-made library]
        - style.css
      - img:
        - icon, background and avatars [PNG files]
      - js:
        - backToTheSamePlace.js
        - bootstrap.min.js [ready-made library]
        - jquery-3.2.1.min.js [ready-made library]
      - WEB-INF:
        - views:
          - addtask.jsp
          - company.jsp
          - error.jsp
          - index.jsp
          - login.jsp
          - profile.jsp
          - project.jsp
          - registration.jsp
        - web.xml
- pom.xml
## Comments
Icon of Kanban was made by [Those Icon](https://www.flaticon.com/authors/those-icons) from [FlatIcon](https://www.flaticon.com/) is licensed by [CC BY 3.0](http://creativecommons.org/licenses/by/3.0/).  
Avatars on the website were made by [Eucalyp](https://www.flaticon.com/authors/eucalyp) from [FlatIcon](https://www.flaticon.com/) is licensed by [CC BY 3.0](http://creativecommons.org/licenses/by/3.0/).
## License
Apache License 2.0 
