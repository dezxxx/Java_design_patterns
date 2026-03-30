### Factory Method Pattern – Project Structure

This project follows the **Factory Method pattern** with a clear and scalable architecture:

* **Guitar** – product interface (defines common behavior)
* **GuitarFactory** – factory interface (defines object creation contract)
* **guitar package** – concrete product implementations
* **guitarFactory package** – concrete factory implementations
* **GuitarFactoryProducer** – selects the appropriate factory based on input
* **GuitarPlayApp** – application entry point (runs the program)

This structure ensures **separation of concerns**, **extensibility**, and **maintainability**, making it easy to add new guitar types without modifying existing code.
