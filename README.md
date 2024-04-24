### Multiple Databases Project

This project demonstrates how to integrate Spring Boot with multiple databases, enabling developers to manage interactions with multiple data sources within a single application. Whether your application requires data from different databases for partitioning, segregation, or any other reason, this project provides a foundation for handling such scenarios efficiently.


## In case of a Single Data-Source:

When your application utilizes a single database, several components play crucial roles in managing database operations. These components include the data source, entity manager, and transaction manager. Each serves a distinct purpose in facilitating interactions with the database, such as data retrieval, manipulation, and transaction management.

1. **Data Source**: The data source acts as a bridge between your application and the database. It provides the necessary connection information, such as the URL, username, password, and driver class name, enabling your application to establish a connection with the database.

2. **Entity Manager**: The entity manager serves as the interface for managing entities within your application. It handles tasks such as persisting entities to the database, retrieving entities from the database, and managing their lifecycle.

3. **Transaction Manager**: The transaction manager is responsible for managing database transactions within your application. It ensures that database operations are executed atomically and consistently, allowing multiple operations to be grouped together as a single transaction.

When working with Spring Boot, these components are typically managed and configured automatically, thanks to its powerful auto-configuration capabilities. By default, Spring Boot provides sensible defaults for data source configuration, which are enabled when you specify database properties in your `application.properties` or `application.yml` files.

When configuring your database properties, Spring Boot reads information such as the dialect and driver of the database from your configuration files. It then checks the dependencies specified in your project's `pom.xml` file to ensure that the required database drivers are available. Based on this information, Spring Boot configures the data source, entity manager, and transaction manager accordingly, allowing you to seamlessly interact with your chosen database within your Spring Boot application.

 **Work-flow of Single Data base** :
 
![Screenshot (7)](https://github.com/Arup-Sarkar-24/Multiple_Dabases_SpringBoot/assets/121042475/67f950b3-5e24-477a-bbf4-e28a9c26bfa5)

Everything be it's data source, entity manager, transaction manager will be managed by spring by reading the properties provided in “application.properties” file.

## In case of Multiple Data-Sources:

When your application requires interaction with two or more databases, Spring Boot's auto-configuration capabilities become more complex. Unlike the scenario with a single database, Spring Boot cannot automatically configure the databases itself. This is because Spring may get confused about which database to prioritize or how to configure multiple data sources simultaneously.

As a result, the programmer needs to take explicit steps to define separate data sources, entity managers, and transaction managers for each database used in the application. This ensures that Spring Boot understands the distinct requirements and configurations of each database and can manage them appropriately.

By defining separate configurations for each data source, entity manager, and transaction manager, the programmer provides clarity to Spring Boot regarding the setup of multiple databases. This allows Spring Boot to correctly handle interactions with each database, enabling seamless integration and operation of the application with multiple data sources.

 **Work-flow of Multiple Data base** :

 ![Screenshot (8)](https://github.com/Arup-Sarkar-24/Multiple_Dabases_SpringBoot/assets/121042475/95d19857-dd00-44e0-b9d1-124e7301d2bb)

When a programmer use two or more (multiple) databases Spring boot can’t configure the databases itself. Spring gets confused due to which database to pick?
That’s why programmer has to define different data Source, entity manager, Transaction manager for all databases that he used in application.

## Screen Shots of Output:

![Screenshot (6)](https://github.com/Arup-Sarkar-24/Multiple_Dabases_SpringBoot/assets/121042475/800c99b7-0af3-4687-9b36-a06292f81141)

![Screenshot (5)](https://github.com/Arup-Sarkar-24/Multiple_Dabases_SpringBoot/assets/121042475/82d0c977-405b-4548-a959-24186a3d24a1)

![Screenshot (4)](https://github.com/Arup-Sarkar-24/Multiple_Dabases_SpringBoot/assets/121042475/0a2c2755-c407-43c7-8019-d9b98185c8ea)

#### Technologies Used

- **Spring Boot**: A powerful framework for building Java applications, providing features such as auto-configuration, dependency injection, and more. It simplifies the setup and management of multiple databases within a Spring application.
- **Spring Data JPA**: Simplifies data access and manipulation by providing repository support for JPA-based data access layers. It allows developers to work with entities in multiple databases using familiar repository interfaces.
- **MySQL Connector/J** and **PostgreSQL JDBC Driver**: These connectors enable connectivity and interaction with MySQL and PostgreSQL databases, respectively. They are essential for establishing connections and executing database operations.
- **Lombok**: A library that helps reduce boilerplate code by automatically generating getters, setters, constructors, and other repetitive code. It enhances developer productivity by reducing the amount of code that needs to be written and maintained.

#### Dependencies

- `spring-boot-starter-data-jpa`: Starter for using Spring Data JPA, providing JPA repositories, EntityManager, etc.
- `spring-boot-starter-web`: Starter for building web applications using Spring MVC.
- `mysql-connector-j` and `postgresql`: JDBC drivers for MySQL and PostgreSQL databases, respectively.
- `spring-boot-configuration-processor`: Processor for Spring Boot's `@ConfigurationProperties`. It assists in handling configuration properties for multiple databases.
- `lombok`: Library for reducing boilerplate code in Java classes. It simplifies the creation of entity classes and reduces verbosity.

#### Configuration

- **Data Source Configuration**: For each database, define separate configurations for the data source, entity manager, and transaction manager. This ensures that Spring Boot can manage interactions with each database independently.
- **Application Properties**: Specify database connection properties in the `application.properties` or `application.yml` file. These properties include URLs, usernames, passwords, and driver class names for each database.

#### Usage

1. **Clone the Repository**: Use `git clone <repository-url>` to clone the repository to your local machine.
2. **Configure Database Properties**: Modify the `application.properties` or `application.yml` file to specify the connection properties for each database used in your application.
3. **Run the Application**: Start the application using Maven with `mvn spring-boot:run` or build a JAR file using `mvn clean package` and execute the JAR file.
4. **Access Endpoints**: Interact with the application endpoints to perform operations on the databases, such as retrieving data, saving records, or executing custom queries.

#### Note

- When working with a single database, Spring Boot's auto-configuration capabilities simplify setup by automatically configuring the data source, entity manager, and transaction manager based on the specified database properties.
- However, when dealing with multiple databases, explicit configuration of separate components is necessary to ensure proper management and interaction with each database. This involves defining distinct configurations for each data source, entity manager, and transaction manager.

By following the provided template and configuration guidelines, developers can effectively integrate multiple databases into their Spring Boot applications, enabling robust and scalable data management solutions.
