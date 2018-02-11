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
methods and override them each time, we would have code duplication if we want to reuse certain behaviors across
multiple classes. It also wouldn't allow us to change these behaviors later at run-time.

So, using the Strategy pattern, this example shows how we can take those methods out of the Duck class and instead
make interfaces for both the quacking and flying behaviors. With this we can make reusable behavior classes, and also
add the ability to change these behaviors at runtime with the setFlyBehavior and setQuackBehavior methods.

To run the example:

```bash
javac MiniDuckSimulator.java
java MiniDuckSimulator
```
