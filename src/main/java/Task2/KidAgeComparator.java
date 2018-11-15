package Task2;

import java.util.Comparator;

public class KidAgeComparator implements Comparator <Kid> {
    @Override
    public int compare(Kid kid1, Kid kid2) {
        Integer age1 = new Integer(kid1.getAge());
        Integer age2 = new Integer(kid2.getAge());
        return age1.compareTo(age2);
    }
}
