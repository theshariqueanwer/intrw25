package sorting_comparable.comparable;

import com.pack.sorting_comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExampleMain1 {
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
        Collections.sort(studentList, Collections.reverseOrder());
        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sort using an inline comparator (by name)
        Collections.sort(studentList, (s1, s2) ->
                s1.getName().compareTo(s2.getName()));
        // Print sorted list by name
        System.out.println("\nAfter Sorting by Name:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sort using an inline comparator (by roll number)
        Collections.sort(studentList, (s1, s2) ->
                Integer.compare(s1.getRollNumber(), s2.getRollNumber()));
        // Print sorted list by roll number
        System.out.println("\nAfter Sorting by Roll Number:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Sort using an inline comparator (by name, then by roll number)
        Collections.sort(studentList, (s1, s2) -> {
            int nameCompare = s1.getName().compareTo(s2.getName());
            if (nameCompare != 0) {
                return nameCompare;
            } else {
                return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
            }
        });
        // Print sorted list by name, then by roll number
        System.out.println("\nAfter Sorting by Name, then by Roll Number:");
        for (Student student : studentList) {
            System.out.println(student);
        }


        // Sort using an inline comparator by roll number (no comparable needed)
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
            }
        });

        // Print sorted list by roll number
        System.out.println("\nAfter Sorting by Roll Number using Comparator:");
        for (Student student : studentList) {
            System.out.println(student);
        }


        // Sort using an inline comparator by name (no comparable needed)
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        // Print sorted list by name
        System.out.println("\nAfter Sorting by Name using Comparator:");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
