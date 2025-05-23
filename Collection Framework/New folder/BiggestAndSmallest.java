import java.util.*;

// Q.9) Design a method which will print the biggest and smallest integer number from Collection.

public class BiggestAndSmallest {
    public static void biggestAndSmallest(Collection c){
        Iterator itr = c.iterator();
        int biggest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        while(itr.hasNext()){
            Object o = itr.next();
            if(o instanceof Integer){
                if(biggest < (Integer)o)
                    biggest = (Integer)o;
                if(smallest > (Integer)o)
                    smallest = (Integer)o;
            }
        }
        System.out.println("Biggest Value of Collection");
        System.out.println(biggest);
        System.out.println("Smallest Value of Collection");
        System.out.println(smallest);
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

        biggestAndSmallest(c);
    }
}
