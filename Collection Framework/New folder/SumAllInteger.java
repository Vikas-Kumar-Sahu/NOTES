import java.util.*;

// Q.7) Design a method which will print the sum of all integer number from Collection.

public class SumAllInteger {
    public static void sumAllInteger(Collection c){
        System.out.println("Start The Counting Even Integer");
        // System.out.println(c);
        Iterator itr = c.iterator();
        int sum = 0;
        System.out.println(sum);
        
        while(itr.hasNext()){
            Object o = itr.next();
            if(o instanceof Integer)
                sum = (Integer)o + sum;
        }
        System.out.println("After The Counting Even Integer");
        System.out.println(sum);
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

        sumAllInteger(c);
    }
}
