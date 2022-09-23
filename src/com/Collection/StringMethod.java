package com.Collection;

public class StringMethod {

	public static void main(String[] args) {
		
		String name = "Unites States of America";
		System.out.println(name);
		
		System.out.println("Name: "+ name);
		
		System.out.println("Uppercase:  "+name.toUpperCase());
		
		System.out.println("Lowercase:  "+name.toLowerCase());
		
		System.out.println("Charecter in position:  "+name.charAt(5));
		System.out.println("Charecter in position:  "+name.charAt(0));
		System.out.println("Charecter in position:  "+name.charAt(18));
		
		System.out.println("Length:  "+ name.length());
		
		//System.out.println(name.concat(name));
		
		System.out.println("Number of word:  "+ name.split(" ").length);
		
		System.out.println(name.contains("a"));
		System.out.println(name.contains("l"));
        System.out.println(name.contains("t"));
        
        //System.out.println(name.split(name, name.length()));
        
        System.out.println("name:" + name.replaceAll(" " ,""));
        
        int counter=0;
   	 for (int k=0; k<name.length(); k++) {
   		 if (name.charAt(k)=='e') {
   			 counter++;
   		 }
   	 }
   	 System.out.println();
   	 System.out.println("Number of e:  "+counter);
        
	}

}
