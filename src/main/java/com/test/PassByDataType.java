package com.test;

/**
 * Hello world!
 *
 */
public class PassByDataType {
	public static void main( String[] args )
    {
    	int x = 5;
        int y = 10;
        System.out.println("Initial Value: a = " + x + " and b = " + y);
        // Invoke the swap method
        swapValue(x, y);
        System.out.println("\n**Now, Before and After swapping values will be different here**:");
        System.out.println("\nAfter swapping(main): a = " + x + " and b is " + y);
     }

	public static void swapValue(int a, int b) {
		System.out.println("\nInside swapValue()");
		System.out.println("Before swapping(Inside): a = " + a + " b = " + b);
		// Swap n1 with n2
		int c = a;
		a = b;
		b = c;
		System.out.println("After swapping(Inside): a = " + a + " b = " + b);
		a = a * 10;
		b *= 10;
		System.out.println("After computing(Inside): a = " + a + " b = " + b);
	}
}
