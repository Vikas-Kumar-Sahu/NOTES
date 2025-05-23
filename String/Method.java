public class Method {

    public static void main(String[] args) {
        String s1 = "mohan bhai";
        String s2 = "Mohan";
        char[] a = s1.toCharArray();        // Converts this string to a new character array.
        System.out.println(a[4]);
        System.out.println(String.valueOf(s1)+'i');
        System.out.println(s1.compareTo(s2));        // s2-s1
        System.out.println(s1.compareToIgnoreCase(s2));     // ignore same char
        
    }
}