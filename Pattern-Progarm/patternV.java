import java.util.Scanner;

public class patternV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int end = 2*n-1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=end; j++)
                if (j == start || j == end) 
                    System.out.print("* ");
                else
                System.out.print("  ");
            start++;
            end--;
            System.out.println();
        }
        sc.close();
    }     
}

// *               * 
//   *           *
//     *       *
//       *   *
//         *
