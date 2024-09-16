package lec4collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2List {

	public static void main(String[] args) {
		ArrayList<Student> stdList = new ArrayList<>();
		Student s1 = new Student("Kwan", 10);
		Student s2 = new Student("Ploy", 7);
		Student s3 = new Student("Fon", 8);

		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s3);

		System.out.println("------ Access a list using get(i)");
		for (int i = 0; i < stdList.size(); i++) {
			Student student = stdList.get(i);
			String name = student.getName();
			System.out.println("Name: "+name);
		}
		
		System.out.println("------ Access a list using for-each loop");
		for (Student student : stdList) {
			String name = student.getName();
			System.out.println("Name: "+name);
		}

		System.out.println("------ Access a set using iterator");
		Iterator<Student> stdItr = stdList.iterator();
		while (stdItr.hasNext()) {
			Student student = stdItr.next();
			String name = student.getName();
			System.out.println("Name: "+name);
		}
	}

}
