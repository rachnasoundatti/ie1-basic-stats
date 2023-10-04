import java.util.ArrayList;

public class MinMaxCalculation {

    public static void calculateMinMax(Numbers numbers) {
        // Access the data from the Numbers object
        ArrayList<Double> data = numbers.getData();

        if (data.isEmpty()) {
            System.out.println("No data available.");
            return;
        }

        double max = calculateMaximum(data);

        // Print the results
        System.out.println("Maximum: " + max);
    }

    public static double calculateMaximum(ArrayList<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty. Cannot calculate maximum.");
        }

        double max = numbers.get(0);
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

