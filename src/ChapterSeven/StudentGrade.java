package ChapterSeven;

public class StudentGrade {
    private double subject1;
    private double subject2;
    private double subject3;
    private String student;
    private double total;
    private double average;
    private int position;

    public StudentGrade(String student, double subject1, double subject2, double subject3, double total, double average){
        this.student = student;
        this.total = total;
        this.average = average;

        if (subject1>=0 && subject1<=100){
            this.subject1 = subject1;
        }
        if (subject2>=0 && subject2<=100){
            this.subject2 = subject2;
        }
        if (subject3>=0 && subject3<=100){
            this.subject3 = subject3;
        }
    }

    public double getSubject1() {
        return subject1;
    }

    public void setSubject1(double subject1) {
        this.subject1 = subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public void setSubject2(double subject2) {
        this.subject2 = subject2;
    }

    public double getSubject3() {
        return subject1;
    }

    public void setSubject3(double subject3) {
        this.subject3 = subject3;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public void displayList() {
        System.out.printf("%s%12.2f%8.2f%8.2f%8.2f%8.2f%n", student, subject1, subject2, subject3, total, average);
    }

    public double total(){
        double totalScore = subject1 + subject2 + subject3;
        return totalScore;
    }

    public double average(){
        double averageScore = total()/3;
        return averageScore;
    }

}


