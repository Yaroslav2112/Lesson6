package Task4;

import java.util.HashSet;

public class Apppp {
    public static void main(String[] args) {
        HashSet<String> pers = new HashSet<>();
        pers.add("Ivan");
        pers.add("Mark");
        pers.add("Oleg");
        pers.add("Igor");
        pers.add("Mukola");
        pers.add("Petro");
        pers.add("Pavlo");
        pers.add("Andriy");
        pers.add("Stepan");
        pers.add("Vasul");

        HashSet<String> pers1 = new HashSet<>();
        pers1.add("Ivan");
        pers1.add("Marko");
        pers1.add("Oleg");
        pers1.add("Sasha");
        pers1.add("Taras");
        pers1.add("Petro");
        pers1.add("Pavlo");
        pers1.add("Andriy");
        pers1.add("Jenia");
        pers1.add("Vasul");
        pers.retainAll(pers1);
        System.out.println("Спільні імена для обох сетів: ");
        System.out.println(pers);

    }
}
