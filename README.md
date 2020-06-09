# OrdersManagementSystem
Hibernate/JPA application that allows you to manage the system of product orders in the chain store. The stores have an assortment of many categories and branches located in different countries. The prodcuts can be ordered by customers from different countries. We assume that the order of the product is synonymous with its purchase. After ordering/purchasing, the product is covered by a two-year warranty under which various warranty services may be provided.  An error table is attached to the database schema, which stores information about errors that occurred during table management. In addition to standard database operations, it's possible to calculate various statistics

# Technologies

## General
* Java 8 (streams)
* Apache Maven 3.6.2

## Dependencies
* Lombok 1.18.12
* Mysql-connector-java 8.0.17
* Hibernate-core 5.4.17
* Hibernate-ehcache 5.4.17

## Setup
Download the project:

https://github.com/DlugoleckiPawel/OrdersManagementSystem.git

and then run the App.main method.

NOTE: There might be some issues with files directory relative path pattern which highly depends on your Operating System. Originally the program is designed to be run on the windows platform.

Configure your database connection (database url etc.) - change appropriate properties in persistence.xml file
Change project jdk to 8.

## Features
* Unit tests 
* Convert to multi-module app, convert to Java 13
* Development of service methods (statistics)
* Added mechanism for loading prepared data in JSON format
