

public class countfrequencyofanarrayelemnt {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 2};
        int target = 2;
        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                frequency++;
            }
        }

        System.out.println("The frequency of element " + target + " in the array is: " + frequency);
    }
    
}
