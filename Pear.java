package homework;

public class Pear extends Fruit {
    private double pcoast = 15.0;
    public Pear(double weight) {
        super(weight);
    }

    public double getPcoast() {
        return pcoast;
    }

    public void setPcoast(double pcoast) {
        this.pcoast = pcoast;
    }

    @Override
    public double coast() {
        return weight * pcoast;
    }
}
