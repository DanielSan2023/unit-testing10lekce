package com.engeto.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    @DisplayName("Test souctu dvoch cisel.")
    public void testScitani() {
        int actual = Calc.scitani(2, 3);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
        //Ak chcem cheknut > Assertions.assertTrue(actual > expected);
    }

    @Test
    @DisplayName("Test souctu dvoch cisel co se nerovaji nule.")
    public void testScitaniBiggerThenZero() {
        int actual = Calc.scitani(2, 3);
        Assertions.assertNotEquals(actual, 0);
    }

    @Test
    @DisplayName("Test delenie dvoch cisel.")
    public void testDeleni() {
        int actual = Calc.deleni(6, 3);
        int expected = 2;
        Assertions.assertEquals(2, actual);
    }

    @Test
    @DisplayName("Test delenie nulou.")
    public void testDeleniNulou() {
        Exception expected = Assertions.assertThrows(ArithmeticException.class, () ->
                Calc.deleni(12, 0));
        Assertions.assertEquals("/ by zero", expected.getMessage());

    }

    @Test
    @DisplayName("Test nasobeni cisel.")
    void nasobeni() {
        int actual = Calc.nasobeni(2, 3);
        int expected = 6;

        Assertions.assertEquals(actual, expected);
    }


}
