package ru.otus;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        DIYArrayList<Integer> myList1 = new DIYArrayList<>(30);
        DIYArrayList<Integer> myList2 = new DIYArrayList<>(30);
        DIYArayListUtils<Integer> Comp = new DIYArayListUtils<>();

        System.out.println(DIYArayListUtils.staticVar);

        System.out.println("Empty list");
        System.out.println(myList1);
        //Collections.addAll(myList1, 1, 7, 3);
        //Collections.addAll(myList2, 4, 4, 4);
        Collections.addAll(myList1, 1, 2, 3, 3, 1, 1, 1, 1, 1);
        Collections.addAll(myList2, 1, 2, 1, 3, 2, 2, 1, 1, 1);

        System.out.println("Original list");
        System.out.println(myList1);


        System.out.println("Replaced list");
        System.out.println(myList2);
        Collections.copy(myList2, myList1);
        System.out.println("List after copy");
        System.out.println(myList2);

        Collections.sort(myList1, Comp.cmp);
        System.out.println("Sorted list");
        System.out.println(myList1);
    }
}
