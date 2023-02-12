package com.demo.interviewQ;

import java.util.Arrays;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {

		int a1[] = { 4,9,5 };

		int a2[] = { 9,4,9,8,4 };

		System.out.println("Intersection of 2 arrays");
		Arrays.stream(a1).filter(x -> Arrays.stream(a2).anyMatch(y -> y == x)).distinct().forEach(System.out::println);
		System.out.println("------");
	}
}
