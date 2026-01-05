package sorting_comparator.comparator;


import com.pack.sorting_comparator.Student;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class ComparatorExample5 implements Comparator<Student> {

    // Compare by name ascending, if names are equal, compare by roll number ascending
    @Override
    public int compare(Student s1, Student s2) {
        // return 0;
        int nameComparison = s1.getName().compareTo(s2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
        }
    }
}

public class ComparatorExampleMain5 {
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

        System.out.println("\nAfter Custom Sorting by Name Ascending and Roll Number Ascending:");
        // Sort students using a custom comparator by name ascending and roll number ascending
        java.util.Collections.sort(studentList, new ComparatorExample5());

        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
