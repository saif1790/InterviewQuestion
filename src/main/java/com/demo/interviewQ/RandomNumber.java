package com.demo.interviewQ;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber
{

	public static void main(String[] args) {
		
		System.out.println("Enter number limit to generate random number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		Random random = new Random();
		//method reference -- ::
		random.ints(1, 10).limit(n).forEach(System.out::println);
		
	}
}
