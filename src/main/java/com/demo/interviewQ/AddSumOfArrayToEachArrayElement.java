package com.demo.interviewQ;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddSumOfArrayToEachArrayElement
{

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(20,30,80,90);
		
		Integer sumOfArray = list.stream().reduce(0, Integer::sum);
		
		System.out.println("Sum of Array"+":"+sumOfArray);
		
		List<Integer> collect = list.stream().map(x->x+sumOfArray).collect(Collectors.toList());
		
		System.out.println("Sum of Array elements after adding array sum to each element"+collect);
		
		LocalDate date = LocalDate.now();
		
		
		System.out.println("dd/mm/YYYY"+date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());;
 
	}
}
