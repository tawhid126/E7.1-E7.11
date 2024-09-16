import java.util.HashSet;
import java.util.Set;

public class ArrayMethods {
    private int[] values;

    public ArrayMethods(int[] initialValues) {
        values = initialValues;
    }

    public void swapFirstAndLast() {
        if (values.length > 1) {
            int temp = values[0];
            values[0] = values[values.length - 1];
            values[values.length - 1] = temp;
        }
    }

    public void shiftRight() {
        if (values.length > 1) {
            int lastElement = values[values.length - 1];
            for (int i = values.length - 1; i > 0; i--) {
                values[i] = values[i - 1];
            }
            values[0] = lastElement;
        }
    }

    public void replaceEvensWithZero() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 2 == 0) {
                values[i] = 0;
            }
        }
    }

    public void replaceWithLargerNeighbors() {
        if (values.length < 3) return; // Need at least three elements
        for (int i = 1; i < values.length - 1; i++) {
            values[i] = Math.max(values[i - 1], values[i + 1]);
        }
    }

    public void removeMiddle() {
        int length = values.length;
        if (length == 0) return;

        int newLength = length % 2 == 0 ? length - 2 : length - 1;
        int[] newArray = new int[newLength];

        int midIndex = length / 2;
        for (int i = 0, j = 0; i < length; i++) {
            if (length % 2 == 0 && (i == midIndex || i == midIndex - 1)) continue;
            if (length % 2 != 0 && i == midIndex) continue;
            newArray[j++] = values[i];
        }

        values = newArray;
    }

    public void moveEvensToFront() {
        int[] newArray = new int[values.length];
        int index = 0;

        for (int value : values) {
            if (value % 2 == 0) {
                newArray[index++] = value;
            }
        }

        for (int value : values) {
            if (value % 2 != 0) {
                newArray[index++] = value;
            }
        }

        values = newArray;
    }

    public Integer secondLargest() {
        Integer largest = null, secondLargest = null;

        for (int value : values) {
            if (largest == null || value > largest) {
                secondLargest = largest;
                largest = value;
            } else if ((secondLargest == null || value > secondLargest) && value != largest) {
                secondLargest = value;
            }
        }

        return secondLargest;
    }

    public boolean isSorted() {
        for (int i = 1; i < values.length; i++) {
            if (values[i] < values[i - 1]) return false;
        }
        return true;
    }

    public boolean hasAdjacentDuplicates() {
        for (int i = 1; i < values.length; i++) {
            if (values[i] == values[i - 1]) return true;
        }
        return false;
    }

    public boolean hasDuplicates() {
        Set<Integer> seenValues = new HashSet<>();

        for (int value : values) {
            if (!seenValues.add(value)) {
                return true;
            }
        }

        return false;
    }

    public void printValues() {
        for (int value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] initialValues = {4, 5, 6, 7, 8, 9};

        ArrayMethods arrayMethods = new ArrayMethods(initialValues);

        System.out.println("Original array:");
        arrayMethods.printValues();

        arrayMethods.swapFirstAndLast();
        System.out.println("After swapping first and last:");
        arrayMethods.printValues();

        arrayMethods.shiftRight();
        System.out.println("After shifting right:");
        arrayMethods.printValues();

        arrayMethods.replaceEvensWithZero();
        System.out.println("After replacing evens with zero:");
        arrayMethods.printValues();

        arrayMethods.replaceWithLargerNeighbors();
        System.out.println("After replacing with larger neighbors:");
        arrayMethods.printValues();

        arrayMethods.removeMiddle();
        System.out.println("After removing middle element(s):");
        arrayMethods.printValues();

        arrayMethods.moveEvensToFront();
        System.out.println("After moving evens to front:");
        arrayMethods.printValues();

        Integer secondLargestValue = arrayMethods.secondLargest();
        System.out.println("Second largest element: " + secondLargestValue);

        boolean isSortedValue = arrayMethods.isSorted();
        System.out.println("Is sorted: " + isSortedValue);

        boolean hasAdjacentDuplicatesValue = arrayMethods.hasAdjacentDuplicates();
        System.out.println("Has adjacent duplicates: " + hasAdjacentDuplicatesValue);

        boolean hasDuplicatesValue = arrayMethods.hasDuplicates();
        System.out.println("Has duplicates: " + hasDuplicatesValue);
    }
}