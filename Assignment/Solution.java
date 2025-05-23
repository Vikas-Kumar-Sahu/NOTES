class Solution {
    
    //WAJP to find biggest of three numbers by using if else statement.
    public static void program1(int a, int b, int c){
        if (a > b && a > c) {
            System.out.println(a+ " is biggest of all");
        } else {
            if (b > c) {
                System.out.println(b+ " is biggest of all");
            } else {
                System.out.println(c+ " is biggest of all");
            }
        }      
    }

    //WAJP to find biggest of four numbers by using if else statement.
    public static void program2(int a, int b, int c, int d){
        if (a > b && a > c && a > d) {
            System.out.println(a+ " is biggest of all");
        } else {
            if (b > c && b > d) {
                System.out.println(b+ " is biggest of all");
            } else {
                if (c > d) {
                    System.out.println(c+ " is biggest of all");
                } else {
                    System.out.println(d+ " is biggest of all");
                }
            }
        }      
    }

    //WAJP that takes a year from user and print whetrher is a leap year or not.
    public static void program3(int year){
        if (year%100 == 0) {
            if (year%400 == 0) {
                System.out.println(year+" is leap year.");
            } else {
                System.out.println(year+" is not leap year.");
            }
        } else {
            if (year%4 == 0) {
                System.out.println(year+" is leap year.");
            } else {
                System.out.println(year+" is not leap year.");
            }
        }
    }

    //Take a character and check whether the character is an alphabet or not.
    public static void program4(char c){
        if(c >= 'a' && c <='z' || c >= 'A' && c <='Z')
        {
            System.out.println(c+" is a alphabet");
        } else{
            System.out.println(c+" is not a alphabet");
        }
    }

    //Take a character and check whether the character is lowercase or uppercase.
    public static void program5(char c){
        if(c >= 'a' && c <='z' || c >= 'A' && c <='Z')
        {
            if (c >= 'a' && c <='z') {
                System.out.println(c+" is a lowercase");
            } else {
                System.out.println(c+" is a uppercase");   
            }
        } else{
            System.out.println(c+" is not a alphabet");
        }
    }

    //WAP to check whether a number is divisible by 5 and 11 or not.
    public static void program6(int n){
        if (n % 5==0 && n%11==0) {
            System.out.println(n+" is divisible by 5 and 11");
        } else {
            System.out.println(n+" is not divisible by 5 and 11");
        }
    }

    //WAP to input any alphabet and check whether is is vowel or consonant.
    public static void program7(char c){
        if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
            System.out.println(c+" is a alphabet.");
        }else{
            System.out.println(c+" is not a alphabet.");
        }
    }

    //WAP to input any character and check whether is alphabet,digit or special character.
    public static void program8(char c){
        if(c >= 'a' && c <='z' || c >= 'A' && c <='Z'){
            System.out.println(c+" is alphabet.");
        }else if(c >= '0' && c <= '9'){
            System.out.println(c+" is digit.");
        }else{
            System.out.println(c+" is special charcter.");
        }
    }

    //WAP to check whether a character is uppercase or lowercase alphabet.
    public static void program9(char c){
        if(c >= 'a' && c <='z' || c >= 'A' && c <='Z')
        {
            if (c >= 'a' && c <='z') {
                System.out.println(c+" is a lowercase.");
            } else {
                System.out.println(c+" is a uppercase.");   
            }
        }else{
            System.out.println(c+" is not a alphabet.");
        }
    }

    //WAP to input all sides of traingle and check whether traingle is valid or not.
    public static void program10(int a,int b,int c){
        if (a+b>c && b+c>a && a+c>b) {
            System.out.println("traingle is valid.");
        }else{
            System.out.println("traingle is not valid.");
        }
    }

    //WAP to input traingle is equilateral,isosceles or scalene traingle.
    public static void program11(int a,int b,int c){
        if (a+b>c && b+c>a && a+c>b) {
            if (a==b && b==c) {
                System.out.println("traingle is equilateral.");
            }else if(a==b || b==c || c==a){
                System.out.println("traingle is isosceles.");
            }else{
                System.out.println("traingle is scalene.");
            }
        }else{
            System.out.println("traingle is not valid.");
        }
    }

    //WAP to find real roots of a quadratic equation.
    public static void realRoot(double a,double b,double c){
        double d = b*b - 4*a*c;
        if (d >= 0) {
            System.out.println("Real roots are Possible");
            double p = (-b + Math.sqrt(d))/(2*a);
            double q = (-b + Math.sqrt(d))/(2*a);
            System.out.println("1st root is " +p);
            System.out.println("1st root is " +q);
        } else {
            System.out.println("Real roots are not Possible");
        }
    }

    //WAP to calculate %loss after taking cost price and selling price as user input.
    public static void program13(double costPrice, double sellingPrice) {
        if (sellingPrice < costPrice) {
            // Calculate the loss and percentage loss
            double loss = costPrice - sellingPrice;
            double percentageLoss = (loss / costPrice) * 100;

            // Display the results
            System.out.println("Loss incurred: " + loss);
            System.out.println("Percentage Loss: " + percentageLoss + "%");
        } else {
            System.out.println("No loss incurred. The selling price is greater than or equal to the cost price.");
        }
    }

    public static void main(Strings[] args) {
        // program1(6, 5, 12);
        // program2(45, 84, 64, 75);
        // program3(1900);
        // program4(q);
        // program5('Z');
        // program6(55);
        // program7('a');
        // program8('&');
        // program9('k');
        // program10(5,6,7);
        // program11(12,4,15);
        // realRoot(42.5, 12, 21.2);
        // program13(453.264,545.6);

    }
}
