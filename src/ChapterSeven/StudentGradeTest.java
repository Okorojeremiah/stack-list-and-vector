package ChapterSeven;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StudentGrade grade = new StudentGrade("subject 1", 10, 45, 50, 40, 60);

        double totalScore;
        double totalAverage = 0;
        double totalScoreForSubject1 = 0;
        double totalScoreForSubject2 = 0;
        double totalScoreForSubject3 = 0;
        int numberOfPasses = 1;
        int numberOfFails = 1;
        int position = 0;
        double average;
        int counter = 1;
        double total = 0;

        ArrayList <StudentGrade> students = new ArrayList<>();


        do{
            System.out.println("Enter student name: ");
            String student = scan.nextLine();
            grade.setStudent(student);

            System.out.println("Enter score for subject 1: ");
            double subject1 = scan.nextDouble();

            System.out.println("Enter score for subject 2: ");
            double subject2 = scan.nextDouble();

            System.out.println("Enter score for subject 3: ");
            double subject3 = scan.nextDouble();

            totalScore = subject1 + subject2 + subject3;

            average = totalScore/3;
            totalAverage = totalAverage + average;

            totalScoreForSubject1 = totalScoreForSubject1 + subject1;

            students.add(new StudentGrade(student, subject1, subject2, subject3, totalScore, average));
            scan.nextLine();

            counter++;
        }
        while(counter <= 3);

        System.out.println("===========================================================================");
        System.out.printf("%s%12s%8s%8s%8s%8s%8s%n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        System.out.println("===========================================================================");

        for (StudentGrade e: students) {
           e.displayList();
        }

        System.out.println("===========================================================================");
        System.out.println("===========================================================================");
        System.out.println("SUBJECT SUMMARY");
        System.out.println("Subject 1");
        System.out.println("SUBJECT SUMMARY");
        System.out.println("Highest scoring student is: ");


    }
}
