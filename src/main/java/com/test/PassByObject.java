package com.test;

/**
 * Hello world!
 *
 */
public class PassByObject {
	
	public static void main( String[] args )
    {
    	IntWrapper a = new IntWrapper(5);
        IntWrapper b = new IntWrapper(10);
        System.out.println("Initial Value: a = " + a.number + " and b = " + b.number);
        swapValue(a, b);
        System.out.println("\n**Now, Before and After swapping values will be different here**:");
        System.out.println("\nAfter swapping(main): a = " + a.number + " and b is " + b.number);
     }

	public static void swapValue(IntWrapper a, IntWrapper b) {
		System.out.println("\nInside swapValue()");
		System.out.println("Before swapping(Inside): a = " + a.number + " b = " + b.number);
		// Swap n1 with n2
		IntWrapper c = new IntWrapper(a.number);
		a.number = b.number;
		b.number = c.number;
		System.out.println("After swapping(Inside): a = " + a.number + " b = " + b.number);
		System.out.println(a);
		System.out.println(b);
	}
}

class IntWrapper {
	public int number;

	public IntWrapper(int a) {
		this.number = a;
	}
}