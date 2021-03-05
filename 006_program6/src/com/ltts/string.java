package com.ltts;

public class string {
	public static void main(String[] args) {
		String s1 = "Abhisar";
		String s2 = "Ekka";
		String s3 = new String("Abhisar");
		System.out.println("s1: "+s1+"\ns2: "+s2);
		
		//to check hashCode 
		System.out.println("---hashcode---");
		System.out.println("s1.hashcode(): "+s1.hashCode());
		System.out.println("s2.hashcode(): "+s2.hashCode());
		
		//equals
		System.out.println("---equals---");
		System.out.println("s1.equals(s2): "+s1.equals(s2));
		System.out.println("s1.equals(s3): "+s1.equals(s3));
		
		//charAt(index)
		System.out.println("---charAt---");
		System.out.println("s3.hashcode(): "+s3.hashCode());
		System.out.println("s1.charAt(0): "+s1.charAt(3));
		System.out.println("s1.compareTo(s2): "+s1.compareTo(s2));
		
		//compareTo
		System.out.println("-----compareTo-----");
		String s11="hello";  
		String s21="hello";  
		String s31="meklo";  
		String s41="hemlo";  
		String s51="flag";  
		System.out.println("s11: "+s11);
		System.out.println("s21: "+s21);
		System.out.println("s31: "+s31);
		System.out.println("s41: "+s41);
		System.out.println("s51: "+s51);
		System.out.println("s11.compareTo(s21) ->"+s11.compareTo(s21));
		System.out.println("s11.compareTo(s31)-> "+s11.compareTo(s31)); 
		System.out.println("s11.compareTo(s41) -> "+s11.compareTo(s41)); 
		System.out.println("s11.compareTo(s51) ->"+s11.compareTo(s51));
		
		//Concatenate
		System.out.println("---Concatenate---");
		s1 = new String("Abhisar");
		s2 = new String("Ekka");
		String s4 = s1.concat(s2);
		System.out.println(s1);
		System.out.println("s1.concat(s2): "+s4);
		
		//indexOf
		System.out.println("-----indexOf-----");
		s1="Index example is here.";  
		System.out.println("s1: "+s1);
		int index1=s1.indexOf("is");
		int index2=s1.indexOf("Index");
		System.out.println(index1+"  "+index2);
		System.out.println("s1.indexOf(\"is\",4) -> "+s1.indexOf("is",4));
		System.out.println("s1.indexOf('s') ->"+s1.indexOf('s'));
		
		//trim
		System.out.println("-----trim-----");
		s1="  String trimming in java  ";
		System.out.println(s1.length());  
	    System.out.println(s1); 
	    String tr = s1.trim();  
	    System.out.println(tr.length());  
	    System.out.println(tr);
		
		//replace
		System.out.println("-----replace-----");
		s1="Mysore Karnataka India";  
		System.out.println("s1: "+s1);
		System.out.println("s.replace(\"Mysore\", \"Bangalore\") ->"+s1.replace("Mysore", "Bangalore"));
	}
}
