package com.sample.List;
import java.util.*;
public class ReverseList {
	public static void reverseList(List<?> l) {
		System.out.println("Before reverse List is: ");
		System.out.println(l);
		System.out.println("After Reverser List is: ");
		Collections.reverse(l);
		System.out.println(l);
	}
	public static void main(String[] args) {
		List<Integer> al1=new ArrayList<Integer>();
		al1.add(34);
		al1.add(21);
		al1.add(45);
		al1.add(12);
		al1.add(23);
		
		List<String> al2=new ArrayList<String>();
		al2.add("Om");
		al2.add("Sushant");
		al2.add("Ajay");
		al2.add("Sanjay");
		al2.add("Ganesh");
		
		reverseList(al1);
		reverseList(al2);
	}

}
