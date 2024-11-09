# Design Patterns

This repository provides examples and explanations of various design patterns implemented in Java.

## Table of Contents
- [Singleton Pattern](#singleton-pattern)
- [Factory Pattern](#factory-pattern)
- [Abstract Factory Pattern](#abstract-factory-pattern)

## Singleton Pattern

### Definition
The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance. 
This is particularly useful for classes that manage shared resources, such as configuration settings or database connections.

### Implementation
The implementation of the Singleton pattern can be found [here](src/main/java/org/example/singleton)

### Thread Safety
The basic implementation is not thread-safe. To make it thread-safe, the **Double-Checked Locking** technique was used.

### Use Cases
- **Database Connections**: To ensure that only one connection is created to a database.
- **Configuration Management**: To manage application configuration settings that need to be accessed globally.
- **Logging**: To create a single logger instance for the entire application.

## Factory Pattern

### Definition
The Factory pattern is a creational design pattern that provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created.
Instead of instantiating objects directly, you delegate that responsibility to a factory class.

### Implementation
The implementation of the Factory pattern can be found [here](src/main/java/org/example/factory)

### Use Cases

- **Object Creation**: When the exact type of object to be created is determined by input at runtime, and you want to encapsulate the object creation logic.

## Abstract Factory Pattern

### Definition
The Abstract Factory pattern is a creational design pattern that allows you to produce families of related objects without specifying their concrete classes. 

### Implementation
The implementation of the Abstract Factory pattern can be found [here](src/main/java/org/example/abstractfactory)

### Use Cases
- **Product Families**: When you need to create related objects that should share a common theme or style.
- **Extensibility**: It helps in adding new families of products without modifying the existing code.

## Builder Pattern

### Definition
The **Builder pattern** is a creational design pattern that lets you construct complex objects step-by-step.

### Implementation
The implementation of the Builder pattern can be found [here](src/main/java/org/example/builder).

### Use Cases
- **Creating Complex Objects**: Useful for objects with many optional fields or complex configurations.
- **Improving Readability**: Simplifies object creation, making it easier to understand and maintain.

## Prototype Pattern

### Definition
The Prototype pattern is a creational design pattern that allows for the creation of new objects by copying existing ones, rather than creating new instances from scratch. 

### Implementation
The implementation of the Prototype pattern can be found [here](src/main/java/org/example/prototype).

### Prototype Registry
A Prototype Registry is an optional extension of this pattern. It acts as a central storage for prototype instances that are commonly used.
When new commonly used instance is needed, it can be retrieved and cloned from the registry.

### Use Cases
- **Game Development**: To quickly generate large numbers of similar game objects with slight variations.
- **Prototypes for Testing**: To create testing objects with predefined configurations without needing to initialize each from scratch.