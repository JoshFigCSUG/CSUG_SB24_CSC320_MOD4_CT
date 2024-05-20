import java.util.Scanner;

public class LoopingNumberStats {

    public static void main(String[] args) {
        
        // Declarations
        double total = 0.0;
        double average = 0.0;
        double maximum = Double.NEGATIVE_INFINITY; // Initialize max
        double minimum = Double.POSITIVE_INFINITY; // Initialize min
        final double interest = 0.20; // Interest rate does not change
        double[] numbers = new double[5]; 
        int count = 0;
        Scanner input = new Scanner(System.in);

        // Input and calculations
        System.out.println("This program takes five floating-point numbers and computes the total, average, maximum, minimum, and total with 20% interest.");
        while (count < 5) {
            System.out.print("Enter a floating-point number: ");
            // Error handling user input for floating-point number
            if (input.hasNextDouble()) {
            	numbers[count] = input.nextDouble();
            	total += numbers[count];
                                
                // Find maximum
                if (maximum < numbers[count]) {
                    maximum = numbers[count];
                }
                
                // Find minimum
                if (minimum > numbers[count]) {
                    minimum = numbers[count];
                }
                
                count++;
            }
            else {
            	System.out.println("Invalid input. Input must be a floating-point number.");
            	input.nextLine(); // remove invalid input
            }
            
        }
        // Calculate average
        average = total / 5;

        // Output Results
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Total with 20% interest: " + (total + (interest * total)));
        
        input.close();
    }
}
