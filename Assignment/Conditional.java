class Conditional{

    // WAJP to find biggest numbers of by using conditional operator.
    public static void program1(int a, int b){
        String res = (a > b)?a+ " is a biggest number between "+a+" and " +b:b+ " is a biggest number "+a+" and " +b;
        System.out.println(res);
    }

    //WAJP to find biggest of three numbers of by using conditional operator.
    public static void program2(int a, int b, int c){
        String res = (a > b && a > c) ? a+" is biggest" : (b > c) ? b+" is biggest" : c+" is biggest" ;
        System.out.println(res);
    }

    //WAJP to find biggest of four numbers of by using conditional operator.
    public static void program3(int a, int b, int c, int d){
        String res = (a > b && a > c && a > d) ? a+" is biggest" : (b > c && b > d) ? b+" is biggest" : (c > d) ? c+" is biggest" : d+" is biggest" ;
        System.out.println(res);
    }

    //Take a character and check whether the character is an alphabet or not.
    public static void program4(char c){
        String res = (c >= 'a' && c <='z' || c >= 'A' && c <='Z') ? c+" is alphabet" :c+" not a alphabet";
        System.out.println(res);
    }

    //WAP to check whether a given character is lowercase or not.
    public static void program5(char c){
        String res = (c >= 'a' && c <='z' || c >= 'A' && c <='Z') ? (c >= 'a' && c <='z') ? c+" is lowercase" :c+" not a lowercase" :c+" not a alphabet";
        System.out.println(res);
    }

    //WAP to check whether a number is divisble by 5 and 11 or not
    public static void program6(int a){
        String res = (a%5==0 && a%7==0)?a+" is divisble by 5 and 7":a+" is not divisble by 5 and 7";
        System.out.println(res);
    }

    //WAP to input any alphabet and check whether it is vowel or not.
    public static void program7(char c){
        String res = (c=='a' || c=='i' || c=='o' || c=='u' || c=='e')?c+" is vowel":c+" is not a vowel";
        System.out.println(res);
    }

    //WAP to take three sides of a traingle and check whether traingle is valid or not.
    public static void program8(int a,int b,int c){
        String res = (a+b>c && b+c>a && a+c>b)?"this is traingle.":"this is not a traingle";
        System.out.println(res);
    }

    public static void main(String[] args) {
        // program1(9,5);
        // program2(4, 9, 5);
        // program3(23, 65, 31, 45);
        // program4('j');
        // program5('j');
        // program6(35);
        // program7('e');
        // program8(4,5,6);
    }
}