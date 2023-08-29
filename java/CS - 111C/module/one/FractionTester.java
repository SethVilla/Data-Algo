package module.one;

import java.util.ArrayList;

public class FractionTester {

	public static void main(String[] args) {
	
		// testing constructors
		Fraction frac1 = new Fraction(2);
		Fraction frac2 = new Fraction(2, 3);
		Fraction frac3 = new Fraction(2, 5);
		
		// testing getter/setter
		System.out.println("numerator of frac1 is " + frac1.getNumerator());
		System.out.println("denominator of frac1 is " + frac1.getDenominator());
		
		frac3.setDenominator(10);
		System.out.println("denominator of frac3 is " + frac3.getDenominator());
		frac3.setDenominator(0);
		System.out.println("denominator of frac3 is " + frac3.getDenominator());
		
		// testing toString
		System.out.println(frac3);
		System.out.println(frac2);
		System.out.println(frac2.getValue());
	
		// resting isReduced and reduce
		Fraction frac4 = new Fraction(2, 9);
		Fraction frac5 = new Fraction(3, 15);
		Fraction frac6 = new Fraction(1, 2);
		Fraction frac7 = new Fraction(2, 8);
		Fraction frac8 = new Fraction(4, 2);
		Fraction frac9 = new Fraction(5, 3);
		Fraction frac10 = new Fraction(4, 3);
		System.out.println(frac8.isReduced());
		
		System.out.println(frac7);
		frac7.reduce();
		System.out.println(frac7);
		
		// testing least common denominator		
		System.out.println("Lowest common denominator of " + frac5 + " and " + frac8 + " is " + frac5.findLeastCommonDenominator(frac8));
		System.out.println("Lowest common denominator of " + frac6 + " and " + frac7 + " is " + frac6.findLeastCommonDenominator(frac7));
		System.out.println("Lowest common denominator of " + frac9 + " and " + frac10 + " is " + frac9.findLeastCommonDenominator(frac10));

		System.out.println(frac7);
		frac6.findLeastCommonDenominator(frac7);
		System.out.println(frac7);
	
		// testing create reduced fraction method
		Fraction frac11 = new Fraction(2, 6);
		Fraction frac12 = Fraction.createReducedFraction(frac11);
		System.out.println(frac11);
		System.out.println(frac12);


		// testing equals method
		Fraction frac13 = new Fraction(1, 4);
		Fraction frac14 = new Fraction(2, 8);
		System.out.println(frac13.equals(frac14));
		//System.out.println(frac13.equals(new String("hi")));
		
		// demonstrating how the method header of equals must use parameter type Object
		ArrayList<Fraction> fractions = new ArrayList<Fraction>();
		Fraction f1 = new Fraction(1, 4);
		fractions.add(f1);
		Fraction f2 = new Fraction(1, 4);
		System.out.println(fractions.contains(f2));
		
	}

}
