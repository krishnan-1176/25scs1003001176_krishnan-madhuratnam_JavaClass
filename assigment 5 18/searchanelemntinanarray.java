

public class searchanelemntinanarray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4};
        int target = 10;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + target + " is present in the array.");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }
    
}
