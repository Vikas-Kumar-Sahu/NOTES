import java.util.Scanner;

public class Strings{

    //print from String one by one
    public static void One(String st){
        int i = 0;
        while (i < st.length()) {
            System.out.println(st.charAt(i));
            i++;
        }
    }

    //print reverse String one by one
    public static void RevOne(String st){
        int i = st.length()-1;
        while (i >= 0) {
            System.out.println(st.charAt(i));
            i--;
        }
    }

    //Reverse the whole String
    public static void Reverse(String st){
        String rev = "";
        int i = 0;
        while (i < st.length()) {
            rev = st.charAt(i) + rev;
            i++;
        }
        System.out.println(rev);
    }

    //check String is Palindrome
    public static void Palindrome(String st){
        String rev = "";
        int i = 0;
        while (i < st.length()) {
            rev = st.charAt(i) + rev;
            i++;
        }
        if(rev.contentEquals(st)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    //count vowels in String
    public static void CountVowel(String st){
        st=st.toLowerCase();
        int i = 0;
        int count = 0;
        while (i < st.length()) {
            if (st.charAt(i)=='a'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'||st.charAt(i)=='e') {
                count++;
            }
            i++;
        }
        System.out.println("count is " + count);
    }

    //count constant in String
    public static void CountConstant(String st){
        st=st.toLowerCase();
        int i = 0;
        int count = 0;
        while (i < st.length()) {
            if (st.charAt(i)=='a'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'||st.charAt(i)=='e') {
                
            }else{
                count++;
            }
            i++;
        }
        System.out.println("count is " + count);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String st = sc.nextLine();
        // One(st);
        // RevOne(st);
        // Reverse(st);
        // Palindrome(st);
        // CountVowel(st);
        CountConstant(st);

        sc.close();
    }
}