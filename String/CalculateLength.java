import java.util.Scanner;

public class CalculateLength {

    public static int getLength(String s){
        int length = 0;
        try {
            for(int i=0; ;i++){
                s.charAt(i);
                length++;
            }
        } catch (Exception e) {
            return length;
        }
    }

    public static int getLen(String s){
        s = s + '\0';
        int length = 0;
        for(int i=0; ;i++){
            if (s.charAt(i) == '\0')
                return length; 
            length++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1 = sc.next();
        char[] a = s1.toCharArray();
        System.out.println(a.length);
        System.out.println(getLength(s1));
        System.out.println(getLen(s1));
        s1=s1+'\0';
        System.out.println(s1.lastIndexOf('\0'));

        sc.close();
    }
}