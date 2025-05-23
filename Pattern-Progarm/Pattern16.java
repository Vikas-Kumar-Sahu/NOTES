import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int star = n;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			star--;
			System.out.println("  ");
		}
		
		sc.close();
	}

}


// * * * * * *   
// * * * * *   
// * * * *   
// * * *   
// * *   
// *   
