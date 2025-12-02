package oops_demo;

class Student {
	
    private String name;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNo
    public int getRollNo() {
        return rollNo;
    }

    // Setter for rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks with validation
    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        } else {
            this.marks = marks;
        }
    }
}

public class studentmarks {

    public static void main(String[] args) {
        
        // Create object of Student class
        Student s1 = new Student();

        // Set values
        s1.setName("Kalyane");
        s1.setRollNo(101);
        s1.setMarks(95);   // Valid
        s1.setMarks(150);  // Invalid (will show error message)

        // Print details
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Roll Number : " + s1.getRollNo());
        System.out.println("Marks       : " + s1.getMarks());
    }
}

