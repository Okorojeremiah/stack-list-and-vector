package dataStructure;

public interface List {
    void add(String item);
    void remove(int id);
    void remove(String item);
    String get(int id);
    void add(String item, int id);
    void clear();
    int size();
    boolean isEmpty();
    boolean contains(String anotherItem);
}
