package sorting_comparator.comparator;

import com.pack.sorting_comparator.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorExample implements Comparator<Student> {

    // Compare by roll number
    @Override
    public int compare(Student s1, Student s2) {
        // return 0;
        return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
    }

}

public class ComparatorExampleMain {
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

        System.out.println("\nAfter Custom Sorting by Roll Number:");
        // Sort students using a custom comparator by roll number
        Collections.sort(studentList, new ComparatorExample());

        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }


    }
}
