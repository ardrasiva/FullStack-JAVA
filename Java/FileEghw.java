import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileEghw {
    public static void main(String[] args) {
        char[] message = new char[100];
        File f = new File("log.txt");
        try {
            boolean flag = f.createNewFile();
            if(flag)
            {
                System.out.println("File Created Successfully!");
            }
            else
            {
                System.out.println("File Already Exists");
            }
            FileWriter fw = new FileWriter("log.txt");
            FileReader fr = new FileReader("log.txt");
            fw.write("Book order placed at 2.30PM");
            fw.close();
            fr.read(message);
            String s = new String(message);
            System.out.println("Data in file is : "+s);
            fr.close();

            boolean delFlag = f.delete();
            if(delFlag)
            {
                System.out.println("File Deleted Succesfully!");
            }
            else
            {
                System.out.println("File cannot be deleted.");
            }



        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
