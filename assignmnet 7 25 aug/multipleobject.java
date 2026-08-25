//multiple objects  create threee students objects with differnt values
public class multipleobject {
    String name;
    int age;
    String course;

    public static void main(String[] args) {
        multipleobject s1 = new multipleobject();
        s1.name = "Alice";
        s1.age = 22;
        s1.course = "Mathematics";

        multipleobject s2 = new multipleobject();
        s2.name = "Bob";
        s2.age = 21;
        s2.course = "Physics";

        multipleobject s3 = new multipleobject();
        s3.name = "Charlie";
        s3.age = 23;
        s3.course = "Chemistry";

        System.out.println("Student 1: Name: " + s1.name + ", Age: " + s1.age + ", Course: " + s1.course);
        System.out.println("Student 2: Name: " + s2.name + ", Age: " + s2.age + ", Course: " + s2.course);
        System.out.println("Student 3: Name: " + s3.name + ", Age: " + s3.age + ", Course: " + s3.course);
    }
}


