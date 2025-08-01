package com.kodilla.stream.beautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Lorem Impusm", (text) -> text.toUpperCase() + " :)");
        poemBeautifier.beautify("My code", (text) -> text.toLowerCase() + " lenght "  + text.length());
        poemBeautifier.beautify("My code doesn't work", (text) -> text + " :/" + "I'am Patryk.");

    }
}
