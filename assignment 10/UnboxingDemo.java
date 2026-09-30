// Assignment 10 - Program 3
// Unboxing: Wrapper object is converted into a primitive value
// Roll No: 25SCS1003001176
public class UnboxingDemo {
    public static void main(String[] args) {
        Integer numberObject = Integer.valueOf(250);
        Double priceObject = Double.valueOf(49.99);
        Character letterObject = Character.valueOf('M');
        Boolean statusObject = Boolean.valueOf(false);

        int number = numberObject;
        double price = priceObject;
        char letter = letterObject;
        boolean status = statusObject;

        System.out.println("Unboxing Demonstration");
        System.out.println("----------------------");
        System.out.println("Integer   " + numberObject + "   -> int     : " + number);
        System.out.println("Double    " + priceObject + " -> double  : " + price);
        System.out.println("Character " + letterObject + "     -> char    : " + letter);
        System.out.println("Boolean   " + statusObject + " -> boolean : " + status);
    }
}
