package ChickenPack;

public class Chicks extends Chicken{
    @Override
    public double getPossibleChickenCount(double budgetValue) {
        return Math.floor((budgetValue/super.getChickenPrice()));
    }
}
