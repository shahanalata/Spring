package com.Collection;

public  class Homework1 {
	
	public void get() {
		
	}
	
	
	public void getNumber() {
		int a=20;
		System.out.println("I am the return type method "+ a);  
	}
	public static boolean getball() {
		boolean a= true ;
		boolean b=false;
		return b;
		}
	
	public void getsome(int a) {
		
	}
	public void gettwo(String a, String b) {
		
	}
	public void getmix(int a, String b) {
		
	}
	public void getsomthing(String a, int b, boolean c) {
		
	}
	public int getsum(int a, int b) {
		return (a+b);
		}
	public static boolean getnine(String s1, String s2) {
		boolean s = s1.equals(s2);
		return s;
		
	}
	public static void getten() {
		int a=1;
		while(a<=10) {
		System.out.println(a);
		a++;
		}
	}
	
	public static  String geteleven(String s, int a) {
		String newone ="";
		for(int i=0; i<a; i++) {
			newone=newone+s;
		}
		return newone;
			
		}
			
		
		
	
	
	public static void main(String[] args) {
		Homework1.getball();
		System.out.println(Homework1.getball());
		Homework1.getnine("Shahana", "Ahmed");
		System.out.println(Homework1.getnine("Shahana", "Shahana"));
		Homework1.getten();
		Homework1.geteleven("Shahana", 5);
		System.out.println(Homework1.geteleven("Shahana", 5));
		
	}

}
