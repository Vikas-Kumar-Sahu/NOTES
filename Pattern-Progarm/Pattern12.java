

import java.util.Scanner;

public class Pattern12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
	
		if(n%2==0) {
			System.out.println("Not Possible !!!");
			return;
		}
		int mid=n/2+1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==mid||j==mid||i==1&&j>mid||i>mid&&j==n||i==n&&j<mid||j==1&&i<mid)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();	
		}
		sc.close();
	}
}



// *           * * * * * * * 
// *           *             
// *           *             
// *           *             
// *           *             
// *           *             
// * * * * * * * * * * * * * 
//             *           * 
//             *           * 
//             *           * 
//             *           * 
//             *           * 
// * * * * * * *           * 
