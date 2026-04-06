# Factory Pattern

This project demonstrates the **Abstract Factory** pattern in Java using a scalable and extensible structure.

## Project Idea

The application works with different guitar brands through common abstractions instead of direct concrete implementations.

## Main Components

- **Guitar** — common product interface
- **GuitarFactory** — common factory interface
- **Concrete Guitars** — specific guitar implementations
- **Concrete Factories** — factories responsible for creating specific guitars
- **GuitarFactoryProducer** — selects the required factory by brand
- **GuitarPlayApp** — client entry point





## Abstract Factory Pattern

Abstract Factory is a creational design pattern that provides an interface for creating families of related objects without specifying their concrete classes.

### Structure

- Seller — sells products
- Accountant — calculates profit and pays salaries
- Director — manages the store

- StoreTeamFactory — abstract factory
- OnlineStoreTeamFactory — concrete factory

### How it works

The factory creates a full team:
- Seller
- Accountant
- Director

The client (OnlineStore) uses the factory to get objects and execute their behavior.

### Advantages

- No direct object creation in client code
- Easy to extend (add new store types)
- Clean separation of responsibilities

### Example 

```java 
StoreTeamFactory factory = new OnlineStoreTeamFactory();
Seller seller = factory.getSeller();
Accountant accountant = factory.getAccountant();
Director director = factory.getDirector();

seller.sellProduct();
accountant.calculateBalance();
director.manageStore();

```
______________________________________________________________________________________________________________________________

# Singleton Pattern

This package demonstrates the **Singleton** design pattern in Java.

## Idea
The Singleton pattern ensures that a class has only **one instance** and provides a **global access point** to it.

## Project Structure
- `ConfigManager` — singleton class that loads configuration once
- `Main` — runs the example
- `config.properties` — configuration file used by the singleton

## Why use it
This pattern is useful when the application needs a single shared object, for example:
- configuration manager
- logger
- cache
- connection manager

## In this example
`ConfigManager` loads values from `config.properties` once and gives access to them through a single shared instance.


_______________________________________________________________________________________________________________________

# Builder Design Pattern

## Pattern Type
Creational Pattern

## Overview
The Builder pattern is a creational design pattern that constructs complex objects step by step. It separates the construction process from the object representation, allowing the same process to create different variations of an object.

## Structure
- **Product (`Computer`)** — the object being built
- **Abstract Builder (`ComputerBuilder`)** — defines building steps and stores the product
- **Concrete Builders** — `GamingComputerBuilder`, `OfficeComputerBuilder`, `ProgrammingComputerBuilder`
- **Director (`Director`)** — controls the construction sequence
- **Client (`BuildComputerRunner`)** — selects a builder and starts the build process

## Model
The `Computer` class contains the following fields:
- `name : String`
- `cpu : CpuGpuType`
- `ram : int`
- `storage : int`
- `gpu : CpuGpuType`
- `price : int`

The `CpuGpuType` enum contains:
- `INTEL`
- `AMD`
- `M1`
- `NVIDIA`
- `RADEON`
- `ARC`

## Implementation Details
`ComputerBuilder` is an abstract class that:
- contains the protected field `Computer computer`
- initializes the product using `createComputer()`
- declares the following build steps:
  - `buildName()`
  - `buildCpu()`
  - `buildRam()`
  - `buildStorage()`
  - `buildGpu()`
  - `buildPrice()`
- returns the final object through `getComputer()`

Concrete builders implement all building steps and configure different computer types.

`Director` stores a reference to `ComputerBuilder`, executes the required build steps in order, and returns the finished `Computer`.

## How It Works
1. The client creates a `Director`
2. The client passes a concrete builder to the director using `setBuilder(...)`
3. The director performs the build sequence:
   - `createComputer()`
   - `buildName()`
   - `buildCpu()`
   - `buildRam()`
   - `buildStorage()`
   - `buildGpu()`
   - `buildPrice()`
4. The builder creates and configures the `Computer`
5. The director returns the final object with `getComputer()`

## Client
`BuildComputerRunner` acts as the client. It:
- creates the `Director`
- sets different concrete builders
- builds multiple `Computer` objects
- prints the result

## Example Usage

```java
Director director = new Director();

director.setBuilder(new GamingComputerBuilder());
Computer computer1 = director.buildComputer();
System.out.println(computer1);

System.out.println("----------------");

director.setBuilder(new OfficeComputerBuilder());
Computer computer2 = director.buildComputer();
System.out.println(computer2);

System.out.println("----------------");

director.setBuilder(new ProgrammingComputerBuilder());
Computer computer3 = director.buildComputer();
System.out.println(computer3);

```
___________________________________________________________________________________________

# Prototype pattern
- **Cats**
Implements `Clone` and returns a copy of itself.

- **CatFactory**
Calls `copy()` and casts result to `Cats`.

- **VersionCatRunner**
Runs the application.

---

## How It Works

1. Create original `Cats`
2. Pass it to `CatFactory`
3. Factory calls `copy()`
4. Returns cloned `Cats`

---

## Factory Role

Factory does not create objects manually.

It only:
- receives object
- calls `copy()`
- returns cloned instance

---

## Getters / Setters

Not required for cloning.

Used only if:
- need to read fields
- need to modify object after cloning

---

## Conclusion

Prototype creates objects via copying.

Factory is used only as a wrapper to simplify usage of cloning.


________________________________________________________________________

# Adapter Pattern (Class Adapter)

## Overview
This project demonstrates the Adapter Pattern using the class adapter approach (inheritance).

The purpose of this pattern is to allow incompatible interfaces to work together.

In this example, the client expects the `Log` interface, but the existing functionality is provided by the `Logger` class.
The `Adapter` class extends `Logger` and implements `Log`, adapting one interface to another.

## Structure

- Log — target interface
- Logger — adaptee class
- Adapter — class adapter (extends Logger, implements Log)
- RunnerLogger — client

## How It Works

The client works with the `Log` interface.

The `Adapter`:
- extends `Logger`
- implements `Log`
- overrides `log()`
- calls `logObject()` from `Logger`

## Roles

- Target: Log
- Adaptee: Logger
- Adapter: Adapter
- Client: RunnerLogger

## Example Flow

1. RunnerLogger creates Adapter
2. Client calls log()
3. Adapter receives the call
4. Adapter calls logObject() from Logger

## Key Idea

log() → logObject()

## Conclusion

The Adapter Pattern allows reuse of existing classes without modifying them.
This implementation uses inheritance (class adapter) to adapt Logger to the Log interface.

---
## Composite Pattern

## Structure

- **Employee** – common interface for all types of workers
- **CallOperator** – handles customer calls
- **InternetInstaller** – installs internet for customers
- **TechnicalSupport** – solves technical issues
- **Team** – composite class that groups employees
- **InternetProviderTeam** – entry point (main class)

---

## How It Works

Each employee implements the same interface and defines its own behavior.

The `Team` class aggregates multiple employees and allows them to be treated as a single object.

Instead of calling each employee individually, the client interacts with the team: 
```java

team.createInternetProvider();
```
------------------------------------------------------------------------------------------------------------------------

# Decorator Pattern

## Overview

This project demonstrates the Decorator Design Pattern in Java.

The goal is to extend object behavior dynamically by wrapping one object into another instead of using inheritance.

## Structure

* Car — interface with method getDescription()
* BasicCar — base implementation
* CarDecorator — base wrapper class
* SpeedCar — adds behavior
* SportCar — adds behavior
* CarsRunner — entry point

## How It Works

The object is created as a chain:

```java
Car car = new SportCar(new SpeedCar(new BasicCar()));
```

Execution flow:

* BasicCar provides base behavior
* SpeedCar wraps BasicCar and adds behavior
* SportCar wraps SpeedCar and adds behavior
* Final result is returned

## Why Decorator

* add behavior at runtime
* avoid deep inheritance
* combine features flexibly

## Benefits

* flexible design
* easy to extend
* composition over inheritance

## Conclusion

Decorator allows adding new functionality without modifying existing code.
Each wrapper extends behavior step by step.

------------------------------------------------------------

# Facade Pattern

## Overview
The **Facade Pattern** is a structural design pattern that provides a **simple interface** to a **complex subsystem**.

Instead of forcing the client to work directly with multiple classes and understand their interaction order, the facade wraps this complexity and exposes a small number of easy-to-use methods.

In this project, the facade acts as a **single entry point** that coordinates several subsystem objects and hides the internal workflow from the client.

---

## Purpose
The main goal of the Facade pattern is to:

- simplify access to a complex system
- hide internal interaction between subsystem classes
- reduce coupling between client code and subsystem code
- provide a cleaner and more readable API

---

## Structure
The project usually contains three main parts:

### 1. Facade
The central class that provides simple methods for the client.

### 2. Subsystem Classes
Classes that perform the real work behind the scenes.

### 3. Client
The class that uses the facade instead of interacting with all subsystem classes directly.

---

## How It Works
Without a facade, the client would need to:

- create multiple objects
- call methods in the correct order
- know internal system details

With a facade, the client simply calls one method, and the facade handles the rest.

---

## Example Idea
For example, if the system contains:

- `CPU`
- `Memory`
- `HardDrive`

the client does not need to manually start each one in the correct sequence.

Instead, it can call something like:

```java
 computerFacade.startComputer();
```



--------------------------------------------------------------------
# Flyweight Pattern

## Overview
This project demonstrates the **Flyweight** design pattern in Java using a startup development team example.

The main idea of Flyweight is to **reuse already created objects** instead of creating new ones every time.  
This helps reduce memory usage when the system works with many similar objects.

In this example, startup developers are reused by their type:
- `BackendStartUpDeveloper`
- `FrontendStartUpDeveloper`

If the same developer type is requested multiple times, the factory returns the existing object instead of creating a new one.

---

## Project Structure

- `StartUpDeveloper` — flyweight interface
- `BackendStartUpDeveloper` — concrete flyweight for backend work
- `FrontendStartUpDeveloper` — concrete flyweight for frontend work
- `StartUpDeveloperFactory` — simple factory implementation
- `StartUpDevFactorySupplier` — flexible factory implementation using `Supplier`
- `StartUpRunner` — client code that requests developers and runs their work

---

## How It Works

1. The client requests a developer by type.
2. The factory checks whether this developer already exists.
3. If the object exists, it returns the cached instance.
4. If not, it creates a new object, stores it, and returns it.
5. The same shared developer object can be reused many times.

---

## Why Flyweight Is Used Here

The Flyweight pattern is useful when:

- many similar objects are needed
- object creation should be optimized
- memory usage should be reduced
- shared objects can be reused

In this project, developers of the same type are shared instead of being recreated.

---

## Implemented Variants

### 1. `StartUpDeveloperFactory`
A simple Flyweight factory implementation.

This version uses basic conditional logic to create developer objects and store them for reuse.

### 2. `StartUpDevFactorySupplier`
A more extensible Flyweight factory implementation.

This version uses `Supplier` and a registration-style approach, which makes the factory easier to extend with new developer types.

---

## Advantages of This Example

- shows the core idea of Flyweight clearly
- demonstrates object reuse
- contains both a simple and a more scalable factory approach
- easy to extend with new developer types

---

## Example Output

```java
Backend developer is created
Frontend developer is created
Backend developer develops server side of startup
Frontend developer develops client side of startup
Backend developer develops server side of startup
Frontend developer develops client side of startup
```

# Proxy Pattern

## Overview
Proxy Pattern is a structural design pattern in which a proxy object acts as a substitute for a real object and controls access to it.

The proxy can add extra behavior such as access control, lazy initialization, logging, or caching, while delegating the main work to the real object.

---------------------------------------------------------

# Chain of Responsibility Pattern

## Overview
Chain of Responsibility is a behavioral design pattern that passes a request through a chain of handlers until one of them processes it.

In this project, the request moves through several support levels:
- `BasicSupport`
- `AdvancedSupport`
- `ExpertSupport`

Each handler decides whether it can process the request or pass it to the next handler in the chain.

## Project Structure

- `Handler` — abstract base class that stores the reference to the next handler and defines the common contract for request handling.
- `BasicSupport` — handles basic support requests.
- `AdvancedSupport` — handles advanced support requests.
- `ExpertSupport` — handles expert-level support requests.
- `SupportRunner` — creates the chain and sends requests through it.

## How It Works

1. `SupportRunner` creates all support handlers.
2. The chain is built in the following order:

   `BasicSupport -> AdvancedSupport -> ExpertSupport`

3. A request is sent to the first handler in the chain.
4. Each handler checks whether it can process the request:
    - if yes, it handles it
    - if no, it forwards the request to the next handler
5. If no handler can process the request, the request remains unhandled.

## Example Flow

- `"basic"` → handled by `BasicSupport`
- `"advanced"` → handled by `AdvancedSupport`
- `"expert"` → handled by `ExpertSupport`
- `"unknown"` → request is not handled

## Advantages

- reduces tight coupling between sender and receiver
- makes request processing flexible
- allows adding new handlers without changing client code
- supports dynamic chain configuration

## Disadvantages

- a request may remain unhandled
- debugging may be harder in long chains
- chain behavior depends on handler order

## Conclusion

This implementation demonstrates the Chain of Responsibility pattern using an abstract base handler class, which helps avoid code duplication and keeps the chain logic centralized.


--------------------------------------------------------

# Command Pattern

## Overview
The Command Pattern is a behavioral design pattern that turns a request into a separate object. This allows you to parameterize objects with operations, decouple the sender from the receiver, and make the design easier to extend.

## Purpose
This project demonstrates how to encapsulate actions in command objects and execute them through an invoker without tightly coupling the client code to the receiver.

## Structure
- `Command` — common interface for all commands
- `Light` — receiver that contains the real business logic
- `LightOnCommand` — concrete command for turning the light on
- `LightOffCommand` — concrete command for turning the light off
- `RemoteControl` — invoker that stores and executes a command
- `RunnerCommand` — client that creates and connects all objects

## How It Works
1. The client creates the receiver object.
2. The client creates concrete command objects and passes the receiver to them.
3. The invoker receives a command object.
4. The invoker executes the command through the common interface.
5. The concrete command delegates the action to the receiver.

## Advantages
- Reduces coupling between sender and receiver
- Makes the code easier to extend with new commands
- Supports flexible execution flow
- Makes it possible to implement queue, log, undo, and redo behavior

## Example in This Project
In this example:
- `Light` knows how to turn the light on and off
- `LightOnCommand` calls `turnOn()`
- `LightOffCommand` calls `turnOff()`
- `RemoteControl` triggers commands through `execute()`
- `RunnerCommand` demonstrates switching commands at runtime

## Conclusion
The Command Pattern is useful when you want to separate the object that requests an action from the object that performs it. It improves flexibility, scalability, and maintainability of the application.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Interpreter Pattern

## Overview
**Interpreter Pattern** is a behavioral design pattern that defines a way to represent and evaluate expressions of a simple language.

In this project, the pattern is shown through a small expression tree:
- `Expression` defines the common contract
- `NumberExpression` represents a terminal expression
- `AddExpression` represents a non-terminal expression
- `InterpreterRunner` creates objects and runs interpretation

## Structure
- **Expression** — common interface for all expressions
- **NumberExpression** — terminal expression that returns a number
- **AddExpression** — non-terminal expression that combines two expressions
- **InterpreterRunner** — client class that builds the expression tree and executes it

## How it works
1. `Expression` declares the `interpret()` method.
2. `NumberExpression` returns its stored numeric value.
3. `AddExpression` contains two `Expression` objects.
4. When `interpret()` is called on `AddExpression`, it recursively calls `interpret()` for left and right expressions and returns their sum.
5. `InterpreterRunner` creates the expression tree and prints the result.

## Example
The client can build an expression like:

`5 + 10`

Where:
- `5` is a `NumberExpression`
- `10` is a `NumberExpression`
- `AddExpression` combines them and returns the final result

## Advantages
- simple representation of grammar as objects
- easy to understand for small expressions
- recursive interpretation is clear and structured

## Disadvantages
- not suitable for complex grammars
- the number of classes can grow quickly
- better for simple educational or DSL examples

## Conclusion
The Interpreter pattern is useful when you need to model and evaluate simple expressions through object composition.

-------------------------------------------------------

# Iterator Pattern

## Overview
Iterator Pattern is a behavioral design pattern that provides a way to access elements of a collection sequentially without exposing its internal structure.

## Purpose
This pattern is used when you want to:
- traverse a collection without exposing its internal representation
- provide a common way to iterate through different collections
- separate traversal logic from the collection itself

## Structure
- **Iterator** — declares methods for traversal
- **ConcreteIterator** — implements traversal logic
- **Aggregate** — declares a method for creating an iterator
- **ConcreteAggregate** — stores elements and creates a concrete iterator
- **Runner** — demonstrates how iteration works

## Example Idea
In this example:
- `Iterator` defines methods like `hasNext()` and `next()`
- `Collection` defines `createIterator()`
- `DeveloperTeam` stores developers
- `DeveloperIterator` iterates through the team
- `IteratorRunner` starts the program

## Advantages
- hides internal collection structure
- simplifies collection traversal
- supports different traversal strategies
- follows Single Responsibility Principle

## Disadvantages
- may add extra classes for simple collections
- can be unnecessary if direct access is enough

## Conclusion
Iterator Pattern is useful when you need a clean and flexible way to traverse elements of a collection without coupling client code to the internal data structure.

-------------------------------------

# Mediator Pattern

## Overview
Mediator Pattern is a behavioral design pattern that defines a central object that manages communication between other objects.

In this example, airplanes do not communicate with each other directly.  
All requests go through the control tower, which coordinates takeoff and landing operations.

## Structure

- **AirTrafficControl** — mediator interface that defines operations for coordinating airplanes.
- **AirportControlTower** — concrete mediator that controls runway access and manages waiting airplanes.
- **Airplane** — abstract colleague that stores a reference to the mediator and the airplane name.
- **PassengerPlane** — concrete colleague that sends takeoff and landing requests through the mediator.
- **AirportRunner** — client class that creates the mediator and airplane objects, then starts the scenario.

## How It Works

1. The runner creates one control tower.
2. Airplanes receive a reference to the same control tower.
3. When an airplane wants to take off or land, it does not interact with other airplanes directly.
4. The airplane sends the request to the mediator.
5. The control tower checks whether the runway is free.
6. If the runway is free, the operation is allowed.
7. If the runway is busy, the airplane is placed in a queue.

## Key Idea

The main goal of this pattern is to reduce direct dependencies between objects.

Instead of this:

- airplane ↔ airplane
- airplane ↔ airplane
- airplane ↔ airplane

We use this:

- airplane → control tower
- airplane → control tower
- airplane → control tower

## Advantages

- Reduces coupling between objects
- Centralizes communication logic
- Makes the system easier to maintain
- Simplifies interaction between multiple objects

## Disadvantages

- The mediator can become too complex
- Too much logic may be concentrated in one class

## Example Classes

- `AirTrafficControl`
- `AirportControlTower`
- `Airplane`
- `PassengerPlane`
- `AirportRunner`

## Conclusion

Mediator Pattern is useful when multiple objects need to interact, but direct communication between them would make the system too tightly coupled.

In this project, the control tower acts as the mediator and coordinates all airplane requests through one centralized object.

----------------------------------------------------------------

# Memento Pattern

## Overview
The **Memento Pattern** is a behavioral design pattern that allows an object to save its internal state and restore it later without exposing its internal details.

In this project, the pattern is demonstrated through an `Editor` that saves text states, a `Memento` that stores each snapshot, and a `History` class that keeps the saved states.  
The `Runner` class shows how the editor state is saved, restored, and tracked with creation time.

An additional detail in this example is that each saved state is created with a **3-second delay** between snapshots, so the timestamps in `Memento` clearly show when each version was stored.

## Structure
- **Editor** — the originator that creates and restores snapshots
- **Memento** — stores the editor state and the creation date/time
- **History** — stores the saved snapshots
- **Runner** — demonstrates saving states, delays between saves, and undo operations

## How it works
1. `Editor` changes its text state
2. `Editor` creates a `Memento` object through `save()`
3. `History` stores the snapshot
4. `Runner` pauses for **3 seconds** between state changes to make the timestamp difference visible
5. When undo is needed, a snapshot is taken from `History`
6. `Editor` restores its previous state through `restore()`

## Example scenario
- `Version 1` is saved
- after **3 seconds**, `Version 2` is saved
- after **3 seconds**, `Version 3` is saved
- undo restores the editor back to `Version 2`
- another undo restores it back to `Version 1`

## Benefits
- keeps encapsulation safe
- makes undo functionality easy to implement
- allows storing state history
- timestamps make the example more realistic and easier to understand

## Drawbacks
- can consume more memory if too many states are stored
- history management may become more complex in large systems

## Conclusion
This implementation shows the classic **Memento Pattern** with an additional timestamp for each snapshot.  
The **3-second pause between saves** makes it easy to see that every saved state is created at a different moment in time, which improves the demonstration of state history and rollback behavior.

-----------------------------------------------------------

# Observer Pattern (GoF)

## Overview
Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects.  
When the state of one object changes, all registered observers are notified automatically.

## Project Structure

### Observer
Observer interface that defines the common notification method for all subscribers.

### Subject
Subject interface that defines methods for adding, removing, and notifying observers.

### NewsAgency
Concrete subject that stores:
- a list of subscribers
- a list of news

It notifies all subscribers when:
- a new piece of news is added
- an existing piece of news is removed

### Subscriber
Concrete observer that receives notifications from `NewsAgency`.

### ObserverRunner
Runner class that demonstrates:
- adding subscribers
- removing subscribers
- adding news
- removing news
- automatic notification delivery

## How It Works

1. Subscribers are added to the `NewsAgency`
2. News is added to the internal news list
3. `NewsAgency` sends notifications to all current subscribers
4. If news is removed, all current subscribers are notified again
5. If a subscriber is removed, that subscriber no longer receives updates

## Example Subscribers
- Sergey
- Elena
- Mira

## Advantages
- Loose coupling between publisher and subscribers
- Easy to add or remove observers at runtime
- Centralized notification logic
- Flexible event-driven behavior

## Disadvantages
- All observers receive notifications from the subject
- Notification flow can become harder to track in large systems
- If observers are not removed properly, unnecessary subscriptions may remain

## Conclusion
This project shows a simple and clear implementation of the Observer Pattern in Java using:
- `List<Observer>` for subscribers
- `List<String>` for news
- automatic notifications on add/remove news events

------------------------------------------------

# State Pattern

## Overview
State Pattern allows an object to change its behavior when its internal state changes.  
Instead of using large `if-else` or `switch` blocks, behavior is delegated to separate state classes.

In this example, the pattern is used for a **program installation process**.

The installation has 3 states:

- `StartInstallationState`
- `InProgressInstallationState`
- `CompletedInstallationState`

The `Installer` class works as the **Context** and delegates behavior to the current state.

---

## Project Structure

- `InstallationState` — state interface
- `StartInstallationState` — starting state of installation
- `InProgressInstallationState` — installation is running
- `CompletedInstallationState` — installation is finished
- `Installer` — context that stores the current state
- `Runner` — entry point for testing the pattern

---

## How It Works

At the beginning, `Installer` contains the `StartInstallationState`.

### Available actions:
- `startInstallation()` — starts installation
- `nextStep()` — moves the installation process forward
- `resetInstallation()` — resets installer back to the start state

### State transitions:
- `START -> IN_PROGRESS`
- `IN_PROGRESS -> COMPLETED`

After installation is completed, calling start or next step again does not restart the process automatically.  
To begin a new installation cycle, `resetInstallation()` must be called.

---

## Why Use State Pattern Here

Without State Pattern, all installation logic would usually be placed in one class using many `if-else` conditions.

With State Pattern:

- each state has its own class
- behavior is clearly separated
- transitions are easier to manage
- code becomes easier to extend and maintain

---

## Advantages

- removes complex conditional logic
- makes state-specific behavior explicit
- improves readability
- follows Open/Closed Principle
- simplifies adding new states later

---

## Example Scenario

1. Installer is created in `START` state
2. `startInstallation()` changes state to `IN_PROGRESS`
3. `nextStep()` changes state to `COMPLETED`
4. `resetInstallation()` returns state back to `START`

---

## Conclusion

This example shows how State Pattern can model a real installation process in a clean and extensible way.

The object does not use one large conditional block.  
Instead, each state defines its own behavior and controls valid transitions.

--------------------------------------


# Strategy Pattern

## Overview
Strategy Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one in a separate class, and makes them interchangeable at runtime.

This pattern is useful when the program has multiple ways to perform the same action and the behavior should be selected dynamically without changing the client code.

## Structure
- **PaymentStrategy** — strategy interface that defines the common behavior
- **CreditCardPayment** — concrete strategy for credit card payment
- **PayPalPayment** — concrete strategy for PayPal payment
- **CryptoPayment** — concrete strategy for cryptocurrency payment
- **PaymentContext** — context class that works with a strategy through the interface
- **StrategyRunner** — main class for demonstration

## How it works
The `PaymentContext` class does not implement payment logic by itself.  
Instead, it stores a reference to a `PaymentStrategy` object and delegates the execution to the selected strategy.

This allows:
- switching behavior at runtime
- following the Open/Closed Principle
- avoiding large `if-else` or `switch` blocks
- keeping each algorithm isolated in its own class

## Advantages
- easy to extend with new strategies
- clean separation of responsibilities
- flexible runtime behavior change
- improved maintainability

## Example idea
A payment system may support several payment methods:
- Credit Card
- PayPal
- Crypto

Each method is implemented as a separate strategy class.  
The context simply uses the currently selected strategy.

## Conclusion
Strategy Pattern is a good choice when different algorithms are interchangeable and should be selected dynamically without modifying the main business logic.

---------------------------------------


# Template Method Pattern

## Overview
Template Method Pattern defines the skeleton of an algorithm in a base class and allows subclasses to redefine specific steps without changing the overall structure.

## Structure

- InstallerTemplate — defines the template method `installSystem()` and algorithm structure
- WindowsInstaller — concrete implementation for Windows
- LinuxInstaller — concrete implementation for Linux
- InstallerRunner — entry point

## How it works

The method `installSystem()` defines the fixed sequence:

1. prepare()
2. installFiles()
3. finish()

Subclasses override these steps but cannot change the order.

## Key Points

- The algorithm structure is fixed in the base class
- Steps are customizable in subclasses
- The template method is marked as `final` to prevent overriding

## Example Flow

Calling:

```java

installer.installSystem();

```

-----------------------------------------------------

# Visitor Pattern (GoF)

## Definition (EN)
Visitor Pattern lets you define new operations without changing the classes of the elements on which it operates.

---

## Overview

The Visitor Pattern is used when you have a stable set of objects and want to add new behavior without modifying their classes.

In this example, the installation process consists of several steps:
- PrepareStep
- InstallFilesStep
- FinishStep

These steps are elements.

A visitor can be applied to each step to perform a specific operation, for example logging.

---

## Structure

### Element
- InstallationStep — element interface
- PrepareStep — concrete element
- InstallFilesStep — concrete element
- FinishStep — concrete element

Each element implements:
```java
accept(Visitor visitor);
```























































