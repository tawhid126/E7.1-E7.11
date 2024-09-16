public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 4};

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}