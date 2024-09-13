/*
 * Class to model a 2D geometrical shape
 * class name
 * attributes / instance variable / field
 * constructor
 */
public abstract class Shape {
    private String name;

    // empty constructor
    public Shape() {
        this.name = "Shape";
    }
    // overloaded constructor
    public Shape(String name) {
        this.name = name;
    }
    // accessor - allows us to READ the attribute
    public String getName() {
        return name;
    }

    // modifier/mutator - allows us to WRITE/modify the attribute
    public void setName(String name) {
        this.name = name;
    }

    abstract public double getPerimeter();
    abstract public double getArea();
    @Override
    public String toString() {
        return "Shape name: " + name +
                " | Shape class: " + this.getClass().getName();
    }
}
