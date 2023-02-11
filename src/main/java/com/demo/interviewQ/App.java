package com.demo.interviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//infosys
public class App {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Book", "Java", 300);
		Product p2 = new Product(3, "Book", "Spring", 250);
		Product p3 = new Product(2, "Phone", "iPhone", 30000);
		Product p4 = new Product(4, "Book", "English", 100);
		Product p5 = new Product(5, "Laptop", "HP", 3300);
		Product p6 = new Product(6, "Laptop", "Dell", 2500);
		Product p7 = new Product(7, "Book", "Advance Java", 200);

		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		products.stream().filter(p -> p.getpType().equalsIgnoreCase("Book")).filter(p -> p.getpPrice() > 200)
		.collect(Collectors.toList()).forEach(System.out::println);
	}
}
