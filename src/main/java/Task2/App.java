package Task2;

import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        KidAgeComparator kidAgeComparator = new KidAgeComparator();
        TreeSet <Kid> person = new TreeSet<>(kidAgeComparator);
        person.add (new Kid("Andriy", 3));
        person.add (new Kid("Matviy", 2));
        person.add (new Kid("Luka", 1));
        person.add (new Kid("Demyan", 6));
        person.add (new Kid("Maxum", 7));
        person.add (new Kid("Ivan", 4));
        person.add (new Kid("Mark", 3));
        System.out.println(person);
    }
}
