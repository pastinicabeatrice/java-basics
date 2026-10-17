package basics.lab;

public class Lab10 {
    public static void main(String []args){
        String name="Beatrice";
        char firstLetter='B';
        int age=23;
        double height=78.5;
        boolean isEmployed=false;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %C\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Empolyed: %b\n", isEmployed);

        System.out.printf("%s is %d years old.\n", name, age);

        double price1=9.99;
        double price2=100.15;
        double price3=-54.01;

        System.out.printf("%f\n", price1);
        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.3f\n", price1);

        System.out.printf("%.2f\n", price2);

        System.out.printf("%+.2f\n", price2);

        System.out.printf("%.2f\n", price3);
    }
}
