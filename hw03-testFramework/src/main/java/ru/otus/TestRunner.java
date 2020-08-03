package ru.otus;

import java.lang.reflect.InvocationTargetException;

public class TestRunner {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        TestFramework runner = new TestFramework();
        runner.methods();
    }
}
