import java.lang.String;

public class Task1 {

    public static void main(String[] args) {
        CheckInput input = new CheckInput();
        int n = input.GetInt();
        for (int i=1; i <= n; i++)
        {
        	int simpleNumbersCounter = 0;
        	for (int j = 1; j <= i; j++)
        	{
        		if ( i % j == 0){simpleNumbersCounter++;}
        	}
        	if (simpleNumbersCounter == 2) {System.out.println(i); }
        }
    }
}
