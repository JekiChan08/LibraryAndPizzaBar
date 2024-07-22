package PizzaMenedgment;

public class Margaret extends AbstractPizza {
    private boolean meat = false;

    public Margaret(double price, double weight, boolean meat) {
        super(price, weight);
        this.meat = meat;
    }

    public Margaret(double price, double weight) {
        super(price, weight);
        this.meat = meat;
    }

    public boolean isMeat() {
        return meat;
    }

    public void setMeat(boolean meat) {
        this.meat = meat;
    }

    @Override
    public void cool() {
        System.out.println("Ваш маргарита готовиться");
    }

    @Override
    public void deliver() {
        System.out.println("Теперь ваш Маргарита в достовке");
    }

    @Override
    public void label() {
        System.out.println("Эта пицца маргарита");
        if(meat) {
            System.out.println("Пицца с мясом");
        }else {
            System.out.println("Пицца без мяса");
        }
        System.out.println("Цена: " + getPrice());
        System.out.println("Вес в кг: " + getWeight());
    }
}
