# Design Patterns

This repository provides examples and explanations of various design patterns implemented in Java.

## Table of Contents
- [Singleton Pattern](#singleton-pattern)

## Singleton Pattern

### Definition
The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. 
This is particularly useful for classes that manage shared resources, such as configuration settings or database connections.

### Implementation
The implementation of the Singleton pattern can be found [here](src/main/java/org/example/singleton/Singleton.java)

### Thread Safety
The basic implementation is not thread-safe. To make it thread-safe, the **Double-Checked Locking** technique was used.

### Use Cases
- **Database Connections**: To ensure that only one connection is created to a database.
- **Configuration Management**: To manage application configuration settings that need to be accessed globally.
- **Logging**: To create a single logger instance for the entire application.

