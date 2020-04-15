package ru.otus;
import java.util.*;
import java.util.function.Consumer;

public class DIYArrayList<T> implements List<T> {

    public T[] elements;

    private int modCount = 0;

    public DIYArrayList(int size) {
        Object[] objects = new Object[size];
        this.elements = (T[]) objects;
    }

    @Override
    public int size() {
        int count = 0;
        for (T element: this.elements) {
            if (element != null) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public boolean add(T t) {
        int size = this.size();
        this.elements[size] = t;

        return true;
    }

    @Override
    public String toString() {
        String str = "";
        for (T element: elements) {
            if (element != null) {
                str = str + " " + element; // StringBuilder
            }
        }
        return "DIYArrayList{" +
                "elements=" + str +
                '}';
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public T set(int index, T element) {
        elements[index] = element;
        return element;
    }

    @Override
    public Object[] toArray() {
        int size = this.size();
        Object[] myArray = new Object[size];
        int count = 1;
        for (T element: elements) {
            if (element != null) {
                myArray[count - 1] = (T) element;
                count++;
            }
        }
        return myArray;
    }


    @Override
    public void sort(Comparator<? super T> c) {
        final int expectedModCount = modCount;
        Arrays.sort((T[]) this.elements, 0, this.size(), c);
        if (modCount != expectedModCount)
            throw new ConcurrentModificationException();
        modCount++;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
