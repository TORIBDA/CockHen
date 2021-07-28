package TransportationPack;

public class Vehicle implements Transportation
{
    String vehicleName = "";
    int transportationPrice = 0;

    public Vehicle(String vehicleNameValue, int transportationPriceValue)
    {
        this.vehicleName = vehicleNameValue;
        this.transportationPrice = transportationPriceValue;
    }

    @Override
    public int getTransportationPrice() {
        return transportationPrice;
    }

    public String getVehicleName() {
        return vehicleName;
    }
}
