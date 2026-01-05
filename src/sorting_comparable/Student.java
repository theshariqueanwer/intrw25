package sorting_comparable;

public class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;

    public Student() {
    }

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    // implement compareTo to sort by rollNumber
    // @Override
    // public int compareTo(Student other) {
    //     return Integer.compare(this.rollNumber, other.rollNumber);
    // }

    // implement compareTo to sort by name
    // @Override
    // public int compareTo(Student other) {
    //     return this.getName().compareTo(other.getName());
    // }


    // implement compareTo to sort by rollNumber
    @Override
    public int compareTo(Student other) {
        // Natural ordering by rollNumber
        return Integer.compare(this.rollNumber, other.rollNumber);
    }


    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }


}
