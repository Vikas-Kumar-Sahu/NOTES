import java.util.Scanner;

public class patternA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = n;
        int end = n;
        int mid = n/2+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=end; j++)
            if (j==start || j==end || i==mid&&j>start)
                System.out.print("*");
            else
                System.out.print(" ");
            start--;
            end++;
            System.out.println();
        }
        sc.close();
    }
}

//       *
//      * *
//     *   *
//    *******
//   *       *
//  *         *
// *           *