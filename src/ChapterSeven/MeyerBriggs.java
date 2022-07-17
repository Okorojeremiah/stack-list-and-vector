package ChapterSeven;

import java.util.Scanner;

public class MeyerBriggs {

    public static void main(String[] args) {
        questions();
        displayResult();
    }


    private final static int [][] mayerBriggs = new int[4][2];

    static void arraySize(){
        mayerBriggs[0][0] = 0;
        mayerBriggs[0][1] = 0;
        mayerBriggs[1][0] = 0;
        mayerBriggs[1][1] = 0;
        mayerBriggs[2][0] = 0;
        mayerBriggs[2][1] = 0;
        mayerBriggs[3][0] = 0;
        mayerBriggs[3][1] = 0;
    }

    static void questions(){
        Scanner scanner = new Scanner(System.in);
        String answers;

        for (int i = 1; i<=20; i++){
            System.out.println("Select an option");
            switch (i) {
                case 1:
                    System.out.println("""
                            1. 
                            A extend energy, enjoy groups
                            B conserve energy, enjoy one-on-one
                            """);
                    System.out.print("Answer: ");
                    answers = scanner.nextLine();

                    if(answers.equalsIgnoreCase("A") ){
                        mayerBriggs[0][0]++;
                    }else mayerBriggs[0][1]++;

                    break;

                case 2:
                    System.out.println("""
                            2.
                            A Interpret literally
                            B Look for meaning and possibilities
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if(answers.equalsIgnoreCase("A")){
                        mayerBriggs[1][0]++;
                    }else mayerBriggs[1][1]++;
                    break;

                case 3:
                    System.out.println("""
                            3.
                            A Logical, thinking, questioning
                            B Empathetic, feeling, accommodating
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if(answers.equalsIgnoreCase("A")){
                        mayerBriggs[2][0]++;
                    }else mayerBriggs[2][1]++;
                    break;
                case 4:
                    System.out.println("""
                            4.
                            A Organized, orderly
                            B Flexible, adaptable
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[3][0]++;
                    }else mayerBriggs[3][1]++;
                    break;
                case 5:
                    System.out.println("""
                            5.
                            A More outgoing, think out loud
                            B More reserved, think to yourself
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[0][0]++;
                    }else mayerBriggs[0][1]++;
                    break;
                case 6:
                    System.out.println("""
                            6.
                            A Practical, realistic, experimental
                            B Imaginative, innovative, theoretical
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[1][0]++;
                    }else mayerBriggs[1][1]++;
                    break;
                case 7:
                    System.out.println("""
                            7.
                            A Candid, straight forward, frank
                            B Tactful, kind, encouraging
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[2][0]++;
                    }else mayerBriggs[2][1]++;
                    break;
                case 8:
                    System.out.println("""
                            8.
                            A Plan, schedule
                            B Unplanned spontaneous
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[3][0]++;
                    }else mayerBriggs[3][1]++;
                    break;
                case 9:
                    System.out.println("""
                            9.
                            A Seek many tasks, public activities
                            B Interactions with others
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[0][0]++;
                    }else mayerBriggs[0][1]++;
                    break;
                case 10:
                    System.out.println("""
                            10.
                            A Standard, usual, conventional
                            B Different, novel, unique
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[1][0]++;
                    }else mayerBriggs[1][1]++;
                    break;
                case 11:
                    System.out.println("""
                            11.
                            A Firm, tend to criticize, hold the line
                            B Gentle, tend to appreciate, conciliate
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[2][0]++;
                    }else mayerBriggs[2][1]++;
                    break;
                case 12:
                    System.out.println("""
                            12.
                            A Regulated, structured
                            B Easy going, live and let's live
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[3][0]++;
                    }else mayerBriggs[3][1]++;
                    break;
                case 13:
                    System.out.println("""
                            13.
                            A External, communicative, express yourself
                            B Internal, reticent, keep to yourself
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[0][0]++;
                    }else mayerBriggs[0][1]++;
                    break;
                case 14:
                    System.out.println("""
                            14.
                            A Focus on here-and-now
                            B Look to the future, global perspective, big picture
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[1][0]++;
                    }else mayerBriggs[1][1]++;
                    break;
                case 15:
                    System.out.println("""
                            15.
                            A Tough minded, just
                            B Tender-hearted, merciful
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[2][0]++;
                    }else mayerBriggs[2][1]++;
                    break;
                case 16:
                    System.out.println("""
                            16.
                            A Preparation, plan ahead
                            B Go with the flow, adapt as you go
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[3][0]++;
                    }else mayerBriggs[3][1]++;
                    break;
                case 17:
                    System.out.println("""
                            17.
                            A Active, initiate
                            B Reflective, deliberate
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[0][0]++;
                    }else mayerBriggs[0][1]++;
                    break;
                case 18:
                    System.out.println("""
                            18.
                            A Facts, things, "what is"
                            B Ideas, dreams, "what could be", philosophical
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[1][0]++;
                    }else mayerBriggs[1][1]++;
                    break;
                case 19:
                    System.out.println("""
                            19.
                            A Matter of fact, issue-oriented
                            B Sensitive, people-oriented, compassionate
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[2][0]++;
                    }else mayerBriggs[2][1]++;
                    break;
                case 20:
                    System.out.println("""
                            20.
                            A Control, govern
                            B Latitude, freedom
                            """);
                    System.out.println("Answer: ");
                    answers = scanner.nextLine();

                    if (answers.equalsIgnoreCase("A")){
                        mayerBriggs[3][0]++;
                    }else mayerBriggs[3][1]++;

                    break;

            }

        }

    }

    static  void displayResult(){
        String personality1 = "";
        String personality2 = "";
        String personality3 = "";
        String personality4 = "";

        if(mayerBriggs[0][0] > mayerBriggs[0][1]){
            personality1 = "E";
        }else personality1 = "I";

        if(mayerBriggs[1][0] > mayerBriggs[1][1]){
            personality2 = "S";
        }else personality2 = "N";

        if(mayerBriggs[2][0] > mayerBriggs[2][1]){
            personality3 = "T";
        }else personality3 = "F";

        if(mayerBriggs[3][0] > mayerBriggs[3][1]){
            personality4 = "J";
        }else personality4 = "P";

        System.out.println();
        System.out.println("your personality is: " + personality1 + personality2 + personality3 + personality4);

    }




}
