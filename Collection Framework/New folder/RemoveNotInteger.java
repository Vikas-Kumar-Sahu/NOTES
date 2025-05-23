import java.util.*;

// Q.4) Design a method which will accept a Collection and will remove all the String which are not the integer.

public class RemoveNotInteger {
    public static void removeNotIntegr(Collection c){
        System.out.println("Start The Removing");
        System.out.println(c);
        Iterator itr = c.iterator();
        
        while(itr.hasNext()){
            Object o = itr.next();
            if(o instanceof Integer){}
            else
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

        removeNotIntegr(c);
    }
}
