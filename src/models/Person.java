package models;

public class Person {
    private double weightInKg;
    private double heightInM;

    public Person(double weightInKg, double heightInM) {
        this.weightInKg = weightInKg;
        this.heightInM = heightInM;
    }

    public double getWeightInKg() {
        return weightInKg;
    }

    public double getHeightInM() {
        return heightInM;
    }

    public void setWeightInKg(double weightInKg) {
        this.weightInKg = weightInKg;
    }

    public void setHeightInM(double heightInM) {
        this.heightInM = heightInM;
    }
}


