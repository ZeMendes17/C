public class Fraction {
    int numerator;
    int denominator;

    // constructor
    public Fraction(int numerator, int denominator){
        // if the denominator is negative put the signal in numerator
        if(denominator < 0){
            numerator = -numerator;
            denominator = -denominator;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    public Fraction add(Fraction other){
        Fraction sum = new Fraction(0, 1);

        sum.denominator = this.denominator * other.denominator;
        sum.numerator = numerator * other.denominator + other.numerator * denominator;

        sum.reduce();
        return sum;
    }

    public Fraction sub(Fraction other){
        Fraction sub = new Fraction(0, 1);

        sub.denominator = this.denominator * other.denominator;
        sub.numerator = numerator * other.denominator - other.numerator * denominator;

        sub.reduce();
        return sub;
    }

    public Fraction divide(Fraction other){
        Fraction result = new Fraction(0, 1);

        result.numerator = numerator * other.denominator;
        result.denominator = denominator * other.numerator;

        result.reduce();
        return result;
    }

    public Fraction multiply(Fraction other){
        Fraction result = new Fraction(0, 1);

        result.numerator = numerator * other.numerator;
        result.denominator = denominator * other.denominator;
        
        result.reduce();
        return result;
    }

    public Fraction pow(int p){
        Fraction result = new Fraction(0, 1);
        if(p < 0){
            p = -p;
            result.numerator = (int) Math.pow(denominator, p);
            result.denominator = (int) Math.pow(numerator, p);
        }
        else{
            result.numerator = (int) Math.pow(numerator, p);
            result.denominator = (int) Math.pow(denominator, p);
        }
        
        result.reduce();
        return result;
    }

    public void reduce(){
        int n, d, largest;
        n = numerator;
        d = denominator;
        if(numerator < 0){
            n = -numerator;
        }

        if(n > d)
            largest = n;
        else
            largest = d;

        // find the largest number that divide the numerator and
        // denominator evenly
        int gcd = 0;
        for (int i = largest; i >= 2; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
                break;
            }
        }

        // divide the largest common denominator out of numerator, denominator
        if (gcd != 0) {
            numerator /= gcd;
            denominator /= gcd;
        }
    }

    public Fraction toNegative(){
        numerator = -numerator;
        return this;
    }

    public String toString(){
        if(denominator == 1)
            return Integer.toString(numerator);
        return numerator + "/" + denominator;
    }
}
