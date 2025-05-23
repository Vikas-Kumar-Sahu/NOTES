import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n;
		
//		for(int i=1; i<=n; i++) {
//			
//			for(int j=1; j<=space; j++) {
//				System.out.print(i%2+" ");
//			}
//			space--;
//			
//			System.out.println("  ");
//		}
		
		// 1 1 1 1 1   
		// 0 0 0 0   
		// 1 1 1   
		// 0 0 
		// 1   
		
			for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(j%2+" ");
			}
			space--;
			
			System.out.println("  ");
		}
		
		sc.close();
	}

}

// 1 0 1 0 1   
// 1 0 1 0   
// 1 0 1   
// 1 0   
// 1   


