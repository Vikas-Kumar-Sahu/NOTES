import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Four {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(24);
        list.add("Ram");
        list.add("Ram"); 
        list.add("Ram"); 
        list.add("Ram"); 
        list.add("Ram"); 
        list.add("Ram"); 

        // System.out.println(list.size());
        ArrayList<String> li = new ArrayList<>(list);

        Iterator itr = li.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }

    }
}