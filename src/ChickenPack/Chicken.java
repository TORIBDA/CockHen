package ChickenPack;

public abstract class Chicken
{
    private double chickenPrice = 0;
    public abstract double getPossibleChickenCount(double budgetValue);

    public double getChickenPrice() {
        return chickenPrice;
    }

    public void setChickenPrice(double chickenPrice) {
        //System.out.println("Setting Chicken Price: " + chickenPrice);
        this.chickenPrice = chickenPrice;
    }
}
