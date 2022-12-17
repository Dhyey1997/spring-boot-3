# Notes:
**Spring Boot Overview:** https://spring.io/projects/spring-boot

## What Spring Boot Offers:
- Security
- Logging
- Metrics
- Connecting to DB
- Easy to learn
- Producion ready
- Microservices
- Dependency Injection (Built In)
- Configureation
- Great Community

## Important Notes:
- Spring boot started parent provides the default configuration for spring based applications
- Version specification can be emitted for any dependency coming from parent
- Apache Tomcat is a free and open-source implementtion of Jakarta Servlet and WebSocket technologies
- Jetty from Eclipse and Undertow are another alternatives of Tomcat
- **We can run the spring boot application in below types:**
    - **none:** to run the application not as a web server
    - **servlet:** to run the application as a web server
    - **reactive:** to run the application as a reactive application

## Annotations:
### @SpringBootApplication
    - To determine the starting point of any spring boot application
    - This annotation is a combination of @Configuration, @EnableAutoConfiguration and @ComponentScan annotations
### @Configuration:
    - This is used to create the beans. If you have a bean dependent on another bean (Database Binding classes), you muse define it inside of configuration class
### @EnableAutoConfiguration:
    - Used by spring to guess the configuration based on the JAR files avialable on the CLASSPATH.
### @ComponentScan:
    - Is responsible for telling Spring where to look for compoents
### @RestController:
    - To define a rest controller
    - Part of Spring Web MVC
    - Spring MVC abstracts away a lot of the messy details you would have to understand and manage yourself if writing servlets manually
    - Allows to Create RESTFul services very easily
    - @Controller & @ResponseBody
### @Controller:
    - Marks the class as a web controller
### @ResponseBody:
    - Tell Spring to automatically serialize the return values of this classes methods into HTTP responses
### @GetMapping:
    - To map the api to HTTP GET method
