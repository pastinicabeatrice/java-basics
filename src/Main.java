public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Maria Popescu", 21, 3.2);
        Student student2 = new Student("Andrei Ionescu", 23, 3.5);
        Student[] studenti = { student1, student2 };
        for (Student s : studenti) {
            System.out.printf("Student: %s, %d ani, medie %.1f, inscris: %b%n", s.name, s.age, s.gpa, s.isEnroled);
        }

        User user1 = new User("maria.popescu");
        User user2 = new User("andrei.ionescu", "andrei.ionescu@example.com");
        for (User u : new User[] { user1, user2 }) {
            System.out.println("Utilizator: " + u.username + ", email: " + u.email);
        }
    }
}
