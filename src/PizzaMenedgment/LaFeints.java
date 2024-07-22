package PizzaMenedgment;

public class LaFeints extends AbstractPizza {
    private boolean mushrooms = false;

    public LaFeints(double price, double weight, boolean mushrooms) {
        super(price, weight);
        this.mushrooms = mushrooms;
    }

    public LaFeints(double price, double weight) {
        super(price, weight);
        this.mushrooms = mushrooms;

    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    @Override
    public void cool() {
        System.out.println("ваш LaFeints готовиться");
    }

    @Override
    public void deliver() {
        System.out.println("Ваш LaFeints в доставке");
    }

    @Override
    public void label() {
        System.out.println("эта пицца La Faints");
        if(mushrooms) {
            System.out.println("пицца с грибами");
        } else {
            System.out.println("Пицца без грибов");
        }
        System.out.println("Цена: " + getPrice());
        System.out.println("Вес в кг: " + getWeight());
    }
}
