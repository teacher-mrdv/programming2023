/*
 * Class to model a 2D geometrical shape
 * class name
 * attrbutes / instance variable / field
 * constructor
 */
public class Shape {
    private String name;
    private double perimeter;
    private double area;

    public Shape(String name) {
        this.name = name;
    }

    // overloaded constructor
    public Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }

    // accessor - allows us to READ the attribute
    public String getName() {
        return name;
    }

    // modifier - allows us to WRITE/modify the attribute
    public void setName(String name) {
        this.name = name;
    }

}
