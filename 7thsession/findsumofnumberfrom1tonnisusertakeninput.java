/**
 * findsumofnumberfrom1tonnisusertakeninput
 */
public class findsumofnumberfrom1tonnisusertakeninput {

    public static void main(String[] args) {
        int n = 1000; // Example input, you can change this value to test with different inputs
        int sum = 0;

        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
    }
}