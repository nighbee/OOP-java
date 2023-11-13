package Lab2.problem5;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;

    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getPotentialDifference() {
        return potentialDifference;
    }

    public void setPotentialDifference(double potentialDifference) {
        this.potentialDifference = potentialDifference;
    }
}