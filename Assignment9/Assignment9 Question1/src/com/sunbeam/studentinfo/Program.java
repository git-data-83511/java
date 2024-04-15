package com.sunbeam.studentinfo;

import java.util.*;

public class Program {

	public static void main(String[] args) 
	{

		
		List<Student> stdList = new LinkedList<>();
		stdList.add(new Student(5, "Suraj", 75));
		stdList.add(new Student(3, "Shamal", 83));
		stdList.add(new Student(2, "Shambhu", 81));
		stdList.add(new Student(4, "Rohit", 78));
		stdList.add(new Student(1, "Atharva", 85));

		System.out.println("Before Sort - ");
		for (Student student : stdList)
			System.out.println(student);

		System.out.println("After Natural Ordering --> ");
		Collections.sort(stdList);
		for (Student student : stdList)
			System.out.println(student);

		System.out.println("Sorting on Student name -->");

		class StdNameComparator implements Comparator<Student> 
		{
			@Override
			public int compare(Student o1, Student o2) 
			{
				return o1.getName().compareTo(o2.getName());
			}
		}

		Comparator<Student> StdNameComparator = new StdNameComparator();
		Collections.sort(stdList, StdNameComparator);
		for (Student student : stdList)
			System.out.println(student);
		
		System.out.println("Sorting on Student Marks(desc) -->");
		class StdMarksComparator implements Comparator<Student>
		{
			@Override
			public int compare(Student o1, Student o2) 
			{
				return -(Double.compare(o1.getMarks(), o2.getMarks()));
						
			}		
		}
		Comparator<Student> StdMarksComparator = new StdMarksComparator();
		Collections.sort(stdList, StdMarksComparator);
		for (Student student : stdList)
			System.out.println(student);

		Student std = new Student();
		std.setRollno(3);
		if (stdList.contains(std))
			System.out.println("Student with Roll no. 3 exists in LinkedList");
		else
			System.out.println("Student not found");

	}

}