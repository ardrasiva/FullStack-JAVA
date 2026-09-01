import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class FileEg {
    public static void main(String[] args) {
        File f = new File("assignment.txt");
        char[] op = new char[100];
        
        try {
            boolean flag = f.createNewFile();
            if(flag)
            {
                System.out.println("File Created Successfully.");
            }
            else{
                System.out.println("File already exists.");
            }
            FileWriter fw = new FileWriter("assignment.txt");
            FileReader fr = new FileReader("assignment.txt");
            fw.write("Java File Handling Practice");
            fw.close();
            System.out.println("File data written successfully.");
            fr.read(op);
            String s = new String(op);
            System.out.println("Data in the file : "+s);
            fr.close();

            f.delete();
            
            System.out.println("File Deleted Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
