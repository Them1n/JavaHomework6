package org.example.Arrays;

public class MyArray3 {
    private String[] array;
    private int size;

    public MyArray3(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public int length() {
        return size;
    }

    public String get() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        String firstElement = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return firstElement;
    }

    public void put(String element) {
        if (size >= array.length) {
            String[] newArray = new String[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = element;
        size++;
    }
}
