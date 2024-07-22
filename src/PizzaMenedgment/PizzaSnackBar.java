package PizzaMenedgment;

public class PizzaSnackBar {
    private Pepperoni pepperoni;
    private Margaret margaret;
    private LaFeints laFeints;

    public PizzaSnackBar() {

    }

    public void orderPeperoni(Pepperoni pepperoni, boolean sharp) {
        System.out.println("Вы заказали пиццу Пеперони");
        pepperoni.cool();
        pepperoni.deliver();
        pepperoni.setSharp(true);
        pepperoni.label();
    }
    public void orderMargaret(Margaret margaret, boolean meat) {
        System.out.println("вы заказали пиццу Марагарита");
        margaret.cool();
        margaret.deliver();
        margaret.setMeat(true);
        margaret.label();
    }
    public void orderLaFeints(LaFeints laFeints, boolean mushrooms) {
        System.out.println("вы заказали пиццу LaFeints");
        laFeints.cool();
        laFeints.deliver();
        laFeints.setMushrooms(true);
        laFeints.label();
    }


    public LaFeints getLaFeints() {
        return laFeints;
    }

    public Margaret getMargaret() {
        return margaret;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }
}
