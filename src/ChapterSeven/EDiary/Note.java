package ChapterSeven.EDiary;

import java.util.Scanner;

public class Note {
    private static AppUser appUser;
    public static void main(String[] args) {
      playConsole();
    }

    public static void playConsole(){
        System.out.println("Welcome");
        DiaryServices dairy = new DiaryServices();
        String userSelection = "0";

        dairy.registerUser();


        while (!userSelection.equals("5")){
            dairy.screenView();
            System.out.println("""
                "Select a service from 1-5:
                1. Add entry
                2. Search diary
                3. Delete entry
                4. Delete user
                5. End""");

            Scanner scanner = new Scanner(System.in);

            userSelection= scanner.nextLine();

            switch (userSelection) {
                case "1":
                    dairy.addEntries();
                    break;
                case "2":
                    dairy.search();
                    break;
                case "3":
                    dairy.deleteEntry();
                    break;
                case "4":
                    dairy.deleteUser();
                    break;
                case "5":
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Oops. Press any key to select another service");
                    break;
            }
        }
    }
}
