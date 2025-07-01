public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // Create new students
        sms.addStudent(new Student(1, "John", "Doe", 20, "A"));
        sms.addStudent(new Student(2, "Jane", "Smith", 22, "B"));
        sms.addStudent(new Student(3, "Alice", "Johnson", 19, "A+"));
        sms.addStudent(new Student(4, "Bob", "Brown", 21, "C"));
        sms.addStudent(new Student(5, "Charlie", "Davis", 23, "B+"));
        sms.addStudent(new Student(6, "Eve", "White", 20, "A-"));
        sms.addStudent(new Student(7, "Frank", "Black", 22, "B"));
        sms.addStudent(new Student(8, "Grace", "Green", 19, "A"));
        sms.addStudent(new Student(9, "Hank", "Blue", 21, "C+"));
        sms.addStudent(new Student(10, "Ivy", "Red", 23, "B"));

        
        // Read and display students
        System.out.println("Student List:");
        sms.viewStudents();

        // Update student's details
        sms.updateStudent(1, "John", "Doe", 21, "A+");
        System.out.println("\nAfter updating John's details:");
        sms.viewStudents();

        // Search for a student by name
        System.out.println("\nSearching for student named 'Alice':");
        Student foundStudent = sms.searchStudentByName("Alice");
        System.out.println(foundStudent != null ? foundStudent : "Student not found");

        // Delete a student 
        sms.deleteStudent(2);
        System.out.println("\nAfter deleting Jane's record:");
        sms.viewStudents();

    }
}
