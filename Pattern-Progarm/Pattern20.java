import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n;
		int star = 1;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print(j);
			}
			space--; 
			star++;
			
			System.out.println();
		}
		sc.close();
	}

}

//      1
//     12
//    123
//   1234
//  12345
// 123456