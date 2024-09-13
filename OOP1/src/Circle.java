public class Circle extends Shape {
    private double radius;

    public Circle(String name) {
        super(name);
        this.radius = 1;
    }
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPermeter() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return super.toString() + " radius = " + radius;
    }

}
