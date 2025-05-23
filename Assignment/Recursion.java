public class Recursion {

    // WAJP TO PRINT ALL THE NO FROM 1 TO 100
    public static void Number(int n){
        if (n<=100) {
            System.out.print(n + " ");
            n++;
            Number(n);
        }
    }

    // reverse the no  from 100 to 1
    public static void reverseNumber(int n){
        if (n>=1) {
            System.out.print(n + " ");
            n--;
            reverseNumber(n);
        }
    }

    // genrate Table
    public static void Table(int n, int i){   
        if (i<=10) {
            System.out.println(n +"*"+i+": "+ n*i);
            i++;
            Table(n, i);
        }
    }

    // sum of no from 1 to 100
    public static void Sum(int n){
        int sum = 0;
        if (n<=100) {
            sum = sum * n;
            n++;
            Number(n);
        }
    }

    public static void print(){
        
        for(int i=101;i<=200;i++){
            for(int j=3; j<i;j++){
                int count  = 0;
                if(i%j==0){
                    count=count+1;
                }if(count>1){
                    System.out.println(i);
                }
                System.out.println(count);
            }
           
        }
        
    }

    public static void Pattern(){
        int n = 9;
        int star=1;
        int mid = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if()
            }
        }
    }

    // public static void palindrome(){
    //     int i = 1000;
    //     int count = 0;
    //     while(i>=1000 && i<=2000){

    //     }
    // }

    public static void main(String[] args) {
        // Number(1);
        // reverseNumber(100);
        // Table(7,1);
        // Sum(1);
        // print();
        Pattern();
    }
}