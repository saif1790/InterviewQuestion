package com.demo.interviewQ;

public class EnumDemo {
	
enum Month
{
	// Month JAN = new Month(31);-->JAN(31)
	JAN(31),
	FEB(28),
	MAR(31),
	APR(30),
	MAY(31),
	JUN(30),
	JUL(31),
	AUG(31),
	SEP(30),
	OCT(31),
	NOV(30),
	DEC(31);
	
	//instance variable
	int noOfDays;

	  Month() {
		 System.out.println("enum");
	}
	//enum(Month) constructor
	Month(int noOfDays) {
		 this.noOfDays=noOfDays;
	}
	
	int getNumberOfDays()
	{
		return noOfDays;
	}
	
	
	
}
	public static void main(String[] args) 
	{
	
		Month m = Month.JAN;
		int numberOfDays = m.getNumberOfDays();
		Month[] values = Month.values();
		System.out.println(values);
		for(Month m1 : Month.values())
		System.out.println((m1.ordinal()+1)+"  "+  m1.name()+" "+m1.getNumberOfDays());
		
	}
}
