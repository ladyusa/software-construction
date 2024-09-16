package lec4collections;

import java.util.*;

public class Example8Map {

	public static void main(String[] args) {
		HashMap<String, Student> stdMap = new HashMap<>();
		Student s1 = new Student("First", 10);
		Student s2 = new Student("Second", 9);
		Student s3 = new Student("Third", 8);

		stdMap.put("First", s1);
		stdMap.put("Second", s2);
		stdMap.put("Third", s3);
		stdMap.put("Third", new Student("YYYY", 4));

		System.out.println("------ Access a map with known key");
		Student myStd = stdMap.get("Second");
		System.out.println("Name: "+myStd.getName()+" Score: "+myStd.getScore());
		
		System.out.println("------ Looping a map using keys with keySet() method");
		Set<String> keys = stdMap.keySet();
		for (String name : keys) {
			Student student = stdMap.get(name);
			System.out.println("Name: "+student.getName()+" Score: "+student.getScore());
		}

		System.out.println("------ Looping a map using values with values() method");
		Collection<Student> values = stdMap.values();
		for (Student student : values) {
			System.out.println("Name: "+student.getName()+" Score: "+student.getScore());
		}

		System.out.println("------ Looping a map using both keys and values");
		Set<Map.Entry<String, Student>> entries = stdMap.entrySet();
		for (Map.Entry<String, Student> entry : entries) {
			String key = entry.getKey();
			Student student = entry.getValue();
			System.out.println("Name: "+student.getName()+" Score: "+student.getScore());
		}
	}
}
