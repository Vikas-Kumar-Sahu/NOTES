import java.io.FileWriter;
import java.io.IOException;

public class File5 {

    public static void main(String[] args) throws IOException  {
		System.out.println("Main starts");
		FileWriter fw=null;
		try {
			fw=new FileWriter("H:\\Qspider\\Java\\File Handling\\p1.java");
			fw.write(65);
			fw.write(100000);
			fw.write(66);
			fw.write(50);
			fw.write('p');
			fw.write("\n");
			char[] c= {'x','y','z'};
			fw.write(c);
			char[] d= {'p','q','r','s','t','u','v'};
			fw.write(d, 2, 3);
			String s1="mohan";
			fw.write(s1);
			fw.write(s1, 1, 2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			fw.close();
		}
    }
}