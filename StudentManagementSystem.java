import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    
    private List<Student> students = new ArrayList<>();

    // Create (Add) a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Read (View) all students
    public void viewStudents() {
        students.forEach(System.out::println);
    }

    // Update a student's details
    public void updateStudent(int id, String newName, String newSurname, int newAge, String newGrade) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setSurname(newSurname);
                student.setAge(newAge);
                student.setGrade(newGrade);
                break;
            }
        }
    }

    // Delete a student by ID
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    // Search for a student by name
    public Student searchStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null; // Return null if no student found
    }

    // Search for a student by surname
    public Student searchStudentBySurname(String surname) {
        for (Student student : students) {
            if (student.getSurname().equalsIgnoreCase(surname)) {
                return student;
            }
        }
        return null; // Return null if no student found
    }
}