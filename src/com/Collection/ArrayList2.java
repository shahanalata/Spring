package com.Collection;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();          
        
al.add(40); 
al.add(50); 
al.add(55); 
al.add(65);
al.add(50);

int counter =0;
for(int i=0; i<al.size(); i++ )    {             
	 if  (al.get(i)%2==0) {   	                               //(al.get(i)%2!=0){----------odd number
		 counter=al.get(i);
	 
	System.out.println("This is even number:  "+ counter); 
	  
}
else  {
System.out.println("this is odd number  ");
}
	}


int counter1 =0;
for(int j=0; j<al.size(); j++ )    {             
	 if  (al.get(j)%2!=0) {   	                               //(al.get(i)%2!=0){----------odd number
		 counter1 =al.get(j);
	 
	System.out.println("This is odd number:  " + counter1);
	 }
else {
	System.out.println("this number is even  :  ");
}
	}
	}
}