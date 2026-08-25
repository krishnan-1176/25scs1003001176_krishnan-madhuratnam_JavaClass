//constructor create: student(string name,int age,string courses)and initialize the object using the constructor.
public class constructor {
    String name;
    int age;
    String course;

    
    public constructor(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        
        constructor student = new constructor("David", 21, "Engineering");
        
        
        student.display();
    }
}
