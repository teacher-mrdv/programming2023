public class Bus extends Vehicle
{
    private int passengers;
    private static final double BUSREGISTRATIONFEE = 200;
    private static int busCounter = 1000;

    public Bus(int year, int passengers)
    {
        super(generatePlate(), year, BUSREGISTRATIONFEE);
        this.passengers = passengers;
    }

    public double getRegistrationFee()
    {
        return BUSREGISTRATIONFEE;
    }

    private static String generatePlate()
    {
        busCounter++;
        return "LAB" + busCounter;
    }

    public int getPassengers()
    {
        return passengers;
    }

    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }

    public String toString()
    {
        return super.toString() +
                ", Registration fee: $" + this.getRegistrationFee() +
                ", Passengers: " + this.passengers;
    }
}
