// Assignment 10 - Program 2
// Autoboxing: primitive value is converted into a Wrapper object
// Roll No: 25SCS1003001176
public class AutoboxingDemo {
    public static void main(String[] args) {
        int number = 100;
        double marks = 92.5;
        char grade = 'A';
        boolean passed = true;

        Integer numberObject = number;
        Double marksObject = marks;
        Character gradeObject = grade;
        Boolean passedObject = passed;

        System.out.println("Autoboxing Demonstration");
        System.out.println("------------------------");
        System.out.println("int      " + number + "   -> Integer   : " + numberObject);
        System.out.println("double   " + marks + " -> Double    : " + marksObject);
        System.out.println("char     " + grade + "     -> Character : " + gradeObject);
        System.out.println("boolean  " + passed + " -> Boolean   : " + passedObject);
    }
}
