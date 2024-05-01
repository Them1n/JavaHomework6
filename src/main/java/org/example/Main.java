package org.example;
import org.example.Arrays.MyArray;
import org.example.Arrays.MyArray2;
import org.example.Arrays.MyArray3;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(5);
        myArray.add("1st");
        myArray.add("2nd");
        myArray.add("3rd");
        myArray.add("4rd");
        myArray.add("5rd");
        myArray.add("6rd");
        System.out.println("Length: " + myArray.length());

        MyArray2 myArrayy = new MyArray2(2);
        myArrayy.put("Hello");
        myArrayy.put("World");
        myArrayy.put("Dudes");
        System.out.println("Length: " + myArrayy.length());

        MyArray3 myArrayyy = new MyArray3(3);
        myArrayyy.put("first");
        myArrayyy.put("second");
        myArrayyy.put("third");

        System.out.println("First element: " + myArrayyy.get());
        System.out.println("Length after get(): " + myArrayyy.length());
    }
}