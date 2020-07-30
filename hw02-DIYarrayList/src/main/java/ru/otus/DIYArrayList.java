package ru.otus;
import java.util.*;
import java.util.function.Consumer;

public class DIYArrayList<T> implements List<T> {
    private T[] elements;

    private int size = 0;

    private int modCount = 0;

    public DIYArrayList(int size) {
        Object[] objects = new Object[size];
        this.elements = (T[]) objects;
    }

    public DIYArrayList() {
        Object[] objects = {};
        this.elements = (T[]) objects;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T t) {
        if (size == this.elements.length) {
            resize();
        }
        this.elements[size] = t;
        size++;

        return true;
    }

    private void resize() {
        Object[] objects = new Object[size + 1];
        T[] new_elements = (T[]) objects;
        System.arraycopy(elements, 0, new_elements, 0, elements.length);
        elements = new_elements;
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
        return Arrays.copyOf(elements, size);
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
    public ListIterator<T> listIterator() {
        return new ListItr();
    }

    private class Itr implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

    private class ListItr extends Itr implements ListIterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public T previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(T e) {

        }

        @Override
        public void add(T e) {

        }
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
        throw new UnsupportedOperationException();
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
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }


}
