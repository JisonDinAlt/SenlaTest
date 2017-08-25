public class Task2 {
	
    public static void main(String[] args) {
        CheckInput input = new CheckInput();
        int n = input.GetInt();
        int numbers[] = new int [n]; numbers[0] = 1; numbers [1] = 1; 
        System.out.println("0\n1\n1");
        for (int i=2; i <= n-1; i++)
        {
        	numbers [i] = numbers [i-1] + numbers [i-2]; 
        	System.out.println(numbers[i]);
        }
    }
}