import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExpEg {
    @SuppressWarnings("unchecked")
    public static void PatternMatchPhone(String message)
    {
        Pattern p = Pattern.compile("\\b[0-9]{10}\\b");
        Matcher m = p.matcher(message);
        boolean flag = false;
        while(m.find())
        {
            System.out.println("Phone number found : "+m.group());
            flag = true;
        }
        if(!flag)
        {
            System.out.println("No matches Found!");
        }

    }
    public static void main(String[] args) {
        String message = "Contact me at 9876543210 or call 9123456780 for more details.";
        PatternMatchPhone(message);
        
    }
}
