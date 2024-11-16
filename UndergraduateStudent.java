
public class UndergraduateStudent extends Student implements ScholarshipEligibility {
    public UndergraduateStudent(String name, int age, int studentId, int[] grades) {
        super(name, age, studentId, grades);
    }

    @Override
    public boolean IsEligibleForScholarship() {
        return calculateAverageGrade() > 85;
    }

    @Override
    String getDetails() {
        return super.getDetails() + ", Level:  Is Undergraduate";
    }


}

class GraduateStudent extends Student implements ScholarshipEligibility{

    public GraduateStudent(String name, int age, int studentId, int[] grades) {
        super(name, age, studentId, grades);
    }

    @Override
    public boolean IsEligibleForScholarship() {
        return calculateAverageGrade() > 85;
    }

    @Override
    String getDetails() {
        return super.getDetails() + ",Level: Is Graduate";
    }
}
