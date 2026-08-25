//create an employee class with id,name,salary,department,use a prameterized constructor and display () method.
public class employee {
    int id;
    String name;
    double salary;
    String department;

    public employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }

    public static void main(String[] args) {
        employee emp1 = new employee(101, "John Doe", 50000.0, "HR");
        employee emp2 = new employee(102, "Jane Smith", 60000.0, "Finance");
        
        emp1.display();
        emp2.display();
    }
}
