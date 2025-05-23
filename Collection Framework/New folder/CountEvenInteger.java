import java.util.*;

// Q.6) Design a method which will count even integer numbers froam a Collection.


public interface CountEvenInteger {
    public static void countEvenInteger(Collection c){
        System.out.println("Start The Counting Even Integer");
        // System.out.println(c);
        Iterator itr = c.iterator();
        int count = 0;
        System.out.println(count);
        
        while(itr.hasNext()){
            Object o = itr.next();
            if(o instanceof Integer && (Integer)o%2==0)
                count++;
        }
        System.out.println("After The Counting Even Integer");
        System.out.println(count);
    }

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(32);    
        c.add(64.5);
        c.add("Mohan");
        c.add(53);    
        c.add(654.5);
        c.add("Sohan");
        c.add(235);    
        c.add(64.25);
        c.add("Rohan");
        c.add(24);

        countEvenInteger(c);
    }
}
