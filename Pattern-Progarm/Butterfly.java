import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
                if(j==1 || j==n || i==j || i+j==n+1 || i==mid || i>j&&i<mid || i<j&&i>mid || i>j&&i>mid&&i+j<n+1 || i<j&&i<mid&&i+j>n+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }
        sc.close();
    }
}

// *                           * 
// * *                       * *
// * * *                   * * *
// * * * *               * * * * 
// * * * * *           * * * * *
// * * * * * *       * * * * * *
// * * * * * * *   * * * * * * *
// * * * * * * * * * * * * * * *
// * * * * * * *   * * * * * * *
// * * * * * *       * * * * * *
// * * * * *           * * * * * 
// * * * *               * * * *
// * * *                   * * *
// * *                       * *
// *                           *