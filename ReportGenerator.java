
public class ReportGenerator implements Runnable {
    private Student[] students;
    private int count;

    public ReportGenerator(Student[] students, int count) {
        this.students = students;
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("REPORT GENERATING..........");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].getDetails());
        }
    }
}
