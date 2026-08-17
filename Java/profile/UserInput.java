package profile;

import java.util.Scanner;

public class UserInput {
    //Method to fetch name 
    public String NameFetch() {
        //scanner object is created
        Scanner s = new Scanner(System.in);
        //name is prompted to user and stored in name variable
        System.out.print("Enter Your Name : ");
        String name = s.nextLine();
        //scanner object is closed
        s.close();
        return name;
    }
    
}
