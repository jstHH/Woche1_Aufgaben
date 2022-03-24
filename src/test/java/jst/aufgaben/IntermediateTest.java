package jst.aufgaben;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateTest {
    Intermediate test = new Intermediate();

    @Test
    void getNumberName() {
        String ergebnis = "sieben";
        assertEquals(ergebnis, test.getNumberName(7));
    }

    @Test
    void isDivideableByThree_when9_thenTrue() {
        assertTrue(test.isDivideableByThree(9));
    }

    @Test
    void isDivideableByThree_when8_thenFalse() {
        assertFalse(test.isDivideableByThree(8));
    }

    @Test
    void isDivideableByFive() {
        assertTrue(test.isDivideableByFive(25));
    }

    @Test
    void getStringForNumber() {
        String ergebnis = "$#60";
        assertEquals(ergebnis, test.getStringForNumber(60));
    }
}