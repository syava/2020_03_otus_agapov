package ru.otus;

public class TestClass {
        @After
        public void afterOne() {
            System.out.println("AfterOne");
        }

        @Test
        public void test() {
            System.out.println("test");
        }

        @Before
        public void before() {
            System.out.println("Before");
        }

        @After
        public void afterTwo() {
            System.out.println("AfterTwo");
        }
}
