package com.Collection;

public class StringInJava {
	
	String name = new String("shahana");        //declare in global,string class object,
	 public void getName() {                    //same object refer in all method
		 System.out.println(name);
	 }
	 public void getNameSize() {
		 System.out.println(name.length());
	 }

	public static void main(String[] args) {
		 StringInJava stj= new StringInJava();
		 stj.getName();
		 stj.getNameSize();
	}

}
