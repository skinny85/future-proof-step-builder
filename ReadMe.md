# Future-proof Step Builder implementation

The Step (sometimes called Type-Safe, or Telescopic, or Staged) variant of the
Builder Pattern is a way to make creating complicated objects in Java
using the Builder pattern more type-safe.

Libraries like [Immutables](https://immutables.github.io/) or [Jilt](https://github.com/skinny85/jilt)
implement a very strict variant of that pattern,
in which the required properties of the object must be provided first,
and always in the same, set, order,
and only after them can the optional properties be provided.
That is fine if the Step Builder is used only within one project;
however, we often want to provide it as a part of an external API released as a library.
In that case, we have to worry about evolving the API over a period of time;
more specifically, we need to handle the case when a property switches from required to optional.

This requirement complicates the Builder considerably;
for example, we can no longer freeze the order of the required properties 
(imagine a class had 3 required properties,
and suddenly we made the first one optional!).
However, I believe it's still possible to express that sort of Builder in Java;
this repository contains examples of how would that implementation look like.

The best place to start is probably the
[example of a class with 2 required properties](src/main/java/two_required_props/Example.java).
