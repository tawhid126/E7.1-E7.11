import java.util.ArrayList;
import java.util.Collections;

public class DataSet {
    private ArrayList<Double> values;

    public DataSet(int maximumNumberOfValues) {
        values = new ArrayList<>(maximumNumberOfValues);
    }

    public void add(double value) {
        values.add(value);
    }

    public double sum() {
        double totalSum = 0;
        for (double value : values) {
            totalSum += value;
        }
        return totalSum;
    }

    public double average() {
        if (values.isEmpty()) {
            return 0;
        }
        return sum() / values.size();
    }

    public double max() {
        if (values.isEmpty()) {
            throw new IllegalStateException("Cannot find max of an empty data set.");
        }
        return Collections.max(values);
    }

    public double min() {
        if (values.isEmpty()) {
            throw new IllegalStateException("Cannot find min of an empty data set.");
        }
        return Collections.min(values);
    }

    public void displayValues() {
        System.out.println(values);
    }

    public static void main(String[] args) {
        DataSet dataSet = new DataSet(10);

        dataSet.add(10.0);
        dataSet.add(20.0);
        dataSet.add(30.0);
        dataSet.add(40.0);

        System.out.println("Values: ");
        dataSet.displayValues();

        System.out.println("Sum: " + dataSet.sum());

        System.out.println("Average: " + dataSet.average());

        System.out.println("Max: " + dataSet.max());

        System.out.println("Min: " + dataSet.min());
    }
}
