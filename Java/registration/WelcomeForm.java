package registration;
import java.util.Scanner;
public class WelcomeForm {
    public static void main(String[] args) {
        
    //s is the object created for scanner class 
    Scanner s = new Scanner(System.in);
    String name;
    int age;
    //user input for name
    System.out.print("Enter your name : ");
    //name is stored in name variable using nextLine() function
    name = s.nextLine();
    //user input for age
    System.out.print("Enter the Age : ");
    //age is stored in age variable using nextInt() function
    age = s.nextInt();
    //Printed as a welcome message
    System.out.println("HI "+name+"!\nYou are "+age+" years old!");
    //scanner object is closed
    s.close();    
}

}
