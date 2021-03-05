package com.ltts;

public class StringBuff {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Abhisar");
		StringBuffer sb2 = new StringBuffer("Ekka");
		
		//length
		System.out.println("-----length-----");
		sb1=new StringBuffer("Abhisar");
		System.out.println("s1->"+sb1);
		System.out.println("s1.length() -> "+sb1.length());
				
		//reverse
		System.out.println("---reverse---");
		System.out.println("sb1->"+sb1);
		System.out.println("sb1 reverse ->"+sb1.reverse());
			
		//capacity
		System.out.println("-----capacity-----");
		sb1=new StringBuffer("Abhisar");
		System.out.println("s1->"+sb1);
		System.out.println("s1.capacity() -> "+sb1.capacity());
		
		//insert
		System.out.println("-----insert-----");
		sb1=new StringBuffer("Abhisar");
		System.out.println("s1->"+sb1);
		System.out.println("s1.insert(07, \"Ekka\") -> "+sb1.insert(07, "Ekka"));
		
		//append
		System.out.println("-----append-----");
		sb1=new StringBuffer("Abhisar");
		System.out.println("s1->"+sb1);
		System.out.println("s2->"+sb2);
		System.out.println("s1.append(s2) -> "+sb1.append(sb2));
	}
}

