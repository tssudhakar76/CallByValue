/**
 * 
 */
package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 */
public class CollectionObjectCallByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<User> userList = new ArrayList<>(Arrays.asList(
		        new User("Nissanth", 10), 
		        new User("Ashwin", 20), 
		        new User("Raj", 30),
		        new User("Phani", 40),
		        new User("Varthika", 50)));
		
		System.out.println("Main() before compute() iteration");
		userList.stream().forEach(System.out::println); 
		
		compute(userList);
		
		System.out.println("\n Main() closing iteration");
		userList.stream().forEach(System.out::println);	  
	}
	
	public static void compute(List<User> list) {
		
		for(User user: list) {
			user.setSalary(user.getSalary() * 10);
		}
		System.out.println("\nMethod Compute() - 2nd iteration"); 
		list.stream().forEach(System.out::println); 
	}
}



class User {
	private String name;
	private Integer salary;
	
	public User(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=").append(name).append(", salary=").append(salary).append("]");
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