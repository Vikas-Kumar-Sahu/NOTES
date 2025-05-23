public class loop {
    //WAJP to print all the even number upto 100.
    public static void program1(int n){
        while (n<=100) {
            if (n % 2 ==0) {
                System.out.print(n+" ");
            }
            n++;
        }
    }

    //WAJP to print all the number in a range whice ends with 7.
    public static void program2(int range){
        int i =1;
        while (i<=range) {
            if (i % 7 == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }

    //WAJP to print all the number upto 1000 which is ends with 8 and also divided by 8.
    public static void program3(){
        int i =1;
        while (i<=1000) {
            if (i % 10 == 8 && i % 8 == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }

    //WAJP to print and count all the numbers from 1000 upto 2000 which ends with 7 and also divided by 7.
    public static void program4(){
        int i =1000;
        int count=0;
        while (i>=1000 && i <=2000) {
            if (i % 10 == 7 && i % 7 == 0) {
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println("\ncount is : "+count);
    }

    //WAJP to print all the factors of a number.
    public static void program5(int n){
        int i=1;
        while (i < n) {
            if (n % i ==0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }

    //take a user input and print & count all the factors of the number.
    public static void program6(int n){
        int i=1;
        int count = 0;
        while (i < n) {
            if (n % i ==0) {
                System.out.print(i+" ");
                count++;
            }
            i++;
        }
        System.out.println("\ncount is : "+count);
    }

    //take a user input and print number is prime or not.
    public static void program7(int n){
        int i=0;
        while (i<=n) {
            if (i % 2 == 0) {
                System.out.println(i+" it is prime");
            }
            i++;
        }
    }

    /* WAJP to calculate the sum of the below series- */
    //1+2+3+......+sum upto 100 natural number.
    public static void programA(){ 
        int i = 0;
        int sum = 0;
        while(i<=100){
            sum = sum + i++;
        }
        System.out.println("sum is : "+sum);
    }

    //1^2+2^2+3^2+.....+100^2
    public static void programB(){ 
        int i = 1;
        int sum = 0;
        while(i<=100){
            sum += Math.pow(i, 2);
            i++;
        }
        System.out.println("sum is : "+sum); // 338350
    }

    //1^3+2^3+3^3+.....+100^3
    public static void programC(){ 
        int i = 1;
        long sum = 0;
        while(i<=100){
            sum += Math.pow(i, 3);
            i++;
        }
        System.out.println("sum is : "+sum); // 25502500
    }

    //1^4+2^4+3^4+.....+100^4
    public static void programD(){ 
        int i = 1;
        long sum = 0;
        while(i<=100){
            sum += Math.pow(i, 4);
            i++;
        }
        System.out.println("sum is : "+sum); // 2050333330
    }

    //1*2+2*3+3*4+........+99*100
    public static void programE(){ 
        int i = 1;
        int sum = 0;
        while(i<100){
            sum += i * (i+1);
            i++;
        }
        System.out.println("sum is : "+sum); // 343400
    }

    //1*2^2+2*3^2+3*4^2+........+99*100^2
    public static void programF(){ 
        int i = 1;
        long sum = 0;
        while(i<100){
            sum += i * Math.pow(i+1, 2);
            i++;
        }
        System.out.println("sum is : "+sum); // 25164150
    }

    //1^2*2+2^2*3+3^2*4+........+99^2*100
    public static void programG(){ 
        long sum = 0;
        long i = 1;
        while(i<100){
            sum += Math.pow(i, 2) * (i+1);
            i++;
        }
        System.out.println("sum is : "+sum);    // 24830850
    }

    //1/1+1/2+1/3+........+1/100
    public static void programH(){ 
        double sum = 0;
        double i = 1;
        while(i<=100){
            sum = sum + (1/i);
            i++;
        }
        System.out.println("sum is : "+sum);   // 5.187377517639621 
    }

    //1/1^2+1/2^2+1/3^2+........+1/100^2
    public static void programI(){ 
        double sum = 0;
        double i = 1;
        while(i<=100){
            sum = sum + (1/i*i);
            i++;
        }
        System.out.println("sum is : "+sum);   // 5.187377517639621 
    }

    //1/1^3+1/2^3+1/3^3+........+1/100^3
    // public static void programZ(){ 
    //     double sum = 0;
    //     double i = 1;
    //     while(i<=100){
    //         sum = sum + (1/Math.pow(i, 3));
    //         i++;
    //     }
    //     System.out.println("sum is : "+sum);   // 1.2020074006596781 
    // }

    //1-2+3-4+5-6+.......-100
    public static void programJ(){
        int i = 1;
        int sum = 0;
        while (i<=100) {
            if (i%2 == 0) {
                sum = sum - i;
            }else{
                sum = sum + i;
            }
            i++;
        }
        System.out.println("the sum of : "+sum);    // -50
    }

    //1/1-1/2+1/3-1/4+1/5-1/6+.......-1/100
    public static void programK(){
        double i = 1;
        double sum = 0;
        while (i<=100) {
            if (i%2 == 0) {
                sum = sum - (1/i);
            }else{
                sum = sum + (1/i);
            }
            i++;
        }
        System.out.println("the sum of : "+sum);    // 0.688172179310195
    }

    //(1/1*2)+(1/2*3)+(1/3*4)+(1/4*5)+(1/5*6)+(1/6*7)+.......+(1/99*100)
    public static void programL(){
        double i = 1;
        double j = 2;
        double sum = 0;
        while (i<100) {
                sum = sum + (1/i*j);
            i++;
            j++;
        }
        System.out.println("the sum of : "+sum);    // 104.17737751763967
    }

    //take user input and print factorial of the number.
    public static void program8(int n){
        long sum = 1;
        while (n>1) {
            sum = sum * n;
            n--;
        }
        System.out.println("factorial of : "+sum);    // factoraial of 7 is : 5040
    }

    //take 2 number from user and print power of the number. 
    public static void program9(int n,int j){
        int sum = 1;
        while (j>=1) {
            sum *= n;
            j--;
        }
        System.out.println("power of : "+sum);    // power of 7^3 is : 343
    }

    //take user input and genrate that many terms of fibonacci series.
    public static void program10(int n){
        int i = 0;
        int j = 1;

        System.out.println("fibonacci series :");
        int index =1;
       while(index<=n){
            if (index == 1) {
                System.out.print(i+" ");
            }else if (index == 2) {
                System.out.print(j+" ");
    
            }else{
                int res=i+j;
                System.out.print(res+" ");
        
                i=j;
                j=res;
            }
        index++;
       }
           
    }

    public static void main(Strings[] args) {
        // program1(1);
        // program2(45);
        // program3();
        // program4();
        // program5(28);
        // program6(54);
        // program7(24);
        // programA();
        // programB();
        // programC();
        // programD();
        // programE();
        // programF();
        // programG();
        // programH();
        // programI();
        // programZ();
        // programJ();
        // programK();
        // programL();
        // program8(7);
        // program9(7,3);
        // program10(10);
        
    }
}
