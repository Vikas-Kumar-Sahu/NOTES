import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class One {

    public static void main(String[] args) {
        Collection c1 = new ArrayList();

        // ADD METHOD
        c1.add(101);        
        c1.add("Ram");
        c1.add(40000);
        c1.add("Noida");

        // addAll METHOD
        // Collection c2 = new ArrayList();
        // c2.addAll(c1);

        // REMOVE
        // c1.remove("Ram"); 
        // c1.clear();

        // SEARCH
        // System.out.println(c1.contains(101));

        // System.out.println(c1.isEmpty());
        // System.out.println(c1.hashCode());

        Iterator itr = c1.iterator();
        // Iterator itr1 = c2.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        // for (Object object : c1) {
        //     System.out.println(object);
        // }
    }
}