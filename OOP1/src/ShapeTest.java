public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Shape("ABC");
        Shape cuadrado = new Shape("ABCD", 8, 4);
        cuadrado.setName("Square ABCD");
        triangle.setArea(4);
        triangle.setPerimeter(6);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getName());
        //System.out.println(cuadrado.perimeter);
        //cuadrado.area = 0;
        //System.out.println(cuadrado.area);
        System.out.println(triangle);

    }
}
