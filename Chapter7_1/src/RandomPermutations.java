import java.util.Random;

public class RandomPermutations {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int p = 0; p < 10; p++) { // Generate ten permutations
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] permutedArray = new int[10];

            for (int i = nums.length - 1; i >= 0; i--) {
                int index = rand.nextInt(i + 1);
                permutedArray[nums.length - 1 - i] = nums[index];
                nums[index] = nums[i]; // Remove the chosen number from the pool
            }

            System.out.print("Permutation " + (p + 1) + ": ");
            for (int num : permutedArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}