public class Square extends Shape {
    private double side;

    public Square(String name) {
        super(name);
        this.side = 1;
    }
    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public String toString() {
        return super.toString() + "\n" + this.getName() +
                "'s perimeter = " + this.getPerimeter() +
                "\t" + this.getName() + "'s area = " + this.getArea();
    }
}
