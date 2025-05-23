import java.util.Scanner;

public class Butterflye {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int end = n;
        int mid = n/2+1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++)
                if (j<=start || j>=end)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            if (i<mid) {
                start++;
                end--;
            } else {
                start--;
                end++;
            }
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