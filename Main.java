

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();


        management.addStudent(new UndergraduateStudent("Vishal", 23, 101, new int[]{70, 81, 89}));
        management.addStudent(new GraduateStudent("Lahu", 25, 102, new int[]{80, 86, 95}));
        management.addStudent(new UndergraduateStudent("Vicky", 19, 103, new int[]{80, 88, 89}));
        management.addStudent(new GraduateStudent("Sarthak" , 27, 104, new int[]{88,89,96} ));
        management.addStudent(new UndergraduateStudent("Dev" , 24, 105, new int[]{94,83,85} ));
        management.addStudent(new GraduateStudent("Pravin" , 23, 106, new int[]{70,85,86} ));
        management.addStudent(new UndergraduateStudent("Kiran" , 28, 107, new int[]{70,76,89} ));

        System.out.println("Scholarship Eligible Students:");
        management.displayScholarshipEligibleStudents();

        System.out.println("All Students:");
        management.displayAllStudents();




        System.out.println("Starting Report Generation:");
        ReportGenerator report = new ReportGenerator(management.students, management.count);
        Thread reportThread = new Thread(report);
        reportThread.start();


        System.out.println("Total Students: " + Student.getTotalStudents());
    }
}
