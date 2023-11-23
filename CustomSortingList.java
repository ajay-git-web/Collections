package com.sample.List;
import java.util.*;
public class CustomSortingList {
	public static void customSortList(List l) {
		System.out.println("List itmes Comparable :");
		ListIterator lt=l.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("After sorting");
		Collections.sort(l);  //list is sort based on what we implement in compareTo method
		ListIterator lt1=l.listIterator();
		while(lt1.hasNext()) {
			System.out.println(lt1.next());
		}
		
	}
	
	public static void sortByName(List l) {
		System.out.println("List itmes Comparator:");
		ListIterator lt=l.listIterator();
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		System.out.println("List sorted according to name: ");
		Collections.sort(l,new SortByName());
		ListIterator lt1=l.listIterator();
		while(lt1.hasNext()) {
			System.out.println(lt1.next());
		}
	}
	public static void sortByAge(List l) {
		System.out.println("List items Comparator");
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("List sorted according to age: ");
		Collections.sort(l, new SortByAge());
		Iterator itr1=l.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
	public static void sortByCGPA(List l) {
		System.out.println("List items Comparator");
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("List sorted according to CGPA: ");
		Collections.sort(l, new SortByCGPA());
		Iterator itr1=l.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
	
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(new Student("Omjag",17,6.8));
		l.add(new Student("Sushant",31,7.4));
		l.add(new Student("Ajay",29,8.5));
		l.add(new Student("Sanjay",27,9));
		l.add(new Student("anesh",25,5));
		//customSortList(l);
		sortByName(l);
		sortByAge(l);
		sortByCGPA(l);
	}

}

class Student implements Comparable<Student>{
	private String name;
	private int age;
	private double cgpa;
	
	public Student(String name,int age,double cgpa) {
		this.name=name;
		this.age=age;
		this.cgpa=cgpa;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int compareTo(Student s) {
		
	//	return this.age-s.age;
		//return (int) (this.cgpa-s.cgpa);
		//return this.name.compareTo(s.name) ;
		return this.name.compareToIgnoreCase(s.name);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name:"+name+"\tAge:"+age+"\tCGPA:"+cgpa;
	}
}

class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}
	
}

class SortByAge implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.getAge()-s2.getAge();
	}
}

class SortByCGPA implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return (int) (s1.getCgpa()-s2.getCgpa());
	}
}
