package homework;

public class Apricot extends Fruit {
    private double acoast = 17.0;
    public Apricot(double weight) {
        super(weight);
    }

    public double getAcoast() {
        return acoast;
    }

    public void setAcoast(double acoast) {
        this.acoast = acoast;
    }

    @Override
    public double coast() {
        return weight * acoast;
    }
}
