import java.util.Scanner;

public class hcf {
    public static int getHcf(int a,int b){
        int small = a<b?a:b;

        for(int i=small; ; i--){
            if(a%i==0 && b%i==0)
                return i;
        }
    }

    public static int getHCF(int a,int b){
        if(b==0)
            return a;
        else    
            return getHCF(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // int res = getHcf(a, b);
        int res = getHCF(a, b);
        System.out.println(res);
        sc.close();
    }
}
