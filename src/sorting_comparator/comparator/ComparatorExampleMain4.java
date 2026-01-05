package sorting_comparator.comparator;





import com.pack.sorting_comparator.Student;

import java.util.Comparator;

class ComparatorExample4 implements Comparator<Student> {

    // Compare by name length descending
    @Override
    public int compare(Student s1, Student s2) {
        // return 0;
        return s2.getName().length() - s1.getName().length();
    }
}

public class ComparatorExampleMain4 {
    static void main() {
        java.util.List<Student> studentList = new java.util.ArrayList<>();
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

        System.out.println("\nAfter Custom Sorting by Name Length Descending:");
        // Sort students using a custom comparator by name length descending
        java.util.Collections.sort(studentList, new ComparatorExample4());

        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
