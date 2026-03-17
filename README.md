# AS

Software Architecture course assignments implementing a pay station system using TDD and design patterns, based on "Flexible, Reliable Software" by Henrik B. Christensen.

## Overview

Iterative development of a parking pay station with:

- **Strategy pattern** for interchangeable rate strategies (linear, progressive)
- **Factory pattern** for city-specific configurations (Boston, New York)
- **State pattern** for pay station behavior management
- **Test-Driven Development** with JUnit 4

## Structure

```
├── p5/     # PayStation with Strategy + Factory patterns
├── p5e/    # Extended PayStation variant
└── p6/     # PayStation with Strategy pattern + State pattern
    └── PayStationTDD - Strategy/
        └── src/
            ├── paystation/domain/   # PayStationImpl, RateStrategy, Receipt
            └── junit/com/           # JUnit test suites
```

## Tech Stack

- **Java 8** with JUnit 4
- **Eclipse** / IntelliJ IDEA
