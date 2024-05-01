package org.example.Arrays;

public class MyArray2 {
    private String[] array;
    private int size;

    public MyArray2(int capacity) {
        array = new String[capacity];
        size = 0;
    }

    public int length() {
        return size;
    }

    public void put(String element) {
        if (size >= array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = element;
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return array[index];
    }

}
