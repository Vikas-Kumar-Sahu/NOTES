import java.util.*;

// Q.5) Design a method which will count the integer elements available in a Collection.


public class CountInteger {
    public static void countInteger(Collection c){
        System.out.println("Start The Counting Integer");
        // System.out.println(c);
        Iterator itr = c.iterator();
        int count = 0;
        System.out.println(count);
        
        while(itr.hasNext()){
            Object o = itr.next();
            if(o instanceof Integer)
                count++;
        }
        System.out.println("After The Counting Integer");
        System.out.println(count);
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

        countInteger(c);
    }
}
