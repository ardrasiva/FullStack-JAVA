import java.util.Scanner;
public class ValidationSystem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the User name code : ");
        char userNameCode = s.next().charAt(0);
        System.out.print("\nEnter the Password : ");
        int password = s.nextInt();
        System.out.print("\nEnter the Role ID : ");
        int roleID = s.nextInt();
        if(userNameCode == 'A' && password == 1234 && roleID == 1)
        {
            System.out.println("Welcome Admin. Full access granted.");
        }
        else if(userNameCode == 'S' && password == 1111 && roleID == 2)
        {
            System.out.println("Welcome Student. Limited access granted.");
        }
        else if(roleID == 3)
        {
            System.out.println("Welcome Guest. View-only access.");
        }
        else
        {
            System.out.println("Invalid credentials or role." );
        }
        s.close();
    }
}
