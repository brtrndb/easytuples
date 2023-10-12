# easytuples

[![Github Release](https://img.shields.io/github/release/brtrndb/easytuples.svg)](https://github.com/brtrndb/easytuples/releases)
[![CI Workflow](https://github.com/brtrndb/easytuples/actions/workflows/ci.yml/badge.svg)](https://github.com/brtrndb/easytuples/actions/workflows/ci.yml)
[![Javadoc](https://img.shields.io/badge/JavaDoc-Online-green)](https://brtrndb.github.io/easytuples)
[![Github License](https://img.shields.io/github/license/brtrndb/easytuples.svg)](https://github.com/brtrndb/easytuples/blob/master/LICENSE)

## Presentation

Definition:
> A tuple is a fixed-size container data type similar to a list that can hold elements of different types.
>
>Source: [Wiktionary](https://en.wiktionary.org/wiki/tuple])


`easytuples` is a small library to create tuples.

## Quick start

Add dependency to your `pom.xml`.

```xml

<dependency>
    <groupId>tech.brtrndb</groupId>
    <artifactId>easytuples</artifactId>
    <version>${version.easytuples}</version>
</dependency>
```

Or if you're using Gradle.

```groovy
implementation("tech.brtrndb:easytuples:${easytuples_version}")
```

## Features

### Tuples

`easytuples` can handle 10 kind of tuples.

- `Solo`: One element.
- `Duo`: Two elements.
- `Trio`: Three elements.
- `Quartet`: Four elements.
- `Quintet`: Five elements.
- `Sextet`: Six elements.
- `Septet`: Seven elements.
- `Octet`: Eight elements.
- `Nonet`: Nine elements.
- `Decet`: Ten elements.

You can create an instance of any tuple with its static constructor `of(...)`.

```java
// Tuple of one element.
Solo<String> solo = Solo.of("Hello world");

// Tuple of two elements.
Duo<String, Integer> duo = Duo.of("Hello world", 12);

// Tuple of three elements.
Trio<String, Integer, Boolean> trio = Trio.of("Hello world", 12, true);
```

**Note**: tuple values **can** be `null`.

### Access to values

You can access to a value with several methods:

- `vN()` where `N` is the index from `0` to `9`.
- `findAt(int index)` to get an `Optional` containing the value if present.
- `getAt(int index)` to get the value (may throw if `index` is out of range).

### Convert

You can convert a tuple to another tuple.

```java
Trio<String, Integer, Boolean> trio = Trio.of("Hello world", 12, true);

// Creates a new tuple with two element taken in the same order.
Duo<String, Integer> duo = trio.toDuo();

// Creates a new tuple with four elements, filling blanks with null values.
Quartet<String, Integer, Boolean, Object> quartet = trio.toQuartet();
```

Or you can transform a tuple into a list of objects.

```java
Trio<String, Integer, Boolean> trio = Trio.of("Hello world", 12, true);

// Get a list of objects in the same order as the tuple values.
List<Object> list = trio.toList()
```

### Stream & iterate

Tuple values can be streamed with `.stream()`. You can also iterate over values thanks to `Iterable` implementation.

### Serialization & deserialization

Tuples can be serialized/deserialized as an array of objects.

## Contribution

Feel free to contribute and open pull requests :)

## License

See [LICENSE.md](./LICENSE.md)
