import java.util.Scanner;
public class Task5 {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int halfWordLength = 0;
        boolean isPalindrome = true;
        System.out.println("Please, insert word");
        String input = in.nextLine();
        String inputWord = input.toLowerCase ();
        int wordLength = inputWord.length();
        if (wordLength % 2 == 0) {halfWordLength = wordLength / 2;}
        else {halfWordLength = (wordLength - 1) / 2;}
        for (int i = 0; i <= halfWordLength; i++)
        {
        	if ( inputWord.substring(i,i+1).equals(inputWord.substring(wordLength -1 -i,wordLength -i)))
        	{isPalindrome = true;}
        	else {isPalindrome = false; break;};
        }
        if (isPalindrome) {System.out.println("Palindrome");}
        else {System.out.println("Not Palindrome");}
    }
}

