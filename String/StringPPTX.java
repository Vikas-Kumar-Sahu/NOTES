import java.util.Scanner;

public class StringPPTX {
    
    // WAJP to take a String input get length of String without using length method.
    public static int getLength(String s){
        s = s +'\0';
        int length = 0;
        for (int i=0; ; i++){
            if(s.charAt(i) == '\0')
                return length;
            length++;
        }
    }

    // WAJP to take a String input and count all numeric characters in the String.
    public static int countNumric(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
                count++;
        }
        return count;
    }    

    // WAJP to take a String input and count all the characters without spaces in the String.
    public static int countChar(String s){
        int count = 0;
        s = s.toUpperCase();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
                count++;
        }
        return count;
    } 

    // WAJP to take a String input and count all the characters(excluding any special characters).
    public static void countChars(String s){
        int count = 0;
        int len = 0;
        s = s.toUpperCase();
        for(int i=0; i<s.length();i++){
            if ( s.charAt(i) >= 65 && s.charAt(i) <= 90 )
                count++;
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) 
                len++;
        }
        System.out.println("Char count : "+count);
        System.out.println("Numeric count : "+len);
    }

    // WAJP to take a String input and count all the space characters, uppercase, lowercase, numeric, special characters in the String.
    public static int countAllChar(String s){
        int count = 0;
        for(int i=0; i<s.length();i++){
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
                count++;
        }
        return count;
    }

    // WAJP to take a String input and count all the vowel characters in the String.
    public static int countVowel(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'e')
                count++;
        }
        return count;
    }

    // WAJP to take a String input and print all the indexes where numeric characters are present in the String.
    public static void getIndex(String s){
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
                System.out.println(i);
        }
    }

    // WAJP to take a String input and print all the indexes where space characters are present in the String.

    // WAJP to take a String input and replace all the space characters from _ in the String.
    // a)By using replace() method
    // b)Without using replace() method
    public static String replaceSpace(String s){
        s = s.replace(' ','_');
        return s;
    }

    public static String replaceSpaceWithoutMethod(String s){
        String temp = "";
        char waste = ' ';
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                waste = s.charAt(i);
                temp = temp + "_";
            }else
                temp = temp + s.charAt(i);
        }
        return temp;
    }

    // WAJP to take a String input and print the sum of all the numeric characters in the String.
    // public static int sumNumeric(String s){
    //     int sum = 0;
    //     for(int i=0; i<s.length(); i++){
    //         if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
    //             sum = sum + charAt(i);
    //     }
    //     return sum;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String s = sc.nextLine();
        
        // System.out.println(countChars(s));
        countChars(s);
        // System.out.println("34"+'64');
        sc.close();
    }
}
