
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your size : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%3d",i);
			}
			System.out.println();
		}
		sc.close();
	}

}

//when we use print
//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 

//when we use printf_ ("%3d"=>it is occupied 3 position)
//1  1  1  1  1  1  1  1  1  1  1  1  1  1  1
//2  2  2  2  2  2  2  2  2  2  2  2  2  2  2
//3  3  3  3  3  3  3  3  3  3  3  3  3  3  3
//4  4  4  4  4  4  4  4  4  4  4  4  4  4  4
//5  5  5  5  5  5  5  5  5  5  5  5  5  5  5
//6  6  6  6  6  6  6  6  6  6  6  6  6  6  6
//7  7  7  7  7  7  7  7  7  7  7  7  7  7  7
//8  8  8  8  8  8  8  8  8  8  8  8  8  8  8
//9  9  9  9  9  9  9  9  9  9  9  9  9  9  9
//10 10 10 10 10 10 10 10 10 10 10 10 10 10 10
//11 11 11 11 11 11 11 11 11 11 11 11 11 11 11
//12 12 12 12 12 12 12 12 12 12 12 12 12 12 12
//13 13 13 13 13 13 13 13 13 13 13 13 13 13 13
//14 14 14 14 14 14 14 14 14 14 14 14 14 14 14
//15 15 15 15 15 15 15 15 15 15 15 15 15 15 15
