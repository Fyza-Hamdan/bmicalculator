// Main.java
import java.util.Scanner;
import models.Person;
import services.BMIService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMIService bmiService = new BMIService();

        try {
            // Get user input
            System.out.print("Enter weight (in kg): ");
            double weight = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            double height = scanner.nextDouble();

            // Create person object
            Person person = new Person(weight, height);

            // Calculate BMI and get results
            double bmi = bmiService.calculateBMI(person);
            String category = bmiService.getBMICategory(bmi);

            // Display results
            System.out.printf("\nBMI Results:\n");
            System.out.printf("BMI: %.2f\n", bmi);
            System.out.printf("Category: %s\n", category);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}

