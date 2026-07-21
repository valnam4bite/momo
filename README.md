# Mini Notes Engine

Mini Notes Engine is a lightweight Kotlin project that demonstrates how a personal knowledge base can be organized.

The application loads Markdown notes, extracts tags, detects links between notes and provides a simple search engine.

## Features

- Markdown note model
- Tag extraction
- Internal note links
- Keyword search
- Console preview
- Repository architecture

## Example

```
Loading notes...

Notes loaded: 4

Search: kotlin

Results

- Kotlin Basics
- Kotlin Collections

Tags

#kotlin
#programming

Connections

Kotlin Basics
 └── Kotlin Collections
```

Run

```bash
./gradlew run
```

The project uses built-in sample notes.
