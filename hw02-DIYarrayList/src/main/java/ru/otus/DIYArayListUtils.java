package ru.otus;

import java.util.Comparator;

public class DIYArayListUtils<T extends Comparable> {

    Comparator<T> cmp = new Comparator<>() {
        @Override
        public int compare(T o1, T o2) {

            Comparable a1 = (Comparable) o1;
            Comparable a2 = (Comparable) o2;
            return a1.compareTo(a2);
        }
    };

    static String staticVar = "static";
}
