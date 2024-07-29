package BillsBurgerChallenge;

public class DeluxeBurger extends BillsBurgerChallenge.Burger {

    private BillsBurgerChallenge.Addition potatoes;
    private BillsBurgerChallenge.Addition drink;

    public DeluxeBurger(String name, String bread, String meat, double price) {
        super(name, bread, meat, price);
        this.drink = new BillsBurgerChallenge.Addition("drink", 5.2);
        this.potatoes = new BillsBurgerChallenge.Addition("potatoes", 8.9);
        super.addIngredient(drink);
        super.addIngredient(potatoes);
    }

    @Override
    public void printExtraAdditions() {
        System.out.println("----------------EXTRA ADDITIONS-------------------");
        printAdditionPrice(1, this.drink);
        printAdditionPrice(2, this.potatoes);
    }

    @Override
    public void checkBill() {
        printExtraAdditions();
        super.checkBill();
    }
}
