import java.io.File;
import java.io.IOException;

public class File4 {
    
    public static void main(String[] args) throws IOException {

		System.out.println("Main starts");
		File f1=new File("H:\\Qspider\\Java\\File Handling\\p1.java");
		File f2=new File("H:\\Qspider\\Java\\File Handling\\drive.java");
		try {
			f1.createNewFile();
			f2.createNewFile();
			System.out.println("FIle is created!!");
            // System.out.println(f1.length());
		}catch(Exception e) {
			System.out.println("File is NOT Created!");
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends!!");
	}
}
