package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @Test
    public void testMax_AEqualB() {
        assertEquals(4, MathUtils.max(4, 4));
    }

    @Test
    public void testMax_ALessThanB() {
        assertEquals(9, MathUtils.max(2, 9));
    }

    @Test
    public void testMax_IntegerMinValue() {
        assertEquals(0, MathUtils.max(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testMax_IntegerMaxValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testDivide_PositiveB() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    public void testDivide_NegativeB() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    public void testDivide_BEqualZero() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> MathUtils.divide(10, 0)
        );

        assertEquals("Divider must not be zero", exception.getMessage());
    }
}