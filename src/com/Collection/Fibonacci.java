package com.Collection;

public class Fibonacci {
	
	//0 1 1  2   3   5      //sequence, swapping number
   //n1  n2  t
	//   n1  n2   t
	//        n1  n2   t
	
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int temp;
		
		System.out.println(n1);
		System.out.println(n2);
		for(int i=1; i<=10; i++) {
			temp =n1+n2;
			n1=n2;
			n2=temp;
			System.out.println(temp);
			
		}
	}

}
