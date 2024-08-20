public class ShapeTest {
    public static void main(String[] args) {
        Shape triangle = new Shape("ABC");
        Shape cuadrado = new Shape("ABCD", 8, 4);
        cuadrado.setName("Square ABCD");
        System.out.println(cuadrado.getName());
        //System.out.println(cuadrado.perimeter);
        //cuadrado.area = 0;
        //System.out.println(cuadrado.area);
        System.out.println(triangle);

    }
}
