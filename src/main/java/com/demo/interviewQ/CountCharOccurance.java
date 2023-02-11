package com.demo.interviewQ;

import java.util.HashMap;

//input  aabbbc
//output a2b3c1

public class CountCharOccurance 
{

	public static void main(String[] args) {
		
		String s1 ="java";
		int l =s1.length();
		HashMap<Character, Integer> map =new HashMap<>();
		
		for(int i=0;i<l;i++)
		{
			char ch = s1.charAt(i);
			if(map.containsKey(ch))
			{
				Integer count = map.get(ch);
				count++;
				map.replace(ch, count);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println("Number of char in :"+s1);
		for(Character key:map.keySet())
		{
			System.out.print(key+""+map.get(key));
		}
	}
}
