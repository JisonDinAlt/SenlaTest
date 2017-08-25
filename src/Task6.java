import java.util.Scanner;
public class Task6 {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert text");
        String inputString = in.nextLine();
        String resultString = inputString.replaceAll("\\d","");
        System.out.println(resultString);
    }
}