package com.Collection;
                                            //list, set & map are interface.  
import java.util.ArrayList;                              //list-ArrayList  & LinkedList(class), these are almost similar function
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;                         //set-HashSet, LinkedHashSet,TreeSet
import java.util.LinkedHashSet;                          // ---in a set, doesn't allow duplicate value
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;
                                                        //map--HashMap,LinkedHashMap,TreeMap,HashTable
public class CollectionInJava {
	
	
	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Banana");
		al.add("Grapes");
		al.add("Apple");
		al.add("Orange");
		al.add("fig");
		al.add("Apple");
		al.add("null");
		al.add("null");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(3));    //if need to print particular index number
		
		
		LinkedList<String> ab= new LinkedList<String>();
		   ab.add("Banana");
		   ab.add("Apple");
		   ab.add("Grapes");
		   ab.add("Orange");
		   ab.add("Apple");
		   ab.add(null);
		   System.out.println(ab);
		   
		   
		HashSet<String> hs = new HashSet<String>();
		hs.add("Banana");
		hs.add("Grapes");         //no duplicate
		hs.add("Grapes");
		hs.add("Apple");
		hs.add("Orange");
		hs.add("fig");
		hs.add(null);
		System.out.println(hs);
		
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("Banana");
		ls.add("Grapes");
		ls.add("Apple");
		ls.add("Orange");
		ls.add("fig");
		ls.add(null);
		System.out.println(ls);
	
		TreeSet<String> ts= new TreeSet<String>();
		ts.add("Banana");
		ts.add("Grapes");
		ts.add("Apple");
		ts.add("Orange");
		ts.add("fig");
		ts.add("null");
		
		System.out.println(ts);

		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		hm.put("Banana", 3);
		hm.put("Apple", 6);
		hm.put("Fig", 9);
		hm.put("Orange", 7 );
		hm.put(null, 4);
		System.out.println(hm);
		
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		lhm.put("Banana", 3);
		lhm.put("Apple", 6);
		lhm.put("Fig", 9);
		lhm.put("Orange", 7 );
		lhm.put(null, 4);
		System.out.println(lhm);
		
		TreeMap<String, Integer> tm = new TreeMap<String,Integer>();
		tm.put("Banana", 3);
		tm.put("Apple", 6);
		tm.put("Fig", 9);
		tm.put("Orange", 7 );
		tm.put("Grape", null);
		System.out.println(tm);
		
        Hashtable<String, Double> ht = new Hashtable<String, Double>();
        ht.put("Banana", 3.99);
		ht.put("Apple", 6.69);
		ht.put("Fig", 9.99);
		ht.put("Orange", 7.89 );
		//ht.put("Grape", null);
		System.out.println("@@@ tp:"+ht);
		
	}

}
