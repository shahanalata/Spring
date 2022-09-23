package com.Collection;

public class Pallindrome {               // string is a immutable.
	                                      //string has no reverse method. it has 2 other class i.e.stringBuilder, stringBuffer
	public static void getPaln(String st) {      //other classes has reverse method.          
		                                  //java cannot comparae,here compare the two string
		StringBuilder sb = new StringBuilder(st);
		String rr=sb.reverse().toString();
		System.out.println(rr);
		if (st.equalsIgnoreCase(rr)) {      // for this, consider upper and lower case both, don't create issue
			System.out.println("It is a pallindrome");
			
		}
		else {System.out.println("It is not a pallindrome");}
	}

	public static void main(String[] args) {
		Pallindrome.getPaln("cook");               //malayalam,konok, level.mom
        Pallindrome.getPaln("level");
	}

}
