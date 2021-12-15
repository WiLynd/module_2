package bonus.bai_1.model;

public class Candidate {
    private String candidateId;
    private String nameStudent;
    private String dateOfBirth;
    private double mathPoint;
    private double literaturePoint;
    private double englishPoint;


    public Candidate()
    {}

    public Candidate(String studentid, String namestudent, String dateofbirth, double mathpoint, double literaturepoint, double englishpoint)
    {
        this.candidateId =studentid;
        this.nameStudent =namestudent;
        this.dateOfBirth =dateofbirth;
        this.mathPoint =mathpoint;
        this.literaturePoint =literaturepoint;
        this.englishPoint =englishpoint;
    }

    public Candidate(String studentId, String studentName, String studentBirth, String studentGender, String studentClassName, String studentCourse) {
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "studentId='" + candidateId + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mathPoint=" + mathPoint +
                ", literaturePoint=" + literaturePoint +
                ", englishPoint=" + englishPoint +
                '}';
    }

    public double pointSum()
    {
        return this.mathPoint +this.englishPoint +this.literaturePoint;
    }

    public String getStudentId() {
        return candidateId;
    }

    public void setStudentId(String studentId) {
        this.candidateId = studentId;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getLiteraturePoint() {
        return literaturePoint;
    }

    public void setLiteraturePoint(double literaturePoint) {
        this.literaturePoint = literaturePoint;
    }

    public double getEnglishPoint() {
        return englishPoint;
    }

    public void setEnglishPoint(double englishPoint) {
        this.englishPoint = englishPoint;
    }
}
