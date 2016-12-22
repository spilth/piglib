# piglib [![GitHub issues](https://img.shields.io/github/issues/spilth/piglib.svg?style=flat-square)](https://github.com/spilth/piglib/issues) [![Codeship](https://img.shields.io/codeship/738997f0-8269-0134-94fa-36079b336971/master.svg?style=flat-square)](https://app.codeship.com/projects/182480) [![Codacy branch grade](https://img.shields.io/codacy/grade/938a5a7ffa664db3b5054ab2144b91d9/master.svg?style=flat-square)](https://www.codacy.com/app/spilth/piglib/dashboard)

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
