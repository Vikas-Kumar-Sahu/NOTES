import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileObject implements java.io.Serializable {
    
    public int a;
    public String b;

    FileObject(int a,String b) {
        this.a = a;
        this.b = b;
    }
}

class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        FileObject fo = new FileObject(1,"Jack");
        String path = "H:\\Qspider\\Java\\File Handling\\serializable.txt";

        try {
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(fo);
            
            out.close();
            file.close();

            System.out.println("Serializable Done");
        } catch (Exception e) {
            e.printStackTrace();
        }

        FileObject fot = null;

        try {
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(file);

            fot = (FileObject)in.readObject();
            
            in.close();
            file.close();

            System.out.println("Deserializable Done");

            System.out.println(fot.a);
            System.out.println(fot.b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
