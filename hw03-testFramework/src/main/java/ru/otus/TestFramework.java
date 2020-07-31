package ru.otus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class TestFramework {
    public static void main(String[] args) {
    }

    public void methods() {
        Class<TestClass> clazz = TestClass.class;

        Method[] methods = clazz.getDeclaredMethods();
        Arrays.stream(methods).forEach(method -> System.out.println(method.getName()));

        ArrayList<Method> beforeMethods = new ArrayList();
        ArrayList<Method> testMethods = new ArrayList();
        ArrayList<Method> afterMethods = new ArrayList();

        for(Method method : methods) {
            if(method.isAnnotationPresent(Before.class)) {
                beforeMethods.add(method);
            }
            if(method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            }
            if(method.isAnnotationPresent(After.class)) {
                afterMethods.add(method);
            }
        }
    }
}
