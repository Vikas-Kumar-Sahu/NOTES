public class Digits {

    // print each digit one by one.
    public static void program1(int n){
        while (n>0) {
            int rem = n%10;
            System.out.print(rem+" ");
            n = n / 10;
        }      
    }

    // print all even digit.
    public static void program2(int n){
        while (n>0) {
            int rem = n%10;
            if (rem%2 == 0) {
                System.out.print(rem+" ");
            }
            n = n / 10;
        }      
    }

    // print all odd digit.
    public static void program3(int n){
        while (n>0) {
            int rem = n%10;
            if (rem%2 != 0) {
                System.out.print(rem+" ");
            }
            n = n / 10;
        }      
    }

    // print all digit greater than 5.
    public static void program4(int n){
        while (n>0) {
            int rem = n%10;
            if (rem%2 > 5) {
                System.out.print(rem+" ");
            }
            n = n / 10;
        }      
    }

    // to count no of digits in a number.
    public static void program5(int n){
        int count = 0;
        while (n>0) {
            int rem = n%10;
            System.out.println(rem);
            count++;
            n = n / 10;
        }      
        System.out.println(count);
    }

    // count all even digit.
    public static void program6(int n){
        int count = 0;
        while (n>0) {
            int rem = n%10;
            if (rem%2 == 0) {
                count++;
            }
            n = n / 10;
        }      
        System.out.print(count);
    }  
    
    // count all odd digit.
    public static void program7(int n){
        int count = 0;
        while (n>0) {
            int rem = n%10;
            if (rem%2 != 0) {
                count++;
            }
            n = n / 10;
        }      
        System.out.print(count);
    } 

    // print the biggest digit of the number.
    public static void program8(int n){
        int biggerNumber = 0;
        while (n>0) {
            int rem = n%10;
            if (biggerNumber < rem) {
                biggerNumber = rem;
            }
            n = n / 10;
        }      
        System.out.print(biggerNumber);
    }

    // print the biggest and smallest
    public static void program9(int n){
        int biggerNumber = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (n>0) {
            int rem = n%10;
            if (biggerNumber < rem) {
                biggerNumber = rem;
            }
            if (smallest > rem) {
                smallest = rem;
            }
            n = n / 10;
        }      
        System.out.print(biggerNumber+" biggest");
        System.out.print("\n"+smallest+" smallest");
    }

    // print the diffrence biggest and smallest
    public static void program10(int n){
        int biggerNumber = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (n>0) {
            int rem = n%10;
            if (biggerNumber < rem) {
                biggerNumber = rem;
            }
            if (smallest > rem) {
                smallest = rem;
            }
            n = n / 10;
        }      
        int diffrence = biggerNumber - smallest;
        System.out.print(diffrence);
    }

    // check whether is even or odd.
    public static void program11(int n){
        while (n>0) {
            int rem = n%10;
            if (rem%2 != 0) {
                System.out.print(rem+" odd digit");
            }else{
                System.out.print(rem+" even digit");
            }
            n = n / 10;
        } 
    }
    
    // to calculate sum of each digits of the number.
    public static void program12(int n){
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            sum += rem;
            n = n / 10;
        } 
        System.out.println("sum of each digit : "+sum);
    }

    // to calculate sum of even digits of the number.
    public static void program13(int n){
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            if (rem%2 == 0) {
                sum += rem;
            }
            n = n / 10;
        } 
        System.out.println("sum of each digit : "+sum);
    }

    // to calculate the sum of factorial of each digits of number.
    public static void program14(int n){
        int sum = 0;
        int res = 1;
        while (n>0) {
            int rem = n%10;
            while (rem>1) {
                res = res * rem;
                rem--;
            }
            n = n / 10;
            sum = sum + res;
            res = 1;
        }
        
        System.out.println("sum of factorial each digit : "+sum);
    }

    /* to check whether number is strong or not. */
    // print if sum of of each digits of no equal to number itself then called strong
    public static void program15(int n){
        int sum = 0;
        int res = 1;
        while (n>0) {
            int rem = n%10;
            while (rem>1) {
                res = res * rem;
                rem--;
            }
            n = n / 10;
            sum = sum + res;
            if (sum == res) {
                System.out.println(sum+" is strong number.");
            }
            res = 1;
        }
    } 

    // reverse a number.
    public static void program16(int n){
        while (n>0) {
            int rem = n%10;
            System.out.print(rem);
            n = n/10;
        }
    }

    // whether the number is palindrome or not.
    public static void program17(int n){
        int reverse = 0;
        int temp = n;
        while (n>0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n = n / 10;
        }
        if (temp == reverse) {
            System.out.println("is Palindrome");
        }else{
            System.out.println("is not Palindrome");
        }
    }

    public static void main(Strings[] args) {
        int n = 564784;
        // program1(n);
        // program2(n);
        // program3(n);
        // program4(n);
        // program5(n);
        // program6(n);
        // program7(n);
        // program8(n);
        // program9(n);
        // program10(n);
        // program11(n);
        // program12(n);
        // program13(n);
        // program14(n);
        // program15(145);
        // program16(n);
        program17(n);

    }
}
