import java.io.File;

public class File1 {

    public static void main(String[] args) {
        
        File f1 = new File("H:\\Qspider\\Java\\File Handling\\abc.txt"); 

        try {
            f1.createNewFile();
            System.out.println("file is created");
            
        } catch (Exception e) {
            System.out.println("file is not created");
            System.out.println(e.getMessage());
        }

    }
}