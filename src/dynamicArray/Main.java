package dynamicArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"a","a"};
        DynamicArray dynamicArray = new DynamicArray(arr);
        //dynamicArray.printArray();
        //dynamicArray.addElement("aaa");
       //dynamicArray.printArray();
       dynamicArray.removeElement(0);
       dynamicArray.printArray();
    }
}
