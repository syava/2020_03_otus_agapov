package ru.otus.reflection;

public class ReflectionIntro {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> classString = Class.forName("java.lang.String");
        System.out.println("simpleName:" + classString.getSimpleName());

        Class<Integer> classInt = int.class;
        System.out.println(classInt.getTypeName());

        Class<Integer> classInteger = Integer.class;
        System.out.println(classInteger.getTypeName());
    }
}
