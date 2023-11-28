public class StudentSearch {

    public static class StudentNotFoundException extends Exception {
        public StudentNotFoundException(String message) {
            super(message);
        }
    }

    public static class Student {
        private String name;
        private double averageGrade;

        public Student(String name, double averageGrade) {
            this.name = name;
            this.averageGrade = averageGrade;
        }

        public String getName() {
            return name;
        }

        public double getAverageGrade() {
            return averageGrade;
        }
    }

    public static Student findStudent(Student[] students, String nameToFind) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equals(nameToFind)) {
                return student;
            }
        }

        throw new StudentNotFoundException("Студент " + nameToFind + " не найден");
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", 4.5),
                new Student("Мария", 3.8),
                new Student("Вадим", 4.2),
                new Student("Екатерина", 3.9)
        };

        try {
            String nameToFind = "Мария";
            Student foundStudent = findStudent(students, nameToFind);
            System.out.println("Студент " + nameToFind + " найден. Средний балл: " + foundStudent.getAverageGrade());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            String nameToFind = "Андрей";
            Student foundStudent = findStudent(students, nameToFind);
            System.out.println("Студент " + nameToFind + " найден. Средний балл: " + foundStudent.getAverageGrade());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
