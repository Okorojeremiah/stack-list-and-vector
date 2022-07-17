package ChapterSeven;

public class StudentGrade2 {
    private int  [] subject1;
    private int  [] subject2;
    private int  [] subject3;
//    private String studentName1;
//    private String studentName2;
//    private String studentName3;

    public StudentGrade2( int[]subject1, int[]subject2, int[]subject3){
//        this.studentName1 = studentName1;
//        this.studentName2 = studentName2;
//        this.studentName3 = studentName3;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

//    public String getStudentName1() {
//        return studentName1;
//    }
//
//    public void setStudentName1(String studentName1) {
//        this.studentName1 = studentName1;
//    }
//
//    public String getStudentName2() {
//        return studentName2;
//    }
//
//    public void setStudentName2(String studentName2) {
//        this.studentName2 = studentName2;
//    }
//
//    public String getStudentName3() {
//        return studentName3;
//    }
//
//    public void setStudentName3(String studentName3) {
//        this.studentName3 = studentName3;
//    }

    public void processGradeForSubject1(){
        outPutGradeForSubject1();
        System.out.println("========================================================");
        System.out.println("========================================================");
        System.out.println("SUBJECT SUMMARY");
        System.out.println("Subject 1");
        System.out.println("Highest scoring student is: "  + " scoring " + getMaximumForSubject1());
        System.out.println("Lowest scoring student is: "  + " scoring " + getMinimumForSubject1());
        System.out.println("Total score is: " + getTotalScoreForSubject1());
        System.out.println("Average score: " + getAverageScoreForSubject1());
        System.out.println("Number of passes: " + getNumberOfPassesForSubject1());
        System.out.println("Number of fails: " + getNumberOfFailsForSubject1());
    }

    public void outPutGradeForSubject1() {
        for(int student = 0; student < subject1.length; student++){
            System.out.printf("Student %1d %8d%n", student +1, subject1[student]);
        }
        for(int student = 0; student < subject2.length; student++){
            System.out.printf("%16d%n", subject2[student]);
        }

    }

    public int getNumberOfFailsForSubject1() {
        int fails = 0;
        for (int grade1 : subject1){
            if(grade1 < 50){
                fails++;
            }
        }
        return fails;
    }

    public int getNumberOfPassesForSubject1() {
        int passes = 0;
        for(int grade1 : subject1){
            if(grade1 >= 50){
                passes++;
            }
        }
        return passes;
    }

    public double getAverageScoreForSubject1() {
        double average = (double)getTotalScoreForSubject1()/subject1.length;
        return average;
    }

    public int getTotalScoreForSubject1() {
        int total = 0;
        for(int grade1 : subject1){
            total+=grade1;
        }
        return total;
    }

    public int getMinimumForSubject1() {
        int lowestGrade1 = subject1[0];
        for(int grade1 : subject1){
            if(grade1 < lowestGrade1){
                lowestGrade1 = grade1;
            }
        }
        return lowestGrade1;
    }

    public int getMaximumForSubject1() {
        int highestGrade1 = subject1[0];
        for (int grade1 : subject1){
            if(grade1 > highestGrade1){
                highestGrade1 = grade1;
            }
        }
        return highestGrade1;
    }


    public void processGradeForSubject2(){
        System.out.println();
        System.out.println("Subject 2");
        System.out.println("Highest scoring student is: "  + " scoring " + getMaximumForSubject2());
        System.out.println("Lowest scoring student is: "  + " scoring " + getMinimumForSubject2());
        System.out.println("Total score is: " + getTotalScoreForSubject2());
        System.out.println("Average score: " + getAverageScoreForSubject2());
        System.out.println("Number of passes: " + getNumberOfPassesForSubject2());
        System.out.println("Number of fails: " + getNumberOfFailsForSubject2());
    }

    public void outPutGradeForSubject2() {

    }

    public int getNumberOfFailsForSubject2() {
        int fails = 0;
        for (int grade1 : subject1){
            if(grade1 < 50){
                fails++;
            }
        }
        return fails;
    }

    public int getNumberOfPassesForSubject2() {
        int passes = 0;
        for(int grade1 : subject1){
            if(grade1 >= 50){
                passes++;
            }
        }
        return passes;
    }

    public double getAverageScoreForSubject2() {
        double average = (double)getTotalScoreForSubject1()/subject1.length;
        return average;
    }

    public int getTotalScoreForSubject2() {
        int total = 0;
        for(int grade1 : subject1){
            total+=grade1;
        }
        return total;
    }

    public int getMinimumForSubject2() {
        int lowestGrade1 = subject1[0];
        for(int grade1 : subject1){
            if(grade1 < lowestGrade1){
                lowestGrade1 = grade1;
            }
        }
        return lowestGrade1;
    }

    public int getMaximumForSubject2() {
        int highestGrade1 = subject1[0];
        for (int grade1 : subject1){
            if(grade1 > highestGrade1){
                highestGrade1 = grade1;
            }
        }
        return highestGrade1;
    }
}
