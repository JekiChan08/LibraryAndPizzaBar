package PizzaMenedgment;

public class Pepperoni extends AbstractPizza {
    private boolean sharp = false;

    public Pepperoni(double price, double weight, boolean sharp) {
        super(price, weight);
        this.sharp = sharp;
    }

    public Pepperoni(double price, double weight) {
        super(price, weight);
        this.sharp = sharp;
    }

    @Override
    public void cool() {
        System.out.println("Ваш пеперони готовиться");
    }

    @Override
    public void deliver() {
        System.out.println("Пеперони теперь в доставке");
    }

    @Override
    public void label() {
        System.out.println("Это пицца пеперони");
        if(sharp) {
            System.out.println("Пицца острая");
        }else {
            System.out.println("Пицца не острая");
        }
        System.out.println("Цена: " + getPrice());
        System.out.println("Вес в кг: " + getWeight());
    }

    public boolean isSharp() {
        return sharp;
    }

    public void setSharp(boolean sharp) {
        this.sharp = sharp;
    }
}

