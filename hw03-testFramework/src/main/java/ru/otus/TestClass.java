package ru.otus;

public class TestClass {

        @Before
        public void printName1() {
            System.out.println("Name");
        }

        @Test
        public void printName2() {
            System.out.println("Name");
        }

        @After
        public void printName3() {
            System.out.println("Name");
        }
}
