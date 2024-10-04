public class FractionTest {
    public static void main(String[] args) {
        Fraction one = new Fraction(1,2);
        System.out.println(one);
        System.out.println(one.toDecimal());
        Fraction two = new Fraction(4, 8);
        System.out.println(two);
        System.out.println(two.toDecimal());
        System.out.println(one.equals(two));
        System.out.println(one.compareTo(two));
        Fraction three = new Fraction(1, 4);
        System.out.println(one.compareTo(three));
        System.out.println(three.compareTo(one));
    }
}
