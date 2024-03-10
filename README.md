# Design Patterns

<b>See books in ```/books``` directory</b>

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

## TODOs, Notes

<i><b>Note #1:</b> Some of examples are taken from external resources.</i>
<br>
<i><b>Note #2:</b> The repository is open to modifications.</i>
