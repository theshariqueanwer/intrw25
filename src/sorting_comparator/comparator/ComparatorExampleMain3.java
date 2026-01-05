package sorting_comparator.comparator;



import com.pack.sorting_comparator.Student;

import java.util.Comparator;

class ComparatorExample3 implements Comparator<Student> {

    // Compare by length of name ascending
    @Override
    public int compare(Student s1, Student s2) {
        // return 0;
        return s1.getName().length() - s2.getName().length();
    }

}

public class ComparatorExampleMain3 {
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

        System.out.println("\nAfter Custom Sorting by Name Length Ascending:");
        // Sort students using a custom comparator by name length ascending
        java.util.Collections.sort(studentList, new ComparatorExample3());

        // Print sorted list
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
