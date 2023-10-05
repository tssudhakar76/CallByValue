/**
 * 
 */
package com.test.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class CollectionsCallByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 50);		
		numberList.stream().forEach(System.out::println);
		
		compute(numberList);
		
		System.out.println("\nLast iteration");
		numberList.stream().forEach(System.out::println);
	}
	
	public static void compute(List<Integer> list) {
		List<Integer> computedList = list.stream().map(x -> x * 10).collect(Collectors.toList());  
		System.out.println("\nCompute() - 1st iteration"); 
		computedList.stream().forEach(System.out::println); 
		System.out.println("\n");  
		list.stream().forEach(System.out::println); 
		
		for(Integer num: list) {
			num = num * 10;
		}
		System.out.println("\nCompute() - 2nd iteration");
		list.stream().forEach(System.out::println);
	}
}
