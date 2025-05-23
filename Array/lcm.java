import java.util.Scanner;

public class lcm {

    public static int getLcm(int a,int b){
        int big = a>b?a:b;
        int small = a<b?a:b;

        for(int i=big; ; i=i+big){
            if(i%small==0)
                return i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = getLcm(a, b);
        System.out.println(res);
        sc.close();
    }
    
}