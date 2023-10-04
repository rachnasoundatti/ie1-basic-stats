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
        
        double min = calculateMinimum(data);

        // Print the results
        System.out.println("Minimum: " + min);
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
    
    public static double calculateMinimum(ArrayList<Double> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty. Cannot calculate minimum.");
        }

        double min = numbers.get(0);
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
}

