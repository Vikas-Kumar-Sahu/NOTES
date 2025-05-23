import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File6 {

    public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String name=sc.nextLine();
		System.out.println("Enter the Age: ");
		int age=sc.nextInt();
		System.out.println("Enter the Weight: ");
		double weight=sc.nextDouble();
		FileWriter fw=null;
		try {
			fw=new FileWriter("H:\\Qspider\\Java\\File Handling\\p6.txt");
			fw.write("name is: "+name+"\n");
			fw.write("Age is: "+age+" Years");
			fw.write("\nWeight is: "+weight+" Kg");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
            sc.close();
		}
		System.out.println("Program Ends!!");
	}
}