// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Collection;
import java.util.*;

// Q.1) Design a method which will accept a Collection and will remove all the String type element from Collection.

public class RemoveString {

    public static void removeString(Collection c){
        System.out.println("Start The Removing");
        System.out.println(c);
        Iterator itr = c.iterator();
        
        while(itr.hasNext()){
            Object o = itr.next();
            if(o instanceof String)
                itr.remove();
        }
        System.out.println("After The Removing");
        System.out.println(c);
    }

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(23);    
        c.add(64.5);
        c.add("Mohan");
        c.add(53);    
        c.add(654.5);
        c.add("Sohan");
        c.add(235);    
        c.add(64.25);
        c.add("Rohan");

        removeString(c);
    }
}
