package ru.otus;

import org.junit.Test;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

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

    @Test
    public void addNulls() {
        DIYArrayList<Integer> list = new DIYArrayList<>(2);
        if (list.add(null)) {
            // Вроде как null добавилось успешно, размер должен быть 1
            Assert.assertEquals(1, list.size());
        } else {
            Assert.assertEquals(0, list.size());
        }
    }

    @Test
    public void iteratorTest() {
        List<Integer> dest = new DIYArrayList<>();
        List<Integer> src = new DIYArrayList<>();

        Collections.addAll(src, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Collections.addAll(dest, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        Collections.copy(dest, src);

        Assert.assertArrayEquals(src.toArray(), dest.toArray());
    }
}
