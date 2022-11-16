# SOLID

Solid is actually an acronym and that represents five different design principles:

- Single Responsibility Principle

`There should never be more than one reason for a class to change.`

- Open Closed Principle

`Software entities (classes, modules, methods etc.) should be open for extension, but closed for modification.`

- Liskov Substitution Principle

`We should be to substitute base class objects with child class objects & this should not alter behavior/characteristic for program.`

- Interface Segregation Principle

`Client should not be forced to depend upon interfaces that they do not use.`

- Dependency Inversion Principle

`A- High level modules should not depend upon low level modules. Both should depend upon Abstractions.`

`B- Abstractions should not depend upon details. Details should depend upon Abstractions.`

# Design Patterns

1- Creational:

`Deal with the process of creation of objects of classes`

- Builder

- Simple Factory

- Factory Method

- Prototype

- Singleton

- Abstract Factory

- Object Pool

2- Structural:

`Deal with how classes and objects are arranged or composed`

- Adapter

- Bridge

- Decorator

- Composite

- Facade

- Flyweight

- Proxy

# Clean code

- Is a development style that produces software that's easy to write, read and maintain, also easy to understand and easy to

 change.
 
 Three principles:
 
 1- `DRY`: DON'T REPEAT YOURSELF
 
 - Similar codes do almost the same thing, but there can be one presence that can replace them.
 
 - Try to reuse the code instead of copy-and-pasting.
  
 - Not having duplicates means less code.
  
 - If you have duplicated code, on change you'd need to change it everywhere. 
 
2- `KISS`: KEEP IT SIMPLE AND STUPID

 - We read more code than we write.

 - Don't try to show others how complex code you can write.
 
 - Keep it simple, so your colleagues will understand it too.
 
 - Complex code make changes very hard.
 
 - Even if you work alone, two weeks later your own over-complicated code will confuse you too.
 
 3- `YAGNI`: YOU AIN'T GONNA TO NEED IT
 
 - Implement things when you actually need them, never when you just foresee that you need them.
 
 - Not needed to code takes time and effort and very often plans change, so maybe you will need to refactor it in a few days.
 
