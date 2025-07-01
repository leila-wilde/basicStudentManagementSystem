public class Student {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String grade;

    public Student(int id, String name, String surname, int age, String grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.grade = grade;
    }

        // Getters and setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Id: " + id + ", Name: " + name + ", Surname: " + surname + ", Age: " + age + ", Grade: " + grade;
        }
}