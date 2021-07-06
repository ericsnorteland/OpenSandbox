package org.eds.epi.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class InterconvertStringsAndIntegersTest {

    @Test
    public void testNullString() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        Assertions.assertThrows(RuntimeException.class, () -> s.stringToInt(null));
    }

    @Test
    public void testEmptyString() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        Assertions.assertThrows(RuntimeException.class, () -> s.stringToInt(""));
    }

    @Test
    public void testNegativeString() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        String value = "-1";
        int ans = s.stringToInt(value);
        assertEquals(Integer.parseInt(value), ans);
    }

    @Test
    public void testTwoDigitString() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        String value = "12";
        int ans = s.stringToInt(value);
        assertEquals(Integer.parseInt(value), ans);
    }

    @Test
    public void testThreeDigitString() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        String value = "451";
        int ans = s.stringToInt(value);
        assertEquals(Integer.parseInt(value), ans);
    }

    @Test
    public void testLargerThanMaxInt() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        String value = String.valueOf(Integer.MAX_VALUE) + "1";
        AtomicInteger ans = new AtomicInteger();
        Assertions.assertThrows(RuntimeException.class, () -> {
            ans.set(s.stringToInt(value));
        });
        assertEquals(Integer.parseInt(value), ans.get());
    }

    @Test
    public void testNegativeOne() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        int value = -1;
        String ans = s.intToString(value);
        assertEquals("-1", ans);
    }

    @Test
    public void testOne() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        int value = 1;
        String ans = s.intToString(value);
        assertEquals("1", ans);
    }

    @Test
    public void testZero() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        int value = 0;
        String ans = s.intToString(value);
        assertEquals("0", ans);
    }

    @Test
    public void testTwoDigitNumber() {
        InterconvertStringsAndIntegers s = new InterconvertStringsAndIntegers();
        int value = 12;
        String ans = s.intToString(value);
        assertEquals("12", ans);
    }
}