public class Car extends Vehicle
{
    private int doors;
    private static final double CARREGISTRATIONFEE = 100;
    private static int carCounter = 1000;

    public Car(int year, int doors)
    {
        super(generatePlate(), year, CARREGISTRATIONFEE);
        this.doors = doors;
    }

    public double getRegistrationFee()
    {
        return CARREGISTRATIONFEE;
    }

    private static String generatePlate()
    {
        carCounter++;
        return "LAC" + carCounter;
    }

    public String toString()
    {
        return super.toString() +
                ", Registration fee: $" + this.getRegistrationFee() +
                ", Doors: " + this.doors;
    }
}
