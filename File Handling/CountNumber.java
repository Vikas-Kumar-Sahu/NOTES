import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountNumber {
public static void main(String[] args) throws IOException {
		int count=0;
		try {
			FileInputStream fis=new FileInputStream("H:\\Qspider\\Java\\File Handling\\test.txt");
			System.out.println("File Is Found!");
			int x=fis.read();
			while(x!=-1) {
				if(x>=48 && x<=57)
					count++;
				x=fis.read();
			}
            fis.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		System.out.println("Total Numeric Characters are: "+count);
	}
}
