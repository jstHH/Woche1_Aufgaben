package jst.aufgaben;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceTest {
    Novice test = new Novice();

    @Test
    void createStringMyName() {
        String ergebnis = "Mein Name ist Joachim";
        assertEquals(ergebnis, test.createStringMyName("Joachim"));
    }

    @Test
    void createStringMyNameByFive() {
        String ergebnis = "Mein Name ist Joachim\nMein Name ist Joachim\nMein Name ist Joachim\nMein Name ist Joachim\nMein Name ist Joachim\n";
        assertEquals(ergebnis, test.createStringMyNameByFive("Joachim"));
    }

    @Test
    void isGreaterThen100_when100_thenFalse() {
        assertFalse(test.isGreaterThen100(100));
    }

    @Test
    void isGreaterThen100_when101_thenTrue() {
        assertTrue(test.isGreaterThen100(101));
    }

    @Test
    void squareOf() {
        assertEquals(4, test.squareOf(2));
    }

    @Test
    void greatMe() {
        String ergebnis = "Hallo Hans! Ich grüße dich!";
        assertEquals(ergebnis, test.greatMe("Hans"));
    }
}