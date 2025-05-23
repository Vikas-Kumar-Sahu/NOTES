import java.io.FileInputStream;
import java.io.IOException;

public class File3 {
    
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("H:\\Qspider\\Java\\File Handling\\drive.java");
            System.out.println("File is created");

            int fr = fis.read();
            while (fr != -1) {
                System.out.println((char)fr);
                fr = fis.read();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("File is not created");
        } finally {
            fis.close();
        }
    }
}
