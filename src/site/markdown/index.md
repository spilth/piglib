# piglib

A Java library for converting English to Pig Latin.

## Usage

Add piglib as a dependency:

```xml
<dependency>
    <groupId>org.spilth</groupId>
    <artifactId>piglib</artifactId>
    <version>1.0.4</version>
</dependency>
```

Then use the `Translator` class to translate text:

```java
Translator translator = new Translator();
String translatedWord = translator.translateWord("java");
String translatedSentence = translator.toPiglatin("I love Java!");
```
