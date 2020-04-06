package ru.otus;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloOtusTest {
    @Test public void testGuavaString() {
        HelloOtus classTest = new HelloOtus();
        assertEquals(classTest.checkString(""), "String is empty");
        assertEquals(classTest.checkString("Test"), "String is not empty");
    }
}
