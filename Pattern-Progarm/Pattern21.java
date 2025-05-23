import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n;
		int star = 1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print("* ");
			}
			star=star+2;
			space--;
			System.out.println();
		}
		sc.close();
	}

}

//  		*       
//  	  * * *     
// 	    * * * * *   
//    * * * * * * * 
// 	* * * * * * * * * 


