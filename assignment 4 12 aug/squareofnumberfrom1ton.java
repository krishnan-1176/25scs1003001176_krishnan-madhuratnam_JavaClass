public class squareofnumberfrom1ton {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The squares of numbers from 1 to " + n + " are:");
        
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " is: " + square);
        }
    }
}
