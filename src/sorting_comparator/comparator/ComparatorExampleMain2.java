package sorting_comparator.comparator;




import com.pack.sorting_comparator.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ComparatorExample2 implements Comparator<Student> {

    // Compare by name ignoring a case
    @Override
    public int compare(Student s1, Student s2) {
        // return 0;
        return s1.getName().compareToIgnoreCase(s2.getName());
    }

}

public class ComparatorExampleMain2 {

    static void main() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(121, "alice"));
        studentList.add(new Student(101, "Bob"));
        studentList.add(new Student(111, "charlie"));
        studentList.add(new Student(151, "john"));
        studentList.add(new Student(131, "bob"));
        studentList.add(new Student(141, "Charlie"));

        System.out.println("\nBefore Sorting:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\nAfter Custom Sorting by Name Ignoring Case:");
        // Sort students using a custom comparator by name ignoring case
        java.util.Collections.sort(studentList, new ComparatorExample2());

        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

}
