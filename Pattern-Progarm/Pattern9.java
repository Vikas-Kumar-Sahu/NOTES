

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==2||j==2||i==n||j==n||i==n-1||j==n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}

}

// * * * * * * * * 
// * * * * * * * * 
// * *         * * 
// * *         * * 
// * *         * * 
// * *         * * 
// * * * * * * * * 
// * * * * * * * * 
