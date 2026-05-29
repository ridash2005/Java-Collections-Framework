# Java Collection Framework

A comprehensive educational project demonstrating and exploring Java's Collection Framework with practical examples and implementations.

## Overview

This project provides hands-on demonstrations of Java's collections API, including various data structures, concurrent collections, and modern Java 8+ stream operations. It's designed as a learning resource and reference guide for understanding collection types, their use cases, and performance characteristics.

## Features

### Collections Demonstrated

#### Lists
- `ArrayList` - Resizable array implementation
- `LinkedList` - Doubly-linked list implementation
- `CopyOnWriteArrayList` - Thread-safe list for concurrent access
- `Vector` - Legacy synchronized list

#### Sets
- `HashSet` - Hash table based set
- `LinkedHashSet` - Insertion-order preserving set
- `TreeSet` - Sorted navigable set
- `EnumSet` - Set for enum types
- `CopyOnWriteArraySet` - Thread-safe set

#### Maps
- `HashMap` - Hash table based map
- `LinkedHashMap` - Insertion-order preserving map
- `TreeMap` - Sorted navigable map
- `EnumMap` - Map for enum keys
- `IdentityHashMap` - Map using reference equality
- `WeakHashMap` - Map with weak key references
- `Hashtable` - Legacy synchronized map
- `ImmutableMap` - Unmodifiable map implementations

#### Queues & Deques
- `Queue` - FIFO queue operations
- `Deque` - Double-ended queue
- `PriorityQueue` - Priority-based queue
- `BlockingQueue` - Thread-safe blocking operations
- `DelayQueue` - Time-based delay queue
- `SynchronousQueue` - Synchronization primitive
- `ConcurrentLinkedDeque` - Concurrent deque

#### Concurrent Collections
- `ConcurrentHashMap` - Thread-safe hash map
- `ConcurrentLinkedDeque` - Lock-free deque
- `ConcurrentSkipListMap` - Sorted concurrent map

### Java 8+ Streams

- **Stream Basics** - Introduction to stream API
- **Intermediate Operations** - `map()`, `filter()`, `flatMap()`, `distinct()`, `sorted()`, etc.
- **Terminal Operations** - `collect()`, `reduce()`, `forEach()`, `count()`, etc.
- **Collectors** - Grouping, partitioning, and custom collectors
- **Lazy Evaluation** - Understanding lazy evaluation in streams
- **Parallel Streams** - Multi-threaded stream processing
- **Primitive Streams** - `IntStream`, `LongStream`, `DoubleStream`

### Advanced Topics

- **Comparable & Hashing** - Implementing `compareTo()`, `hashCode()`, and `equals()`
- **Iterators** - Iterator patterns and usage
- **LRU Cache** - Least Recently Used cache implementation
- **Sorting** - Custom comparators and natural ordering
- **Task Submission System** - Practical example using collections
- **Garbage Collection** - Memory management concepts

## Project Structure

```
src/io/rickarya/collections/
├── Main.java                          # Entry point with basic examples
├── HashMapDemo.java                   # HashMap demonstrations
├── SetOverview.java                   # Set implementations overview
├── ListDemo.java                      # List implementations
├── QueueDemo.java                     # Queue basics
├── DequeDemo.java                     # Deque operations
├── ...                                # Other collection demos
├── LRUCache.java                      # LRU cache implementation
├── stream/                            # Stream API examples
│   ├── StreamDemo.java
│   ├── IntermediateOps.java
│   ├── TerminalOps.java
│   ├── CollectorsDemo.java
│   ├── LazyEvaluationDemo.java
│   ├── ParallelStream.java
│   ├── PrimitiveStreams.java
│   └── ...
└── ...
```

## Getting Started

### Prerequisites
- Java 8 or higher
- IntelliJ IDEA or any Java IDE (optional)

### Running Examples

Compile the project:
```bash
javac -d out src/io/rickarya/collections/*.java
javac -d out src/io/rickarya/collections/stream/*.java
```

Run specific demonstrations:
```bash
java -cp out io.rickarya.collections.Main
java -cp out io.rickarya.collections.HashMapDemo
java -cp out io.rickarya.collections.stream.StreamDemo
```

Or simply run from your IDE by opening the file and executing the main method.

## Key Concepts Covered

### Collections Fundamentals
- **Type Safety** - Generics and type parameters
- **Performance** - Time complexity of common operations
- **Thread Safety** - Synchronized vs. concurrent collections
- **Ordering** - Insertion order, natural order, custom order
- **Null Handling** - Which collections allow null values

### Stream API
- **Functional Programming** - Lambda expressions and method references
- **Lazy Evaluation** - Terminal vs. intermediate operations
- **Parallel Processing** - Fork/join framework usage
- **Functional Collectors** - Reduction and aggregation
- **Custom Streams** - Building domain-specific streams

## Usage Examples

### HashMap
```java
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
String value = map.get(1);
```

### Stream Operations
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
    .filter(n -> n > 2)
    .map(n -> n * 2)
    .reduce(0, Integer::sum);
```

### LRU Cache
```java
LRUCache<String, String> cache = new LRUCache<>(2);
cache.put("key1", "value1");
String cached = cache.get("key1");
```

## Learning Path

1. Start with basic collections: [Main.java](src/io/rickarya/collections/Main.java)
2. Explore list implementations: `ListDemo.java`
3. Learn about sets: [SetOverview.java](src/io/rickarya/collections/SetOverview.java)
4. Master maps: `HashMapDemo.java`, `LinkedHashMapDemo.java`, `TreeMapDemo.java`
5. Understand queues: `QueueDemo.java`, `DequeDemo.java`
6. Dive into streams: `stream/StreamDemo.java`
7. Explore concurrent collections: `ConcurrentHashMapDemo.java`

## Contributing

Contributions are welcome! Please follow these guidelines:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add YourFeature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

See [CONTRIBUTING.md](CONTRIBUTING.md) for detailed guidelines.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Disclaimer

This is an educational project designed to demonstrate Java collections and stream API concepts. While the implementations are functional, they are simplified for learning purposes. For production use, always rely on the standard Java library collections and thoroughly test your code.

## Useful Resources

- [Java Collections Official Documentation](https://docs.oracle.com/javase/tutorial/collections/)
- [Java Streams API](https://docs.oracle.com/javase/tutorial/collections/streams/)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java-3rd/9780134685991/)
- [Java Concurrency in Practice](https://www.oreilly.com/library/view/java-concurrency-in/9780321349606/)

## Author

Rickarya Das

## Changelog

### Version 1.0.0
- Initial release with comprehensive collection demonstrations
- Stream API examples with multiple operation types
- Concurrent collection implementations
- Educational documentation and examples

---

**Last Updated**: May 2026

For questions, issues, or suggestions, please open an issue on the repository.
