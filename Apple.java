package homework;

public class Apple extends Fruit {
    private double appcoast = 12.0;

    public Apple(double weight) {
        super(weight);
    }

    public double getAppcoast() {
        return appcoast;
    }

    public void setAppcoast(double appcoast) {
        this.appcoast = appcoast;
    }

    @Override
    public double coast() {
        return weight * appcoast;
    }

}

