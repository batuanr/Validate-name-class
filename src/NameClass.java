import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private final String REGEX = "^[CAP][0-9]{4}[G-M]$";
    public boolean check(String regex){
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
