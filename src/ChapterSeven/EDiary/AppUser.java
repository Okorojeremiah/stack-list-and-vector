package ChapterSeven.EDiary;

import java.time.LocalDateTime;

public class AppUser {

    String name;
    String password;
    String text;
    LocalDateTime localDateTime;


    public AppUser(String name, String password){
        this.name = name;
        this.password = password;
    }

    public AppUser(LocalDateTime localDateTime, String text){
        this.localDateTime = localDateTime;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return localDateTime.format(DiaryServices.dateTimeFormatter) + " " + text;
    }
}
