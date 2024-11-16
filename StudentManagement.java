class StudentManagement {
    Student[] students = new Student[89];
    int count = 0;

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count++] = student;
        }
        else {
            System.out.println("Student  is full!");
        }
    }

    public void displayAllStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getDetails());
        }
    }

    public void displayScholarshipEligibleStudents() {
        for (int i = 0; i < count; i++) {
            if (students[i] instanceof ScholarshipEligibility) {
                ScholarshipEligibility eligible = (ScholarshipEligibility) students[i];
                if (eligible.IsEligibleForScholarship()) {
                    System.out.println(students[i].getDetails());
                }
            }
        }
    }
}