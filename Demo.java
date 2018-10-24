package homework;

public class Demo {
    public static void main(String[] args) {
        Apple apple = new Apple(66);
        Pear pear = new Pear(12);
        Apricot apricot = new Apricot(22);

        double a = apple.coast();
        double b = pear.coast();
        double c = apricot.coast();
        double sum = a + b + c;
        apple.printManufacturerInfo();
        System.out.println();
        System.out.println("Цена проданых яблок = " + apple.coast());
        System.out.println("Цена проданых груш = " + pear.coast());
        System.out.println("Цена проданых абрикос = " + apricot.coast());
        System.out.println("Общая цена проданых фруктов = " + sum);
    }
}
