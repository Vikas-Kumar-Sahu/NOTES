import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int star = n;
		int space = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			star--;
			space++;
			System.out.println("  ");
		}
		
		sc.close();
	}

}



// * * * * * *   
//   * * * * *   
//     * * * *   
//       * * *   
//         * *   
//           *   
