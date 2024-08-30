public class Square extends Shape {
    private double side;

    public Square(String name, double side) {
        super(name);
        this.side = side;
        this.setPerimeter(this.side * 4);
        this.setArea(this.side * this.side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }




}
