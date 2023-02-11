package com.demo.interviewQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetStringGrter5Char 
{

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("Khalique","Saif","Azhar","Tabbssum");
		  List<String> collect = list.stream().filter(l->l.length()>5).collect(Collectors.toList());
		 
		  for(String c : collect)
		  {
			  System.out.println(c);
		  }
	}
}
