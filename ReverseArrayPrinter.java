package task;

import java.util.Arrays;

public class ReverseArrayPrinter {

    // Generic method to print an array in reverse order
    public static <T> void printArrayInReverse(T[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        System.out.print("Original Array: " + Arrays.toString(array) + "\nReversed Array: [");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArrayInReverse(intArray);

        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArrayInReverse(doubleArray);

        // Character array
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        printArrayInReverse(charArray);

        // String array
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
        printArrayInReverse(stringArray);

        // Empty array
        Integer[] emptyArray = {};
        printArrayInReverse(emptyArray);

        // Null array
        Integer[] nullArray = null;
        printArrayInReverse(nullArray);
    }
}