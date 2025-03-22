public class Vehicle
{
    private String plate;
    private int year;
    private double registrationFee;
    private Owner owner;

    public Vehicle() { }

    public Vehicle(String plate, int year, double registrationFee)
    {
        this.plate = plate;
        this.year = year;
        this.registrationFee = registrationFee;
    }

    public String getPlate()
    {
        return plate;
    }

    public double getRegistrationFee()
    {
        return registrationFee;
    }

    public void setRegistrationFee(double registrationFee)
    {
        this.registrationFee = registrationFee;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    @Override
    public String toString()
    {
        return "Vehicle plate " + plate + ", year " + year;
    }
}
