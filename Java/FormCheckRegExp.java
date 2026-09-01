import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class FormCheckRegExp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Pattern pname = Pattern.compile("^[A-Z][A-Za-z ]*$");
        Pattern pemail = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        Pattern pnum = Pattern.compile("\\b[0-9]{10}\\b");

        System.out.print("Enter Your name : ");
        String name = s.nextLine();

        System.out.print("\nEnter your email : ");
        String email = s.nextLine();

        System.out.print("\nEnter your Phone number : ");
        String phno = s.nextLine();


        Matcher mname = pname.matcher(name);
        Matcher memail = pemail.matcher(email);
        Matcher mnum = pnum.matcher(phno);


        System.out.println("\nValidity Status");
        if(mname.find())
        {
            System.out.println("Valid name");
        }
        else
        {
            System.out.println("Invalid name");
        }

         if(memail.find())
        {
            System.out.println("Valid email");
        }
        else
        {
            System.out.println("Invalid email");
        }

         if(mnum.find())
        {
            System.out.println("Valid num");
        }
        else
        {
            System.out.println("Invalid num");
        }

        s.close();



    }
}
