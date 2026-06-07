int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display details
    void display() {
        String college = "ABC Engineering College"; // local variable
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
    }

    // Main method to test
    public static void main(String[] args) {
        Student s1 = new Student("Devi", 101);
        s1.display();
    }
}
