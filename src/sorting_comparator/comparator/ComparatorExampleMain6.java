package sorting_comparator.comparator;

import com.pack.sorting_comparator.Student;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleMain6 {
    static void main() {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(121, "Alice"));
        studentList.add(new Student(101, "Bob"));
        studentList.add(new Student(111, "Charlie"));
        studentList.add(new Student(151, "John"));
        studentList.add(new Student(131, "Bob"));
        studentList.add(new Student(141, "Charlie"));


        System.out.println("\nBefore Sorting:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\nAfter Sorting by Roll Number:");
        // Sort students using java stream by roll number
        List<Student> sortedStudentList = studentList
                .stream()
                .sorted(Comparator.comparingInt(Student::getRollNumber))
                .toList();

        // Print sorted list
        for (Student student : sortedStudentList) {
            System.out.println(student);
        }
    }
}

