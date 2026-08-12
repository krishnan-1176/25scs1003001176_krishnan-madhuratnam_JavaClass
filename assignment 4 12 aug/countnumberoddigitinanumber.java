public class countnumberoddigitinanumber {
    public static void main(String[] args) {
        int number = 12345; 
        int count = 0;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                count++;
            }
            temp /= 10;
        }
        
        System.out.println("The number of odd digits in " + number + " is: " + count);
    }
}
