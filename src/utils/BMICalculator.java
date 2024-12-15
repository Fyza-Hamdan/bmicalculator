package utils;

public class BMICalculator {
    public static double calculateBMI(double weightInKg, double heightInM) {
        if (weightInKg <= 0 || heightInM <= 0) {
            throw new IllegalArgumentException("Weight and height must be positive values");
        }
        return weightInKg / (heightInM * heightInM);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}


