package com.kodilla.stream.beautifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoemBeautifierTest {

    PoemBeautifier poemBeautifier = new PoemBeautifier();

    @Test
    void beautifierUpperCase() {
        String text = "Patryk";

        String result = poemBeautifier.beautify(text, (myText) -> myText.toUpperCase());
        assertEquals(text.toUpperCase(), result);
    }

    @Test
    void beautifierWithExtraText() {
        String text = "My code doesn't work.";

        String result = poemBeautifier.beautify(text, (myText) -> myText + " I am Patryk");
        //assertEquals("My code doesn't work", result);
        assertEquals("My code doesn't work. I am Patryk", result);
    }
}
