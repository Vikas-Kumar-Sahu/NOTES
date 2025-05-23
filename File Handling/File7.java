import java.io.File;
import java.io.IOException;

public class File7 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("H:\\Qspider\\Java\\File Handling\\test.txt");
        f1.createNewFile();
        System.out.println("File is created");
        
    }
}
