import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// for(int i =1;i<=5;i++) {
		// 	for(int j=1;j<=5;j++) {
		// System.out.print("* ");
		// }
		// 	System.out.println();
		// }
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

		int star = n;
		int space = 0;
		int mid = n/2+1;

		for(int i=1;i<=n;i++){
			for(int j=1;j<=space;j++)
				System.out.print("  ");
			for(int j=1;j<=star;j++)
				System.out.print("* ");
			if (i<mid) {
				star-=2;
				space++;
			} else {
				star+=2;
				space--;
			}
			System.out.println();
		}
		sc.close();
	}

}
