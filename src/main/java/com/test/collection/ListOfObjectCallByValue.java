/**
 * 
 */
package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class ListOfObjectCallByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Member> memberList = new ArrayList<>(Arrays.asList(
		        new Member("Nissanth", 10), 
		        new Member("Ashwin", 20), 
		        new Member("Raj", 30),
		        new Member("Phani", 40),
		        new Member("Varthika", 50)));
		
		System.out.println("Main() before compute() iteration");
		memberList.stream().forEach(System.out::println);  
		
		compute(memberList);
		
		System.out.println("\n Main() closing iteration");
		memberList.stream().forEach(System.out::println);	 
	}
	
	public static void compute(List<Member> list) {
		
		List<Member> computedList = list.stream().map(x -> {
			x.setSalary(x.getSalary() * 10);
			return x;
		}).collect(Collectors.toList());
		
		System.out.println("\nMethod Compute() - 1st iteration");
		computedList.stream().forEach(System.out::println);   
		System.out.println("\n line 47");
		list.stream().forEach(System.out::println);
		
		for(Member member: list) {
			member.setSalary(member.getSalary() * 10);
		}
		System.out.println("\nMethod Compute() - 2nd iteration"); 
		list.stream().forEach(System.out::println);  
	}
}



class Member {
	private String name;
	private Integer salary;
	
	public Member(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [name=").append(name).append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
}