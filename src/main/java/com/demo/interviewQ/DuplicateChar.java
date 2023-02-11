package com.demo.interviewQ;

import java.util.HashMap;
import java.util.Scanner;

//Accenture find duplicate char from the string and print the char which is greater than 1 
public class DuplicateChar {

	public static void main(String[] args) {
		
		System.out.println("ENter String");
		Scanner scn  = new Scanner(System.in);
		String str = scn.next();
		int cnt=0;
		HashMap<Character, Integer> map = new HashMap();
		
		//abacb
		for(Character c: str.toCharArray())
		{
			if(map.containsKey(c))
			{
			 Integer value = map.get(c);
			 value++;
			 map.replace(c, value);
			}
			else {
				map.put(c, 1);
				 
			}
		}
		for(Character character : map.keySet())
		{
			if(map.get(character)>1)
			{
				System.out.print(character+" ");
			}
		}
		 
	}
}
