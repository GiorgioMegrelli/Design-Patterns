# Design Patterns

<b>See books in ```/books``` directory</b>
</br>
<b>See principles of programming in ```/principles``` directory</b>

### Patterns:

* [Adapter](https://refactoring.guru/design-patterns/adapter)
* [Builder](https://refactoring.guru/design-patterns/builder)
* [Chain of Responsibility](https://www.geeksforgeeks.org/chain-responsibility-design-pattern/)
* [Composite](https://www.geeksforgeeks.org/composite-design-pattern/)
* [Decorator](https://refactoring.guru/design-patterns/decorator)
* [Factory Method](https://refactoring.guru/design-patterns/factory-method)
* [Observer](https://refactoring.guru/design-patterns/observer)
* [Prototype](https://refactoring.guru/design-patterns/prototype)
* [Singleton](https://refactoring.guru/design-patterns/singleton)
* [Strategy](https://refactoring.guru/design-patterns/strategy)

## Running patterns using gradle

### Available Tasks:

<b><i>patternsHelp</i></b> - Prints all generated tasks for patterns

```shell
# Input:
./gradlew patternsHelp

# Output:
adapter
    build :adapterBuild
    jar   :adapterJar
    run   :adapterRun
    clean :adapterClean
# and so on...
```

<b><i>patternsRunAll</i></b> - Runs all :*Run tasks of patterns

```shell
# Input:
./gradlew patternsRunAll

# Output:
:adapterBuild
:adapterJar
:adapterRun
# and so on for each pattern...
```

<b><i>patternsCleanAll</i></b> - Runs all :*Clean tasks of patterns

```shell
./gradlew patternsCleanAll
```

### Register pattern within build.gradle

To register a pattern use following function in `build.gradle`

```groovy
def pattern(String dirName, String taskPrefix = null) {}
```

- dirName - Directory which contains source code of pattern
- taskPrefix - `[Optional]` Prefix of generated tasks of each pattern. Default value is equal to `dirName`

It registers four tasks associated with the pattern. They have the following format (see short descriptions):
- `<taskPrefix>Build` - Compiles sources files into `build/classes/<dirName>/<dirName>/`
- `<taskPrefix>Jar` - Builds compiled class files into a single jar `build/libs/<dirName>.jar`
- `<taskPrefix>Run` - Runs the generated jar file
- `<taskPrefix>Clean` - Cleans generated files

<b>Each directory of pattern MUST have `Example` class because it is considered as initial point</b>

### See some additional functionality in `buildSrc`

## TODOs, Notes

<i><b>Note #1:</b> Some of examples are taken from external resources.</i>
<br>
<i><b>Note #2:</b> The repository is open to modifications.</i>
