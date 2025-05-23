import java.io.FileWriter;
import java.io.IOException;

public class file2 {
    
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        String text = "Hii Buddy Kaisi ho Aap";
        int x = 5;

        try {
            fw = new FileWriter("H:\\Qspider\\Java\\File Handling\\abc.txt");
            System.out.println("File is Created");
            fw.write(text);
            fw.write("\n");
            fw.write(x);
            fw.write(45);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fw.close();
        }

    }
}
