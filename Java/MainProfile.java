import profile.UserInput;
import greeting.GreetingDisplay;
//both packages are imported using package.className
public class MainProfile {
    public static void main(String[] args) {
        //object for both package classes are created
        UserInput u = new UserInput();
        GreetingDisplay gd = new GreetingDisplay();
        //name is used for storing name that is fetched in userinput class 
        String name = u.NameFetch();
        //that returned name is displayed using  displaygreeting class
        gd.DisplayGreeting(name);
    }
    
}
