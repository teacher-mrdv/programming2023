public class Heavy extends Vehicle
{
    private double weight;
    private static final double HVREGISTRATIONFEE = 250;
    private static int heavyCounter = 1000;

    public Heavy(int year, double weight)
    {
        super(generatePlate(), year, HVREGISTRATIONFEE);
        this.weight = weight;
    }

    public double getRegistrationFee()
    {
        return HVREGISTRATIONFEE;
    }

    private static String generatePlate()
    {
        heavyCounter++;
        return "LAH" + heavyCounter;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String toString()
    {
        return super.toString() +
                ", Registration fee: $" + this.getRegistrationFee() +
                ", Weight: " + this.getWeight();
    }
}
