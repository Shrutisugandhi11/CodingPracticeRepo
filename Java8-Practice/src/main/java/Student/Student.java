package Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {
    private String name;
    private String subject;
    private int marks;

    public Student(String name, String subject, int marks) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', subject='" + subject + "', marks=" + marks + '}';

}


    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("A", "Hindi", 80),
                new Student("A", "Maths", 90),
                new Student("B", "Hindi", 70),
                new Student("B", "Maths", 60),
                new Student("C", "Science", 85)
        );

        Map<String, List<Student>> studentsByName = students.stream()
                .collect(Collectors.groupingBy(Student::getName));
        System.out.println(studentsByName);
        studentsByName.forEach((name, studentList) -> {
            Optional<Student> minMarksStudent = studentList.stream().min(Comparator.comparingInt((Student s) -> s.getMarks()));
            Optional<Student> maxMarksStudent = studentList.stream().max(Comparator.comparingInt((Student s) -> s.getMarks()));

            System.out.println("Student: " + name);

            if (minMarksStudent.isPresent()) {
                Student minStudent = minMarksStudent.get();
                System.out.println("Min marks: " + minStudent.getMarks() + " in " + minStudent.getSubject());
            }

            if (maxMarksStudent.isPresent()) {
                Student maxStudent = maxMarksStudent.get();
                System.out.println("Max marks: " + maxStudent.getMarks() + " in " + maxStudent.getSubject());
            }

            System.out.println();
        });
    }
}