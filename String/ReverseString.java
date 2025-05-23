import java.util.Scanner;

public class ReverseString {

    public static void revString(String s){
        String word = "";
            for(int i=s.length()-1; i>=0; i--){
            char c = s.charAt(i);
            if(c != ' '){
                word = c + word;
            }
            if ((c == ' ' && !word.isEmpty() || i==0)) {
                System.out.print(word+" ");
                word="";
            }
        }
    }

    public static void printWord(String s){
        String word = "";
            for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' '){
                word = c + word;
            }
            if ((c == ' ' || i==s.length()-1) && !word.isEmpty()) {
                System.out.print(word+" ");
                word="";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String :");
        String s = sc.nextLine();

        // revString(s);
        printWord(s);
    }
}