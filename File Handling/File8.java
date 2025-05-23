import java.io.FileWriter;
import java.io.IOException;

public class File8 {
    
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("H:\\Qspider\\Java\\File Handling\\test.txt");
        int x = 56;
        int y = 837;
        try {
            fw.write(new Integer(x).toString());
            fw.write(new Integer(y).toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fw.close();
        }
    }
}
