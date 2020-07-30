package ru.otus;

import org.junit.Test;
import org.junit.Assert;

public class DIYArrayListTest {
    @Test 
    public void testDIYArrayList() {
        DIYArrayList<Integer> myList = new DIYArrayList<>(30);
        DIYArrayList<Integer> myNewList = new DIYArrayList<>(30);
        myList.add(1);
        myNewList.add(1);

        System.out.println(myList);
        System.out.println(myNewList);
//        assertThat(myList, CoreMatchers.hasItems(1));
        //Assert.assertEquals(myList,myNewList);
    }
    @Test
    public void addItemsTest() {
        DIYArrayList<Integer> list = new DIYArrayList<>(2);
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(3, list.size());
    }

    @Test
    public void addItemsWithoutParamTest() {
        DIYArrayList<Integer> list = new DIYArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(3, list.size());
    }
}
