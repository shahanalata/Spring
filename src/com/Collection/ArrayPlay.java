package com.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
                              //java collection is dynamic, means it has no size based on input(adjust)
public class ArrayPlay {

	public static void main(String[] args) {
		//int[] a =new int [7];
		//a[0]=10;
		//System.out.println(7);
		
		ArrayList<Integer> al= new ArrayList<Integer>();          //take also String value ie. "banana","fig", "apple"
		                                                         //
	                //here, put in index number,not value
    al.add(40); 
    al.add(50); 
    al.add(55); 
    al.add(65);                      // in arraylist, take duplicate value. it follows insertion order(maintain serial how we input)
	//System.out.println(al);
   // System.out.println(al.size());
    
   // System.out.println("maximum value:   " +Collections.max(al));
  //  System.out.println("minimum value:  "+ Collections.min(al));
    
    /*int counter =0;
     for(int i=0; i<al.size(); i++ )    {             
    	 if  (al.get(i)%2==0) {   	                               //(al.get(i)%2!=0){----------odd number
    		 counter=al.get(i);
    	 
    	System.out.println("even number:  "+ counter); 
    	  
     }
     else {
     System.out.println("this is not even number  ");
     }*/
    //System.out.println("the number is even:  "+counter);
    
    int counter1 =0;
    for(int j=0; j<al.size(); j++ )    {             
   	 if  (al.get(j)%2!=0) {   	                               //(al.get(i)%2!=0){----------odd number
   		 counter1 =al.get(j);
   		System.out.println("This is odd number:  " + counter1);//
   	 }
   
   	 }
   	  {
   			//System.out.println(counter1); 
   		 } 
    }

	}

