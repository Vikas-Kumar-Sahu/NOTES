import java.util.*;


// Q.3) Design a method which will accept a Collection and will remove all the integer from a collection.

public class RemoveInteger {
    public static void removeInteger(Collection c){
        System.out.println("Start The Removing");
        System.out.println(c);
        Iterator itr = c.iterator();
        
        while(itr.hasNext()){
            Object o = itr.next();
            if(o instanceof Integer)
                itr.remove();
        }
        System.out.println("After The Removing");
        System.out.println(c);
    }
    public static void remove(Collection c){
        for (Object o : c) {
            System.out.print(o+" ");        
        }
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

       // removeInteger(c);
       remove(c);
    }
}
