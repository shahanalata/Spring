package com.Collection;

public class StringInJava1 {

	public static void main(String[] args) {
		String country = "United States of America";         
		
		int numberOfChar= country.length();
		System.out.println(numberOfChar);
		
		//String noSpace = country.replaceAll(" ","");
		System.out.println("name:" + country.replaceAll(" " ,""));
		//System.out.println(noSpace);
		//System.out.println(noSpace.length());
		
		String[] pcs=country.split(" ");
		System.out.println(pcs.length);
		
		String fName="Shahana";
		String lName="Ahmed";
		
		String fullName=fName.concat(" " +lName);
		System.out.println(fullName);
		
		if (fName.contains("a")) {
			System.out.println("good person");
			
			
			System.out.println(country.charAt(4));
			System.out.println(country.charAt(0));
			
			
			for(int i=0;i<country.length(); i++) {
				System.out.println(country.charAt(i));
			}
			
		for (int j=country.length()-1; j>=0; j--) {
				System.out.print(country.charAt(j));
		}
		
		int counter=0;
		 for (int k=0; k<country.length(); k++) {
			 if (country.charAt(k)=='e') {
				 counter++;
			 }
		 }
		 System.out.println();
		 System.out.println(counter);
	 
	 String cap = country.toUpperCase();
		 System.out.println(cap);
		 
     String low =country.toLowerCase();
     System.out.println(low);
			}
			}
	
		
	}


