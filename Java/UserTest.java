abstract class User{
    public abstract void showMessage();
    public void displayUserType(){
        System.out.println("User type selected.\n");
    }
}

class AdminUser extends User{
    public void showMessage(){
        System.out.println("Welcome, Admin!\n");
    }
}
class GuestUser extends User{
    public void showMessage(){
        System.out.println("Welcome, Guest!\n");
    }
}

public class UserTest {
    public static void main(String[] args) {
        User ua = new AdminUser();
        User ug = new GuestUser();
        ua.displayUserType();
        ua.showMessage();
        ug.displayUserType();
        ug.showMessage();
    }
}
