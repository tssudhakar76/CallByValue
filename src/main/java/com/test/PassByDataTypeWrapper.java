package com.test;

/**
 * Hello world!
 *
 */
public class PassByDataTypeWrapper {
	public static void main( String[] args )
    {
    	Integer a = 5;
        Integer b = 10;
        System.out.println("Initial Value: a = " + a + " and b = " + b);
        // Invoke the swap method
        swapValue(a, b);
        System.out.println("\n**Now, Before and After swapping values will be different here**:");
        System.out.println("\nAfter swapping(main): a = " + a + " and b is " + b);
     }

	public static void swapValue(Integer a, Integer b) {
		System.out.println("\nInside swapValue()");
		System.out.println("Before swapping(Inside): a = " + a + " b = " + b);
		// Swap n1 with n2
		Integer c = a;
		a = b;
		b = c;
		System.out.println("After swapping(Inside): a = " + a + " b = " + b);
		a = a * 10;
		b *= 10;
		System.out.println("After computing(Inside): a = " + a + " b = " + b);
	}
}
