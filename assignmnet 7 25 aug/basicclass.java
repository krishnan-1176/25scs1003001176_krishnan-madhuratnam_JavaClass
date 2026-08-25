//basic class crete a student class with name, age,course,create one object and display teh values
public class basicclass {
    String name;
    int age;
    String course;

    public static void main(String[] args) {
        basicclass s1 = new basicclass();
        s1.name = "John";
        s1.age = 20;
        s1.course = "Computer Science";
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Course: " + s1.course);
    }
}
