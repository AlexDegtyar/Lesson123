package homework;

import java.util.Objects;

public abstract class Fruit {
    protected double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public abstract double coast();

    public void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;
        Fruit fruit = (Fruit) o;
        return Double.compare(fruit.weight, weight) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
