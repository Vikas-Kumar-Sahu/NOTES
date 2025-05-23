import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Names {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(45);
        l1.add(3,35);
        l1.add(87);
        l1.add(31);
        l1.add(25);

        Iterator<Integer> i = l1.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}