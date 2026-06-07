// 1. Student Class
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        String college = "ABC Engineering College"; // local variable
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Raj", 101);
        s1.display();
    }
}

// 2. Employee Salary
class Employee {
    int basicSalary;

    Employee(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        int bonus = 5000; // local variable
        int totalSalary = basicSalary + bonus;
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(30000);
        e1.calculateSalary();
    }
}

// 3. Rectangle Area
class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void findArea() {
        int area = length * breadth; // local variable
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        r1.findArea();
    }
}

// 4. Bank Account
class BankAccount {
    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void deposit() {
        int depositAmount = 2000; // local variable
        balance += depositAmount;
        System.out.println("Current Balance: " + (balance - depositAmount));
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10000);
        b1.deposit();
    }
}

// 5. Circle Area
class Circle {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double pi = 3.14; // local variable
        double area = pi * radius * radius;
        System.out.println("Radius = " + radius);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        c1.calculateArea();
    }
}
