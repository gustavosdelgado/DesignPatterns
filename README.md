# Design Patterns 

[YouTube Playlist](https://www.youtube.com/watch?v=MqddY6Ochkc&list=PLbIBj8vQhvm0VY5YrMrafWaQY2EnJ3j8H&index=1&t=0s)

## Creational Patterns
These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

### Factory Method
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

### Abstract Factory
Lets you produce families of related objects without specifying their concrete classes. It applies the Single Responsibility Principle (SRP) and also Open-Closed Principle (OCP). As a drawback it adds a lot of complexity to your code.

### Builder
This pattern delegates the construction action to a specific class, isolating construction complexity. It also allows multiple ways of creating an object without multiple constructors.

### Prototype
A pattern that lets you copy existing objects without making your code dependent on their classes.