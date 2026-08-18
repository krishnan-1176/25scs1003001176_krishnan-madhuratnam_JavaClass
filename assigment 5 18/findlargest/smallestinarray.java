

public class smallestinarray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }   
}
