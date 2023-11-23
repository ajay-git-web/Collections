package com.sample.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NormalSortingList {
	public static void sortList1(List l) {
		System.out.println("List elemenst are: ");
		System.out.println(l);
		System.out.println("After sorting List is: ");
		Collections.sort(l);
		System.out.println(l);
	}
	
	public static void sortList2(List l) {
		System.out.println("List elemenst are: ");
		System.out.println(l);
		System.out.println("After sorting List is: ");
		Collections.sort(l,String.CASE_INSENSITIVE_ORDER);
		System.out.println(l);
	}
	public static void main(String[] args) {
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(34);
		al1.add(21);
		al1.add(45);
		al1.add(12);
		al1.add(23);
		al1.add(21);
	//	al1.add(null);  will get NPE Cannot invoke "java.lang.Comparable.compareTo(Object)" because "pivot" is null
		al1.add(45);
		
		
		List<String> al2=new ArrayList<String>();
		al2.add("Om");
		al2.add("Sushant");
		al2.add("Ajay");
		al2.add("Sanjay");
		al2.add("Ganesh");
	//	al2.add(null);
		al2.add("Ajay");
		al2.add("Ajay");
		al2.add("ajay");
	
		sortList1(al2);//output- [Ajay, Ajay, Ajay, Ganesh, Om, Sanjay, Sushant, ajay] not getting expected result need to call comparator inside sort
		sortList2(al2);//output- [Ajay, Ajay, Ajay, ajay, Ganesh, Om, Sanjay, Sushant]
	}

}
