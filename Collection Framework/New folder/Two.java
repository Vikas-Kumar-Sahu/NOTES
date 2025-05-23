import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Two {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(34);
        l1.add(45);
        l1.add(74);
        l1.add(91); 
        l1.addAll(l1);
        // System.out.println(l1.indexOf(91));
        
        // l1.remove(2);
        // l1.get(2); 
        
        // ListIterator<Integer> lit = l1.listIterator(l1.size());
        ListIterator<Integer> li = l1.listIterator();
        System.out.println(li.nextIndex());
        li.next();
        System.out.println(li.nextIndex());

        // System.out.println(l1.size());

        // while (lit.hasNext()) {
        //     System.out.print(lit.next()+" ");
        // }

        // System.out.println();

        // while (lit.hasPrevious()) {
        //     System.out.print(lit.previous()+" ");
        // }

        // for(Integer x: l1)
        //     System.out.print(x+" ");
    
        // List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6));

        // ListIterator<Integer> lit = l1.listIterator(l1.size());

        // System.out.println("Size of the list: " + l1.size());

        // while (lit.hasPrevious()) {
        //     System.out.println(lit.previous()); 
        // }
    }
}
