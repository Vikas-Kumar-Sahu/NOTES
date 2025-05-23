

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print((j-1)%2+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

// 0 1 0 1 0 
// 0 1 0 1 0 
// 0 1 0 1 0 
// 0 1 0 1 0 
// 0 1 0 1 0 