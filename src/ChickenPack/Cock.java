package ChickenPack;

public class Cock extends Chicken{
    @Override
    public double getPossibleChickenCount(double budgetValue) {
        return Math.floor((budgetValue/super.getChickenPrice()));
    }
}
