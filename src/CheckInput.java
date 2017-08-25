import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInput {

    public static int GetInt ()
    {
        Scanner in = new Scanner(System.in);
        String s = null;
        Pattern p = Pattern.compile("^\\d+$");
        Matcher m = null;
        int n = 0;
        do
        {
            System.out.println("Please insert integer number");
            s = in.nextLine();
            m = p.matcher(s);
        } while(!m.matches());
        n = Integer.parseInt(s);
        return (n);
    }

    public static float GetFloat ()
    {
        Scanner in = new Scanner(System.in);
        String s = null;
        Pattern p = Pattern.compile("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$");
        Matcher m = null;
        float n = 0;
        do
        {
            System.out.println("Please insert number");
            s = in.nextLine();
            m = p.matcher(s);
        } while(!m.matches());
        n = Float.parseFloat(s);
        return (n);
    }
}
