public class AlternatingSumCalculator {

    public static int alternatingSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sum += array[i];
            } else {
                sum -= array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 30};

        int result = alternatingSum(array);

        System.out.println("The alternating sum of the array is: " + result);
    }
}
