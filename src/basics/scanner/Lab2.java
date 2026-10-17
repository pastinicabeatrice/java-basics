package basics.scanner;

import java.util.Scanner;

public class Lab2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your gpa? ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Are you a student? (true/false) ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" year old.");
        System.out.println("Your gpa is: "+gpa);
        if(isStudent){
            System.out.println("You are enrolled as a student!");
        }else{
            System.out.println("You aren't enrolled");
        }

        scanner.close();
    }
}
