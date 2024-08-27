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

    // modifier/mutator - allows us to WRITE/modify the attribute
    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape name='" + name + '\'' +
                ", perimeter=" + perimeter +
                ", area=" + area;
    }
}
