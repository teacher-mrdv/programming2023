public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDecimal() {
        return (double)numerator/denominator;
    }

    public boolean equals(Fraction another) {
        return this.toDecimal() == another.toDecimal();
    }

    public double compareTo(Fraction another) {
        return this.toDecimal() - another.toDecimal();
    }



}
