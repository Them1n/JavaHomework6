package org.example.Arrays;

public class MyArray {
    private String[] array;
    private int size;
    public MyArray(int capacity) {
        array = new String[capacity];
        size = 0;
    }
    public int length() {
        return size;
    }
    public void add(String element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Array is full, cannot add more elements.");
        }
    }
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return array[index];
    }
}
