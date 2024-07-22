package PizzaMenedgment;

public abstract class AbstractPizza implements ICook, IDeliver{
    private double price;
    private double weight;

    public AbstractPizza(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public AbstractPizza() {
        this.price = price;
        this.weight = weight;
    }

    public abstract void label();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
