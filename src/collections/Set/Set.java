package collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> set = new HashSet<String>();
        set.add("1");
        set.add("2");
        set.add("1");
        set.add("4");

        set.forEach(e-> System.out.println(e));

        Iterator<String> iterator = set.iterator();

        while(iterator.hasNext()) {
            String e = iterator.next();
            System.out.println(e);
            if(e.equals("4")) {
                iterator.remove();
            }
        }
        set.forEach(a-> System.out.println(a));

    }
}
