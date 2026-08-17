public class AuthCheck {
    public static void main(String[] args) {
        String UserName = "admin";
        String password = "java123";
        if(UserName == "admin" && password == "java123")
        {
            System.out.println("Login Successful!");
        }
        else
        {
            System.out.println("Access Denied!");
        }
    }
}
