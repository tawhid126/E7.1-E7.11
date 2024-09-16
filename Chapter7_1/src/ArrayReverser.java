import java.util.Arrays;

public class ArrayReverser {

    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Sample array to test the reverseArray method
        int[] array = {1, 2, 3, 4, 5};

        // Print the array before reversal
        System.out.println("Array before reversal: " + Arrays.toString(array));

        // Call the reverseArray method
        reverseArray(array);

        // Print the array after reversal
        System.out.println("Array after reversal: " + Arrays.toString(array));
    }
}
