package basics.lab;

public class Methods {
    public static void main(String[]args){
        String name="Beatrice";
        int age=23;

        happyBirthday(name, age);
        happyBirthday(name, age);
        happyBirthday(name, age);

        System.out.println(square(4));
        }
        static void happyBirthday(String name, int age){
            System.out.println("Happy Birthday to you!");
            System.out.printf("Hapyy Birtdhay dear %s!\n", name);
            System.out.printf("You are %d years old!\n", age);
            System.out.println("Happy Birthday to you!\n");
    }

        static double square(double number){
            return number *number;
    }
}
