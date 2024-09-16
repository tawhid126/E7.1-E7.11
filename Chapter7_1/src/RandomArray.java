import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100); // Random integers between 0 and 99
        }

        System.out.println("Elements at even indices:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nEven elements:");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\nAll elements in reverse order:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nFirst and last element:");
        System.out.println(array[0] + " " + array[array.length - 1]);
    }
}