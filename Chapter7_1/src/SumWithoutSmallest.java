public class SumWithoutSmallest {

    public static int sumWithoutSmallest(int[] values) {
        int sum = 0;
        int smallest = Integer.MAX_VALUE;

        for (int value : values) {
            sum += value;
            if (value < smallest) {
                smallest = value;
            }
        }

        return sum - smallest;
    }

    public static void main(String[] args) {
        int[] values = {5, 3, 8, 1, 4};

        int result = sumWithoutSmallest(values);

        System.out.println("The sum without the smallest value is: " + result);
    }
}
