package sorting_comparable.comparable;

import com.pack.sorting_comparable.Student;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExampleMain {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(121, "Alice"));
        studentList.add(new Student(101, "Bob"));
        studentList.add(new Student(111, "Charlie"));
        studentList.add(new Student(151, "John"));
        studentList.add(new Student(131, "Bob"));
        studentList.add(new Student(141, "Charlie"));

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\nAfter Sorting:");
        // Sort using comparable
        Collections.sort(studentList);

        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
