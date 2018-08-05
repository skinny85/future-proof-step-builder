# Future-proof Step Builder implementation

The Step (sometimes also called the Type-Safe, or Telescopic, or Staged) variant of the
Builder Pattern is a way to make creating objects with multiple properties
using the Builder pattern in Java more type-safe.
If you're not familiar with that variant of the Builder pattern,
I wrote [an article about it on my blog](http://endoflineblog.com/type-safe-builder-pattern-in-java-and-the-jilt-library).

Libraries like [Immutables](http://immutables.github.io/immutable.html#staged-builder)
or [Jilt](https://github.com/skinny85/jilt#type-safe-builders)
implement a very strict variant of that pattern,
in which the required properties of the object must be provided first,
always in the same, fixed, order,
and only after all of the required properties have been provided
can the optional properties be set (in any order).

That is fine if the Step Builder is used only within the project it is defined in;
however, we often want to provide it as part of the public API of a library we are vending
(as Step Builders are a very convenient way of instantiating objects).
In that case, we have to worry about evolving the API over time;
more specifically, we need to handle the case when a property switches from being required to optional.

This requirement complicates the Builder considerably;
for example, we can no longer freeze the order of the required properties 
(imagine a class had 3 required properties,
and suddenly we made the first one optional!).

However, even with those added constraints,
it is possible to define a type-safe Step Builder in Java,
that guarantees, at compile time,
that an instance of the target class will never be created without setting all of the required properties first,
while future-proofing it in a way that changing any of the required properties to optional will not break existing code
(written when that property was still required).
This repository contains examples of defining such Builders
(there are 2 distinct ways of solving this problem,
each with its own advantages and drawbacks),
and also shows how evolving the API by changing a property from required to optional preserves backwards compatibility.

The best place to start reading the code is probably the
[example class we are building, with 2 required properties](src/main/java/two_required_props/Example.java).

## Building the code

The project uses [Gradle](https://gradle.org/) as the build system,
so should be usable from most IDEs and editors out of the box.

To build the entire project
(compile all code, run all tests),
execute the following command in the console while in the root directory of the project:

```bash
$ ./gradlew build
```
