public class Task4 {
	
    public static void main(String[] args) {
        int maximumNumber = 0;
        int lastIndex = 0;
        int nod = 0;
        int nok = 0;
        CheckInput input = new CheckInput();
        System.out.print ("Insert first number : ");
        int firstNumber = input.GetInt();
        System.out.print ("Insert second number : ");
        int secondNumber = input.GetInt();
        if (firstNumber > secondNumber) {maximumNumber = firstNumber;} else {maximumNumber = secondNumber;}
        int[] nodList = new int [maximumNumber];
        if (firstNumber > secondNumber) {nodList[0] = firstNumber; nodList[1] = secondNumber;}
        else {nodList[0] = secondNumber; nodList[1] = firstNumber;}
        for (int i = 2; i <= maximumNumber; i++)
        {
        	if (nodList[i-1] != 0)
        	{
        		nodList[i] = nodList[i-2] % nodList[i-1];
        	}
        	else 
        	{
        		lastIndex = i-2;break;
        	}
        }
        nod = nodList[lastIndex];
        nok = firstNumber*secondNumber/nod;
        System.out.println("Greatest common divisor (NOD) " + firstNumber + " and " + secondNumber + " - " + nod );
        System.out.println("Least common multiple (NOK) " + firstNumber + " and " + secondNumber + " - " + nok );
    }
}
