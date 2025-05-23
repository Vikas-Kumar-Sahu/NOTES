import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(j+" ");
			}
			space--;
			System.out.println("  ");
		}
		
		sc.close();
	}

}

// 1 2 3 4 5 6   
// 1 2 3 4 5   
// 1 2 3 4   
// 1 2 3   
// 1 2   
// 1   
