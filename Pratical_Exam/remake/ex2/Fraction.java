public class Fraction {
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}

	public Fraction(String frac) {
		String parts[] = frac.split("/");
		switch(parts.length) {
			case 1:
				this.numerator = Integer.parseInt(parts[0]);
				this.denominator = 1;
				break;
			case 2:
				this.numerator = Integer.parseInt(parts[0]);
				this.denominator = Integer.parseInt(parts[1]);
				break;
			default:
				System.err.println("Fraction Error");
				break; 
		}
	}

	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}

	public Fraction multiply(Fraction other) {
		int newNumerator = this.getNumerator() * other.getNumerator();
		int newDenominator = this.getDenominator() * other.getDenominator();

		return new Fraction(newNumerator, newDenominator);
	}

	public Fraction divide(Fraction other) {
		int newNumerator = this.getNumerator() * other.getDenominator();
		int newDenominator = this.getDenominator() * other.getNumerator();

		return new Fraction(newNumerator, newDenominator);
	}

	public Fraction add(Fraction other) {
		int newNumerator = this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator();
		int newDenominator = this.getDenominator() * other.getDenominator();

		return new Fraction(newNumerator, newDenominator);
	}

	public Fraction subtract(Fraction other) {
		int newNumerator = this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator();
		int newDenominator = this.getDenominator() * other.getDenominator();

		return new Fraction(newNumerator, newDenominator);
	}

	public Fraction reduce() {
		int mdc = mdc(this.numerator, this.denominator);

		return new Fraction(this.numerator / mdc, this.denominator / mdc);
	}

	private int mdc(int num, int den) {
		if (den == 0)
			return num;

		return mdc(den, num % den);
	}

	@Override
	public String toString(){
		return ""+numerator + (denominator==1 ? "" : "/" + denominator);
	}
}