# Design Pattern Examples

I studied web front-end and graphic design in college, so I don't have a traditional computer science background.
After trying the class-based approach of ECMAScript 6 and React for a few projects recently, I realized my lack of
object-oriented programming experience was a knowledge gap that I needed to fill if I was going to keep up. I started
first with the Gang of Four's [Design Patterns](http://wiki.c2.com/?DesignPatternsBook) book, but I needed a more
hands-on approach to retain the concepts, so I got
[Head First Design Patterns](http://shop.oreilly.com/product/9780596007126.do) and I'm liking it a lot. As I work
through the examples in the book I'll post them here.

## Strategy Pattern

This teaches about "encapsulating the part that varies," and "composition over inheritance." In this example we have a
Duck class and some classes that extend Duck (MallardDuck, ModelDuck). Ducks will have varying quacking and flying
behaviors. If we were to have those as methods in the Duck class itself, and then have other classes inherit the
methods and override them each time, we would have code duplication if we wanted to reuse certain behaviors across
multiple classes. It also wouldn't allow us to change these behaviors later at runtime.

So, using the Strategy pattern, this example shows how we can take those methods out of the Duck class and instead
make interfaces for both the quacking and flying behaviors. With this we can make reusable behavior classes, and also
add the ability to change these behaviors at runtime with the setFlyBehavior and setQuackBehavior methods.

To run the example:

```bash
cd strategy/
javac MiniDuckSimulator.java
java MiniDuckSimulator
```

## Observer Pattern

This demonstrates how to have multiple classes (Observer) subscribe to updates from another class (Subject, or
Observable), in a one-to-many relationship. Observers can be subscribed and unsubscribed from events at runtime. This
relationship is also loosely coupled, as the Subject knows nothing about the Observers, other than that they implement
the Observer interface.

The `custom/` directory has an example of how to implement this without using Java 8's built-in support for the
Observer pattern, and the `observable/` directory shows the same example with Observer. As the book explains,
Observable is a class, not an interface, which violates best practices. Because it's not an interface, classes that use
it have to subclass it, preventing them from being able to subclass other classes. Also, we can't create our own
implementation for interacting with Java's Observer API.

For both of those directories you can run the examples like this:

```bash
javac WeatherStation.java
java WeatherStation
```

The `swing/` directory shows how to implement the Observer pattern in another way with ActionListener. The
`inner-classes/` directory shows one possible implementation using classes for the event listeners, and the `lambdas/`
directory is the same example but with the use of Java 8's Lambda feature.

For both of these directories you can run the examples like this:

```bash
javac SwingObserverExample.java
java SwingObserverExample
```

## Decorator Pattern

Decorator provides a way to embellish objects with additional capabilities without needing to make subclasses. It's a
good example of the Open/Closed principle: classes should be open for extension but closed for modification. The book
also mentions that this may be improved upon in many cases by the Factory and Builder patterns. The Java IO libraries,
for example, are built with extensive use of the Decorator pattern, and they demonstrate one problem with Decorator:
it results in many, many small classes, making it harder for newcomers to know where to start.

The `starbuzz-coffee/` directory has an example of a system where Decorator can be used to store data on various types
of coffee beverages and condiments, built in a way where new beverage and condiment classes can be added freely without
the need to modify existing classes. To run the example, compile `StarbuzzCoffee.java`.

The `lowercase-string/` directory has an example showing how to convert a string to lowercase using the Java IO
libraries. To run the example, compile `InputTest.java`.

## Factory Pattern

Factory provides a way to encapsulate the creation of an object. Instead of instantiating new concrete classes, we
can instead call a method that returns a new object, and that way we are then dependent on an interface and not a
concrete class. This follows the Dependency Inversion Principle: "Depend upon abstractions. Do not depend upon
concrete classes."

There are three examples here. The first one, Simple Factory, is not technically a Design Pattern, but it's close. We
have SimplePizzaFactory here, which is a separate class entirely for the creation of a pizza object. This is a step in
the right direction, and if additional classes come along that also need to create pizzas, this will provide a
reusable way to do that, but there's not much flexibility.

The Factory Method example takes this one step further and adds an abstract PizzaStore class for more flexibility. Now
we have an abstraction for both the product (Pizza) and the creator (PizzaStore). This enables us to extend the Pizza
and PizzaStore classes to enable not only multiple kinds of pizzas, but multiple kinds of pizza stores creating their
own style of pizzas. To run this example, compile `PizzaTestDrive.java`.

And then we have the Abstract Factory example, which provides an interface for a family of products. (In this case
going beyond just pizza to also include the ingredients for the pizza.) This results in another
layer of classes so it's not always better than Factory Method, but it's useful for creating products that belong
together. In this case there isn't a working example, because it would have caused me to create a ton of little classes
for all of the ingredients.

## Singleton Pattern

Singleton is a type of class made to ensure that there is only ever one instance of it. It also provides a global
point of access to that single instance. This can be a useful pattern for things like a registry.

Multithreading can cause real problems for Singletons as it can create multiple instances. There are a few ways to
handle this in Java. `SingletonTS.java` shows the simplest way to make it thread-safe: by adding the `synchronized`
keyword to the public method that returns the instance. Synchronizing is not performant though, so there are a few ways
to minimize that. `SingletonEI.java` shows a way to do that with eager instantiation, where the unique instance is
immediately instantiated, which is guaranteed to be thread-safe. This is useful if the class is always going to be
instantiated, or if the creation of that Singleton class doesn't have too much overhead. Then there is
`SingletonDCL.java`, which shows a double-checked locking technique where `synchronized` is only used once, when first
instantiating the class. However, this can be overkill if there are no performance concerns, and it isn't compatible
with Java 5 and older.
