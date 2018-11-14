package Task1;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andriy", "Petro", "Pavlo", "Bogdan", "Vasul", "Ivan", "Mukola",
                "Muron", "Mukhaylo", "Charly", "Igor", "Slavko", "Viktor", "Vitalik", "Maryan", "Ivan", "Petro", "Pavlo",
                "Igor", "Bogdan");
        HashSet<String> names1 = new HashSet<String>();
        names1.addAll(names);
        System.out.println(names1);
        System.out.println(names1.size());
        ArrayList <String> names2 = new ArrayList<>();
        names2.addAll(names1);
        System.out.println(names2);
        for (int i = 0; i < names2.size(); i++) {
            if ((names2.get(i).startsWith("A"))|| (names2.get(i).startsWith("B"))||
                    (names2.get(i).startsWith("C"))||(names2.get(i).startsWith("V"))||
                    (names2.get(i).startsWith("P"))) {
               names2.remove(names2.get(i));
               if (i!=0){i=i-1;}
            }
        }
       System.out.println(names2);
    }

}


