# SOLID -> READ

- Single Responsibility Principle
	
	https://stackify.com/solid-design-principles/
	
# SOLID -> Videos in C# -> Code in JAVA

- Design Patterns & Principles

	https://www.youtube.com/playlist?list=PLLWMQd6PeGY3ob0Ga6vn1czFZfW6e-FLr
	
# (The S in SOLID) - Single Responsibility Principle

- A class should only be responsible for one thing
- There's a place for everything and everything id in its place
- Find on reason to change and and take everything else out of the class
- Very precise names for small classes
- Generic names for large classes

# (The O in SOLID) - Open/Closed Principle

- Open for extension, but closed for modification
- Software entities (classes, modules, functions, etc.)
- Extend functionality by adding new code instead of changing existing code
- Separate the behaviors so the system can easily be extended but never broken

# (The L in SOLID) - Liskov Substitution Principle

- Any derived class should be able to substitute its parent without the consumer knowing it
- Every class that implements a interface must be able to substitute any reference throughout the code that implements the same interface
- Every part of the code should get the expected result no matter what instance of a class you send to it given it implements the same interface

# (The I in SOLID) - Interface Segregation Principle

- A client should never be forced to depend on methods it doesn't use
- A client should never depend on anything more than the methods it's calling
- Changing one method in a class shouldn't affect classes that don't depend on it
- Replace fat interfaces with with many small specific interfaces

# (The D in SOLID) - Dependency Inversion Principle

- Never depend on anything concrete, only depend on abstractions
- High level modules should not depend on low level modules. They should depend on abstractions
- Able to change a implementation easily without altering the high level code
