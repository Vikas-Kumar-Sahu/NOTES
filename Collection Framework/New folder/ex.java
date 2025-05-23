import java.util.*;

public class ex {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        
        // Create a ListIterator starting at the end of the list
        ListIterator<String> l = l1.listIterator(l1.size());

        // Print the size of the list
        System.out.println("Size of the list: " + l1.size());

        // Iterate backward without using next()
        while (l.hasPrevious()) {
            System.out.println(l.previous()); // Print elements in reverse order
        }
    }
}

