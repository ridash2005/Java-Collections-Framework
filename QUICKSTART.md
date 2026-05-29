# Quick Start Guide

Get up and running with the Java Collection Framework in 5 minutes!

## Prerequisites
- Java 8 or higher installed on your system
- A terminal/command prompt

## Setup

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/java-collection-framework.git
cd java-collection-framework
```

### 2. Compile the Project
```bash
javac -d out -encoding UTF-8 src/io/rickarya/collections/*.java src/io/rickarya/collections/stream/*.java
```

### 3. Run Your First Demo
```bash
java -cp out io.rickarya.collections.Main
```

## Running Individual Demos

### Collections Demos
```bash
# HashMap demonstration
java -cp out io.rickarya.collections.HashMapDemo

# Set operations
java -cp out io.rickarya.collections.SetOverview

# Queue operations
java -cp out io.rickarya.collections.QueueDemo

# Deque operations
java -cp out io.rickarya.collections.DequeDemo
```

### Stream API Demos
```bash
# Basic Stream operations
java -cp out io.rickarya.collections.stream.StreamDemo

# Intermediate operations
java -cp out io.rickarya.collections.stream.IntermediateOps

# Terminal operations
java -cp out io.rickarya.collections.stream.TerminalOps

# Collectors
java -cp out io.rickarya.collections.stream.CollectorsDemo

# Parallel streams
java -cp out io.rickarya.collections.stream.ParallelStream

# Primitive streams
java -cp out io.rickarya.collections.stream.PrimitiveStreams
```

## IDE Setup

### IntelliJ IDEA
1. Open the project folder
2. Mark `src` as Sources root
3. Right-click on any demo file and select "Run"

### Eclipse
1. Create a new Java project
2. Link the `src` folder to the project
3. Right-click on any demo file → Run As → Java Application

### VS Code
1. Install Extension Pack for Java
2. Open the folder in VS Code
3. Click Run above the main method

## Common Commands

### Clean Build Output
```bash
rm -rf out  # Linux/Mac
rmdir /s out  # Windows
```

### Rebuild Everything
```bash
javac -d out -encoding UTF-8 src/io/rickarya/collections/*.java src/io/rickarya/collections/stream/*.java
```

### List All Demos
```bash
# See what demo files are available
dir /s src\com\engineeringdigest\collectionframework\*Demo.java  # Windows
find src -name "*Demo.java"  # Linux/Mac
```

## Learning Path

**Beginner** (Start here)
1. Main.java - Basic examples
2. HashMapDemo.java - HashMap operations
3. SetOverview.java - Set types

**Intermediate**
1. stream/StreamDemo.java - Stream basics
2. ListDemo.java - List implementations
3. ConcurrentHashMapDemo.java - Thread-safe maps

**Advanced**
1. stream/ParallelStream.java - Parallel processing
2. LRUCache.java - Cache implementation
3. ConcurrentLinkedDequeDemo.java - Advanced concurrency

## Troubleshooting

### Compilation Error: "class X not found"
Make sure you've compiled all files:
```bash
javac -d out -encoding UTF-8 src/com/engineeringdigest/collectionframework/*.java src/com/engineeringdigest/collectionframework/stream/*.java
```

### NoClassDefFoundError
Ensure the `-cp out` parameter is included when running:
```bash
java -cp out com.engineeringdigest.collectionframework.ClassName
```

### Wrong Java Version
Check your Java version:
```bash
java -version
```
Ensure it's Java 8 or higher.

### Output Issues on Windows
Add encoding flag if special characters don't display correctly:
```bash
javac -d out -encoding UTF-8 src\com\engineeringdigest\collectionframework\*.java
```

## Next Steps

1. **Read the [README.md](../README.md)** for comprehensive documentation
2. **Check [CONTRIBUTING.md](../CONTRIBUTING.md)** if you want to contribute
3. **Explore the source code** in the `src/io/rickarya/collections` directory
4. **Open issues** if you find bugs or have suggestions

## Quick Reference

| Collection | Type | Thread-Safe | Ordered | Duplicates |
|-----------|------|------------|---------|-----------|
| ArrayList | List | No | Yes | Yes |
| LinkedList | List | No | Yes | Yes |
| HashSet | Set | No | No | No |
| TreeSet | Set | No | Yes | No |
| HashMap | Map | No | No (keys) | No |
| TreeMap | Map | No | Yes | No |
| Queue | Queue | No | Yes | Yes |
| PriorityQueue | Queue | No | By Priority | Yes |

## Performance Tips

- **ArrayList** for fast random access
- **LinkedList** for frequent insertions/deletions
- **HashMap** for fast lookups (best average case)
- **TreeMap** for sorted data
- **HashSet** for uniqueness checks
- **ConcurrentHashMap** for multi-threaded access
- **Stream API** for complex data transformations

## Useful Links

- [Full Documentation](../README.md)
- [Contributing Guidelines](../CONTRIBUTING.md)
- [Java Collections API Docs](https://docs.oracle.com/javase/tutorial/collections/)
- [Stream API Docs](https://docs.oracle.com/javase/tutorial/collections/streams/)

---

**Happy Learning!** 🚀

For detailed information, see the [README.md](../README.md)
