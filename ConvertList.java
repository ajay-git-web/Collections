package com.sample.List;
import java.util.*;
public class ConvertList {
	public static void convertArraytoArrayList1(String[] s) {
		System.out.println("Array elements: ");
		for(String st:s)
			System.out.print(st+" ");
		System.out.println("\nList elements after convert array into arrraylist using Array.asList() method: ");
		//This is the first way we can convert array into arrayList
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		System.out.println(al);
	}
	
	public static void convertArraytoArrayList2(String[] s) {
		System.out.println("Array elements: ");
		for(String st:s)
			System.out.print(st+" ");
		System.out.println("\nList elements after convert array into arrraylist using Collections.addAll() method: ");
		//This is the second way we can convert array into arrayList
		
		ArrayList al=new ArrayList();
		Collections.addAll(al, s); 
		System.out.println(al);
	}
	
	public static void convertArraytoArrayList3(String[] s) {
		System.out.println("Array elements: ");
		for(String st:s)
			System.out.print(st+" ");
		System.out.println("\nList elements after convert array into arrraylist using list.add() method: ");
		//This is the second way we can convert array into arrayList
		
		ArrayList al=new ArrayList();
		for(int i=0;i<s.length;i++) {
			al.add(s[i]);
		}
		System.out.println(al);
	}
	
	public static void convertListtoArray(List l) {
		System.out.println("List elements: ");
		System.out.println(l);
		System.out.println("Convert List into array using list.toArray(array): ");
		String[] str=new String[l.size()];
		l.toArray(str);
		for(String s:str)
			System.out.print(s+" ");
		System.out.println("\n"+str[1]);
	}
	public static void main(String[] args) {
		String[] str=new String[] {"Om","Sushant","Ajay","Ganesh","Sanjay"};
		//convertArraytoArrayList1(str);
		//convertArraytoArrayList2(str);
		//convertArraytoArrayList3(str);
		
		List l=new ArrayList();
		l.add("Rohit");
		l.add("Virat");
		l.add("Shreyas");
		l.add("Dhoni");
		
		convertListtoArray(l);
	}

}
