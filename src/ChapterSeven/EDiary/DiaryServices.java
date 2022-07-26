package ChapterSeven.EDiary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class DiaryServices {

    private AppUser appUser;
    private Db db;
    private Scanner scanner = new Scanner(System.in);
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/y HH:mm");
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/y");

    public DiaryServices(){
        db = new Db();
    }

    public LocalDateTime readDateTime(){
        System.out.println("Enter date and time as mm/dd/yy hh:mm");
        LocalDateTime localDateTime;
        try{
            localDateTime = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        }catch (DateTimeParseException e){
            System.out.println("Error. Please try again");
            return readDateTime();
        }
        return localDateTime;
    }

    public LocalDate readDate(){
        System.out.println("Enter date and time as mm/dd/yy");
        LocalDate localDate;
        try{
            localDate = LocalDate.parse(scanner.nextLine(), dateFormatter);
        }catch (DateTimeParseException e){
            System.out.println("Error. Please try again");
            return readDate();
        }
        return localDate;
    }

    public void registerUser() {
        appUser = new AppUser("hhdhh", "0000");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a name");
            String name = scanner.nextLine();

            System.out.println("Enter a password");
            String password = scanner.nextLine();

            appUser.setName(name);
            appUser.setPassword(password);
            System.out.println(appUser.getName() + " is your username");
            System.out.println();
        }catch (NullPointerException ignored){
        }

    }

    public void printEntries(LocalDate day){
        ArrayList<AppUser> entries = db.findEntries(day.atStartOfDay(), false);
        for (AppUser entry : entries){
            System.out.println(entry);
        }
    }

    public void addEntries(){
        LocalDateTime localDateTime = readDateTime();
        System.out.println("Start typing...");
        String text = scanner.nextLine();
        db.addEntry(localDateTime, text);
    }

    public void search(){
        LocalDateTime localDateTime = readDate().atStartOfDay();
        ArrayList<AppUser> entries = db.findEntries(localDateTime, false);
        if (entries.size() > 0){
            System.out.println("Entries found: ");
            for (AppUser entry : entries){
                System.out.println(entry);
            }
        }else {
            System.out.println("No entries found");
        }
        scanner.nextLine();
    }

    public void deleteEntry(){
        System.out.println("Entries that were made with the same date and time will be deleted");
        LocalDateTime localDateTime = readDateTime();
        db.deleteEntries(localDateTime);
    }

  public void deleteUser() {

        Scanner scanner = new Scanner(System.in);

      System.out.println("Are you sure you want to?\n" +
              "All entries from this user will be lost\n" +
              "Yes/No");

      String in = scanner.nextLine();

      try {
          if (in.equalsIgnoreCase("yes")){
              System.out.println("Enter your name");
              String name = scanner.nextLine();

              System.out.println("Enter your password");
              String password = scanner.nextLine();

              if (name.equals(appUser.getName()) && password.equals(appUser.getPassword())){
                  appUser.setName(null);
                  appUser.setPassword(null);
                  System.out.println("Your account has been successfully deleted");
                  Note.playConsole();
              }

              else System.out.println("Oops..\n" +
                      "Wrong Credentials " +
                      "cannot delete account");
          }
      }catch (NullPointerException ignored){
      }
    }

    public void screenView(){
        System.out.println();
        System.out.println();
        System.out.println("Welcome " + appUser.getName());
        System.out.println("Today is " + LocalDateTime.now().format(dateTimeFormatter));
        System.out.println();

        System.out.println("Today:\n-------");
        printEntries(LocalDate.now());
        System.out.println();
        System.out.println("Tomorrow:\n-------");
        printEntries(LocalDate.now().plusDays(1));
        System.out.println();


    }

}
