package services;

import models.Person;
import utils.BMICalculator;

public class BMIService {
    public double calculateBMI(Person person) {
        return BMICalculator.calculateBMI(
                person.getWeightInKg(),
                person.getHeightInM()
        );
    }

    public String getBMICategory(double bmi) {
        return BMICalculator.getBMICategory(bmi);
    }
}

