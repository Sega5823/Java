public class Cat {

    private final double originWeight;
    private double weight;

    public Cat() {
        this(1500.0 + 3000.0 * Math.random());
    }

    public Cat(double weight) {
        this.weight = weight;
        this.originWeight = weight;
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public void pee() {
        weight = weight - 10;
        System.out.println("Clean it, man!");
    }

    public double getWeight() {
        return weight;
    }
}
