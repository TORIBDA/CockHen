package ChickenPack;

public class Hen extends Chicken{
    @Override
    public double getPossibleChickenCount(double budgetValue) {
        return Math.floor((budgetValue/super.getChickenPrice()));
    }
}
