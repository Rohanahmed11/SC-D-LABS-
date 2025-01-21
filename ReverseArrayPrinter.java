package Lab8;
import java.util.Arrays;

public class ReverseArrayPrinter {

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
        Integer[] intArray = {1, 2, 3, 4};
        printArrayInReverse(intArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        printArrayInReverse(doubleArray);

        Character[] charArray = {'A', 'B', 'C', 'D'};
        printArrayInReverse(charArray);

        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
        printArrayInReverse(stringArray);

        Integer[] emptyArray = {};
        printArrayInReverse(emptyArray);

        Integer[] nullArray = null;
        printArrayInReverse(nullArray);
    }
}