package basics.ex;

import java.util.Scanner;

public class MathEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double circumference;
        double area;
        double volume;
        double radius;

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.printf("The circumference is: %.1f cm%n", circumference);

        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area is: %.1f cm²%n", area);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume is: %.1f cm³%n", volume);

        scanner.close();
    }
}