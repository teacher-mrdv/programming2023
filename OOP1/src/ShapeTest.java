public class ShapeTest {
    public static void main(String[] args) {
        //Shape something = new Shape();
        //System.out.println(something);
        //something.setName("Ah Meng");
        //System.out.println(something);
        Square cuadrado = new Square("ABCD", 2);
        System.out.print(cuadrado.getName());
        System.out.println(" | Perimeter = " + cuadrado.getPerimeter());
        System.out.println(cuadrado);
        System.out.println();
        Circle o = new Circle("O", 5);
        System.out.println(o);
    }
}
