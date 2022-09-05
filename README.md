## web-customer-tracker

A simple Spring MVC and Hibernate CRUD project which displays customers, adapted from Chad Darby's [Spring &amp; Hibernate for Beginners](https://www.udemy.com/course/spring-hibernate-tutorial/) course on Udemy.

## Getting Started

This project uses [Maven](https://maven.apache.org/) to build, compile, and manage its dependencies, and comes with built in set of relevant commands:

### `mvn compile`

Compiles the project, and in doing so it will download all of its dependencies defined in `pom.xml` and generate the `target` folder.

### `mvn install`

Builds the project and installs it in your local repository.

### `mvn clean install`

Cleans the `target` folder first, then it builds the project and installs it in your local repository.

### `mvn package`

Packages the project.

## Schema

`customer` table:

```SQL
/* Create the database */

CREATE DATABASE IF NOT EXISTS `web_customer_tracker`
USE `web_customer_tracker`;

/* Create the customer table */

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/* Dump some seed data */
INSERT INTO `customer` VALUES 
	(1,'Khalid','Hussain','khalid@hussain.com'),
	(2,'John','Doe','john@doe.com'),
	(3,'Ajay','Rao','ajay@rao.com'),
	(4,'Mary','Public','mary@public.com'),
	(5,'Maxwell','Dixon','max@dixon.com');
```
