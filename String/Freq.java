import java.util.Scanner;

public class Freq {
    
    public static int firstUniqueChar(String s) {
        s=s.toLowerCase();
        int[] a = getFreq(s);
        for(int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if(a[c-97] == 1)
                return i;
        }
        return -1;
    }

    public static int[] getFreq(String s) {
        s=s.toLowerCase();
        int[] a = new int[26];
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            a[c-97]++;
        }
        return a;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String s = sc.next();
      
        int pos = firstUniqueChar(s);
        System.out.println(s.charAt(pos));
        
    }
}
