package ChapterSeven.EDiary;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Db {

    private ArrayList<AppUser> entries;

    public Db(){
        entries = new ArrayList<>();
    }

    public void addEntry(LocalDateTime localDateTime, String text){
        entries.add(new AppUser(localDateTime, text));
    }

    public ArrayList<AppUser> findEntries(LocalDateTime localDateTime, boolean find){
        ArrayList<AppUser> seen = new ArrayList<>();
        for(AppUser entry : entries){
            if((find && (entry.getLocalDateTime().equals(localDateTime))) || ((!find) && (entry.getLocalDateTime().toLocalDate().equals(localDateTime.toLocalDate())))){
                seen.add(entry);
            }
        }
        return seen;
    }

    public void deleteEntries(LocalDateTime localDateTime){
        ArrayList<AppUser> seen = findEntries(localDateTime, true);
        for (AppUser entry : seen){
            entries.remove(entry);
        }
    }
}
