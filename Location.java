import java.util.*;

public class Location implements Interactive {
    private String name;
    private ArrayList<Character> personList;

    public Location(String n) {
        this.name = n;
        this.personList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Character> getPersonList() {
        return personList;
    }
    public void addPerson(Character c) {
        personList.add(c);
    }
    public void removePerson(Character c) {
        personList.remove(c);
    }
    public void interact() {
      System.out.println("text here");
    }
}