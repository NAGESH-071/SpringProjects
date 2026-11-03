# Spring & Spring Boot project and practice codes
A collection of practice projects for learning the Spring Framework, starting with Dependency Injection using XML configuration.

## projects
| `demoapp` | Spring Core demo showing bean creation and dependency injection with `spring.xml` |
- | `demoapp` |	Spring Core demo showing bean creation, autowiring and dependency injection with |`spring.xml` |
- Added features like Autowiring using Spring
## concepts covered
- Spring IoC container and bean configuration in XML
- Setter injection using `<property>`
- Constructor injection using `<constructor-arg>`
- Referencing beans with `ref`
- Maven project setup with `pom.xml`
- Autowiring with autowire="byType": Spring finds and injects the Computer bean into Dev by itself, so no <property> wiring is needed
- Resolving multiple candidate beans with primary="true": both Laptop and Desktop are of type Computer, so the primary bean is the one injected
## Tech Stack

- Java 
- Spring Framework
- Maven
- VS Code
