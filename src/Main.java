import ChickenPack.Chicks;
import ChickenPack.Cock;
import ChickenPack.Hen;
import TransportationPack.Vehicle;
import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        //For #1 Requirement:
        System.out.println("\n~~For Requirement #1~~");
        showPossibleCombinationOfChickens(100.0, 100.0);

        //For #2 Requirement:
        System.out.println("\n~~For Requirement #2~~");
        showPossibleVehicleForTransportation();
    }

    private static void showPossibleCombinationOfChickens(double budgetValue, double chickenCount)
    {
        System.out.println("Budget Value: " + budgetValue);
        System.out.println("Chicken Count Needed: " + chickenCount);
        Cock cock = new Cock();
        cock.setChickenPrice(5);
        Hen hen = new Hen();
        hen.setChickenPrice(3);
        Chicks chicks = new Chicks();
        chicks.setChickenPrice((1.0/3.0));

        double cockItr;
        double henItr;
        double chicksItr;
        System.out.println("Possible Combination(s): ");
        for(cockItr=cock.getPossibleChickenCount(budgetValue); cockItr>=0; cockItr-= ((cock.getChickenPrice()%1!=0)
                ?(Math.floor(cock.getChickenPrice())+ Math.floor(1/(cock.getChickenPrice()%1)))
                :1))
        {
            for(henItr=hen.getPossibleChickenCount(budgetValue); henItr>=0; henItr-= ((hen.getChickenPrice()%1!=0)
                    ?(Math.floor(hen.getChickenPrice())+ Math.floor(1/(hen.getChickenPrice()%1)))
                    :1))
            {
                for(chicksItr=chicks.getPossibleChickenCount(budgetValue); chicksItr>=0; chicksItr-= ((chicks.getChickenPrice()%1!=0)
                        ?(Math.floor(chicks.getChickenPrice())+ Math.floor(1/(chicks.getChickenPrice()%1)))
                        :1))
                {
                    if((cockItr*cock.getChickenPrice()+henItr*hen.getChickenPrice()+chicksItr*chicks.getChickenPrice())==budgetValue
                            && (cockItr+henItr+chicksItr)==chickenCount)
                    {
                        System.out.println("Cock: " + cockItr + " Hen: " + henItr + " Chicks: " + chicksItr);
                        break;
                    }
                }
            }
        }
    }

    private static void showPossibleVehicleForTransportation()
    {
        Person xiaoming = new Person(500);
        LinkedList<Vehicle> vehicle = new LinkedList<>();
        vehicle.push(new Vehicle("Car", 500));
        vehicle.push(new Vehicle("Bus", 300));
        vehicle.push(new Vehicle("Train", 400));
        vehicle.push(new Vehicle("Plane", 1000));

        System.out.println("Xiaoming Possible Mode of Transportation(s): ");
        for(Vehicle vehicleInstance : vehicle)
        {
            if(((xiaoming.getBudgetTotal()-vehicleInstance.getTransportationPrice())) >= 0)
            {
                System.out.println(vehicleInstance.getVehicleName());
            }
        }
    }
}
