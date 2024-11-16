

import java.util.ArrayList;

class Student extends Person {

    int studentId;
    int[] grades;
    static int totalStudents = 0;

    public Student(String name, int age, int studentId, int[] grades) {
        super(age, name);
        this.studentId = studentId;
        this.grades = grades;
        totalStudents++;
    }


    public int calculateAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return grades.length > 0 ? (int) sum / grades.length : 0;
    }

    @Override
    String getDetails() {
        return "Student ID: " + studentId + ", Name: " + name + ", Age: " + age;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    static class Course {
        String courseName;
        String courseCode;

        public Course(String courseName, String courseCode) {
            this.courseName = courseName;
            this.courseCode = courseCode;
        }

        @Override
        public String toString() {
            return "Course Name: " + courseName + ", Code: " + courseCode;

        }

    }
}
