package module.one;

public class Fraction {
	
	private int numerator, denominator;
	public static final int DEFAULT_NUMERATOR = 1;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public Fraction(int denominator) {
		this(DEFAULT_NUMERATOR, denominator);
	}
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public void setDenominator(int denominator) {
		if(denominator!=0) {
			this.denominator = denominator;
		} else {
			System.out.println("Invalid parameter: denominator cannot be 0.");
		}
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}
	
	public double getValue() {
		return (1.0 * numerator) / ( (double) denominator); // choose one!
	}
	
	public boolean isReduced() {
		return findGreatestCommonFactor(numerator, denominator) == 1;
		
	}
	private int findGreatestCommonFactor(int number1, int number2) {
		int greatestCommonFactor = 1;
		int maxFactorToCheck = findSmaller(number1, number2);
		for(int possibleFactor = 2; possibleFactor <= maxFactorToCheck; possibleFactor++) {
			if(number1%possibleFactor==0 && number2%possibleFactor==0) {
				greatestCommonFactor = possibleFactor;
			}
		}
		return greatestCommonFactor;
	}
	private int findSmaller(int number1, int number2) {
		if(number1<number2) {
			return number1;
		} else { // number2<=number1
			return number2;
		}
	}
	public void reduce() {
		if(!isReduced()) {
			int greatestCommonFactor = findGreatestCommonFactor(numerator, denominator);
			this.numerator = numerator / greatestCommonFactor;
			this.denominator = denominator / greatestCommonFactor;
		}
	}
	public int findLeastCommonDenominator(Fraction otherFraction) { // this should probably also be static!
		// least common multiple = (a * b) / greatestCommonFactor(a, b)
		int leastCommonDenominatorTop = this.denominator * otherFraction.denominator;
		int leastCommonDenominatorBottom = findGreatestCommonFactor(this.denominator, otherFraction.denominator);
		return leastCommonDenominatorTop / leastCommonDenominatorBottom;		
	}
	
	public static Fraction createReducedFraction(Fraction fraction) {
		Fraction reducedFraction = new Fraction(fraction.numerator, fraction.denominator);
		reducedFraction.reduce();
		return reducedFraction;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fraction) {
			Fraction other = (Fraction) obj;
			/* option 1: directly compare numerator and denominator */
			return this.numerator==other.numerator &&
					this.denominator==other.denominator;
					// if we had an object variable to compare: this.name.equals(other.name);
			
			/* option 2: compare the value	 */
			// this is probable more appropriate to put in a method such as isEquivalentTo(Fraction other)
			// return Math.abs(this.getValue()-other.getValue()) < 0.00001; 
			
		} else {
			return false;
		}
	}
	
	
	
	
}
