package com.sample.List;

import java.util.*;

public class RemoveDuplicate {
	
	public static void removeDuplicateFromList(List l) {
		System.out.println("List Elements are: ");
		System.out.println(l);
		System.out.println("After remove duplicate elements using hashset list is: ");
		//Remove duplicate by using hashset pass the list to hashset but insertion order not preserved
		HashSet s=new HashSet(l);
		List l1=new ArrayList(s);
		System.out.println(l1);
		
		System.out.println("After remove duplicate elements using Linked hashset list is: ");
		//if we use LinkedHashset insertion order will be preserve
		LinkedHashSet ls=new LinkedHashSet(l);
		List l2=new ArrayList(ls);
		System.out.println(l2);
		
	}
	public static void main(String[] args) {
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(34);
		al1.add(21);
		al1.add(45);
		al1.add(12);
		al1.add(23);
		al1.add(21);
		al1.add(null);
		al1.add(45);
		
		
		List<String> al2=new ArrayList<String>();
		al2.add("Om");
		al2.add("Sushant");
		al2.add("Ajay");
		al2.add("Sanjay");
		al2.add("Ganesh");
		al2.add(null);
		al2.add(null);
		al2.add("Ajay");
		al2.add("Ajay");
		al2.add("ajay");
		
		removeDuplicateFromList(al1);
		removeDuplicateFromList(al2);
	}

}
