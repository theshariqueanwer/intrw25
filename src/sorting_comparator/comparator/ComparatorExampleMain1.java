package sorting_comparator.comparator;




import com.pack.sorting_comparator.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorExample1 implements Comparator<Student> {

    // Compare by name
    @Override
    public int compare(Student s1, Student s2) {
        // return 0;
        return s1.getName().compareTo(s2.getName());
    }

}

public class ComparatorExampleMain1 {
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

        System.out.println("\nAfter Custom Sorting by Name:");
        // Sort students using a custom comparator by name
        Collections.sort(studentList, new ComparatorExample1());

        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}

