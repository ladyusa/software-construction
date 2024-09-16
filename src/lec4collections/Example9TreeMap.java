package lec4collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Example9TreeMap {

    public static void main(String[] args) {
        Student s1 = new Student("Kwan", 10);
        Student s2 = new Student("Ploy", 7);
        Student s3 = new Student("Fon", 8);

        System.out.println("--------- HashMap ----------");
        System.out.println("--- key เป็น set จึงไม่เรียง ---");
        HashMap<String,Student> maps = new HashMap<>();
        maps.put("Kwan", s1);
        maps.put(s2.getName(), s2);
        maps.put("Fon", s3);

        for (Student student : maps.values()) {
            System.out.println(student);
        }

        System.out.println("--------- TreeMap ----------");
        System.out.println("-------- sort ด้วย key ------");
        TreeMap<String,Student> treeMap = new TreeMap<>();
        treeMap.put("Kwan", s1);
        treeMap.put(s2.getName(), s2);
        treeMap.put("Fon", s3);

        for (Student student : treeMap.values()) {
            System.out.println(student);
        }

//        System.out.println(   maps.get("Ploy")   );
//        System.out.println(   maps.get("Usa")   );
//
//        School school = new School();
//        school.register(student1);
//        school.register(student2);
//
//        System.out.println(   school.findStudent("Kwan")  );
    }
}
