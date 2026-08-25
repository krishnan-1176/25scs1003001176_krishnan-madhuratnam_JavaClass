public class method { 
    String name; 
    int age; 
    String course; 

    public void display() { 
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course); 
    } 

    // Add this main method to execute the code
    public static void main(String[] args) {
        // 1. Create an object of the class
        method student = new method(); 
        
        // 2. Assign values to the object's variables
        student.name = "Alex";
        student.age = 20;
        student.course = "Computer Science";
        
        // 3. Call the display method
        student.display(); 
    }
}
