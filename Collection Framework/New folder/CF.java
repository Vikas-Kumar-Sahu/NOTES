import java.util.*;
import java.util.ArrayList;

public class CF {

    // WAP to remove all the odd elements from Collection.

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        c.add(23);
        c.add(45);
        c.add(36);
        System.out.print(c+" ");

        Collection<Integer> c1 = new ArrayList<>();
        c1.add(95);
        c1.add(67);
        c1.addAll(c);
        System.out.print("\n"+c1+" ");
    }
    
}