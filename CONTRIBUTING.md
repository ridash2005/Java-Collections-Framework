# Contributing to Java Collection Framework

Thank you for your interest in contributing to the Java Collection Framework project! We appreciate your efforts to make this educational resource better.

## How to Contribute

### Reporting Bugs

If you find a bug, please open an issue with:
- A clear, descriptive title
- A detailed description of the problem
- Steps to reproduce the issue
- Expected vs. actual behavior
- Java version and OS information

### Suggesting Enhancements

Enhancement suggestions are welcome! Please include:
- A clear, descriptive title
- Detailed description of the suggested feature
- Use cases and examples
- Possible implementation approaches (if applicable)

### Submitting Changes

1. **Fork the repository** and clone it locally:
   ```bash
   git clone https://github.com/your-username/java-collection-framework.git
   cd java-collection-framework
   ```

2. **Create a feature branch**:
   ```bash
   git checkout -b feature/YourFeatureName
   ```

3. **Make your changes** following the coding standards below

4. **Test your changes** thoroughly:
   ```bash
   javac -d out src/io/rickarya/collections/*.java
   java -cp out io.rickarya.collections.YourDemo
   ```

5. **Commit with a clear message**:
   ```bash
   git commit -m "Add: Brief description of changes"
   ```

6. **Push to your fork**:
   ```bash
   git push origin feature/YourFeatureName
   ```

7. **Open a Pull Request** with:
   - Clear description of changes
   - Reference to related issues (if any)
   - Any additional context needed

## Coding Standards

### Java Style Guide

- **Package naming**: `io.rickarya.collections`
- **Class naming**: PascalCase (e.g., `HashMapDemo.java`)
- **Method naming**: camelCase (e.g., `demonstrateFeature()`)
- **Indentation**: 4 spaces (no tabs)
- **Line length**: Keep under 100 characters when possible

### Code Quality

- Add meaningful comments for complex logic
- Use proper variable naming that describes intent
- Follow single responsibility principle
- Keep methods focused and concise
- Use Java generics for type safety
- Handle null values appropriately

### Documentation

Each demo class should include:
- Class javadoc explaining its purpose
- Comments for non-obvious logic
- Example usage in comments if helpful

Example:
```java
/**
 * Demonstrates HashMap implementation and common operations.
 * Shows key concepts like hashing, collision handling, and iteration.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap with capacity 17 and load factor 0.5
        HashMap<Integer, String> map = new HashMap<>(17, 0.5f);
        
        // Add entries to the map
        map.put(1, "One");
    }
}
```

### Adding New Demos

If adding a new collection demo:

1. Create the demo file in the appropriate package
2. Follow the naming convention: `[CollectionName]Demo.java`
3. Include comprehensive examples showing:
   - Initialization
   - Common operations (add, remove, iterate)
   - Use cases and benefits
   - Performance characteristics (in comments)
4. Add thread-safety notes if applicable
5. Include edge cases or important gotchas

### For Stream API Examples

When adding stream demonstrations:

1. Show both imperative and functional approaches when helpful
2. Explain lazy evaluation if demonstrated
3. Include performance notes for parallel vs. sequential
4. Demonstrate common collectors and operations
5. Include realistic use cases

## Pull Request Process

1. Update documentation if you've changed functionality
2. Ensure all code compiles without warnings
3. Test your demo thoroughly
4. Keep commits logical and atomic
5. Write descriptive commit messages

### PR Title Format

- `Add: New feature or demo` - for new additions
- `Fix: Bug fix description` - for bug fixes
- `Improve: Enhancement details` - for improvements
- `Docs: Documentation updates` - for documentation

## Review Process

- Maintainers will review your PR within 1-2 weeks
- We may request changes or clarifications
- Once approved, your contribution will be merged
- You'll be credited in the changelog

## Code of Conduct

- Be respectful and inclusive
- Constructive feedback only
- Focus on code quality and learning
- No harassment or discrimination

## Questions?

- Check existing issues and discussions
- Open a new discussion for questions
- Review the README for general info
- Check Java documentation links in README

## Acknowledgments

Contributors who help improve this project are greatly appreciated and will be recognized in the repository.

---

Happy coding! We look forward to your contributions.
