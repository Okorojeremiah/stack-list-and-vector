package ChapterSeven;

import java.util.Scanner;

public class StudentGrade2Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] array = new int[3];
        int [] array2 = new int[3];
        int [] array3 = new int[3];

        System.out.println("Enter score for subject 1: ");
        for (int score1 = 0; score1 < array.length; score1++){
            switch (score1){
                case 0:
                    System.out.print("STUDENT " + (score1 + 1) + ": ");
                    array[score1] = scan.nextInt();
                    break;
                case 1:
                    System.out.print("\nSTUDENT "+ (score1 + 1) + ": ");
                    array[score1] = scan.nextInt();
                    break;
                case  2:
                    System.out.print("\nSTUDENT " + (score1 + 1) + ": ");
                    array[score1] = scan.nextInt();
                    break;
            }
        }

        System.out.println("Enter score for subject 2: ");
        for (int score2 = 0; score2 < array2.length; score2++){
            switch (score2){
                case 0:
                    System.out.print("STUDENT " + (score2 + 1) + ": ");
                    array2[score2] = scan.nextInt();
                    break;
                case 1:
                    System.out.print("\nSTUDENT " + (score2 + 1) + ": ");
                    array2[score2] = scan.nextInt();
                    break;
                case 2:
                    System.out.println("\nSTUDENT " + (score2 + 1) + ": ");
                    array2[score2] = scan.nextInt();
                    break;
            }
        }


        StudentGrade2 student = new StudentGrade2(array, array2, array3);

        System.out.println("==================================================================");
        System.out.printf("%s%12s%8s%8s%8s%8s%8s%n", "STUDENT", "SUB1", "SUB2", "SUB3", "TOT", "AVE", "POS");
        System.out.println("==================================================================");
        student.processGradeForSubject1();
        student.processGradeForSubject2();


    }
}
