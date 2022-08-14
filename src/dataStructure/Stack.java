package dataStructure;

import java.util.Objects;

public class Stack extends Vector {
    private final String[] elements = new String[500];
    private boolean isEmpty = true;
    private int count;

    public void push(String items){
        isEmpty = false;
        elements[count] = items;
        count++;
    }

    @Override
    public boolean isEmpty(){
        return isEmpty;
    }

    public String pop() {
       String item;
       count--;
       item = elements[count];
       elements[count] = null;
       return item;
    }

    public String peek() {
        String item;
        item = elements[count - 1];
        return item;
    }

    public void search(String item){
        for(int i = 0; i < elements.length; i++){
            if (Objects.equals(elements[i], item)){
                System.out.println(i);
            }
        }
    }

    @Override
    public String get(int id) {
        return elements[id];
    }

    @Override
    public int size() {
        return count;
    }
}
