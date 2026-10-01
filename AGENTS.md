# AS

FIB-UPC Software Architecture coursework: iterative TDD-driven pay-station system using design patterns (Strategy, Factory, State), based on Christensen's *Flexible, Reliable Software*.

## Architecture

- `p1/` — Calculator/Greetings warm-up example (pre pay-station).
- `p2/`, `p3/` — PayStation iterations 3 and 9 (TDD progression).
- `p4/`, `p4e/` — Strategy + Receipts (base + extension).
- `p5/`, `p5e/` — Strategy + Factory (base + extension).
- `p6/` — Strategy + State.

Java 8 + JUnit 4, Eclipse/IntelliJ projects (`.iml`, raw `src/` + `test/`). No Maven/Gradle.

## Build and Test

Open each iteration folder in IntelliJ/Eclipse and run the JUnit 4 suites under its `test/` (or `junit/com/`) directory.

## Pitfalls

Each iteration is an independent project that documents one stage of the TDD progression. `pXe` folders are extension exercises, not replacements for `pX`.

See [README.md](README.md).
