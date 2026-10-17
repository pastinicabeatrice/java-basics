package basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("I like pizza!");
        System.out.println("It's really good!");
        System.out.println("Buy me pizza!");
        System.out.println();

        int age=30;
        int year = 2026;
        int quantity = 1;

        System.out.println(age);
        System.out.println(quantity);
        System.out.println("The year is "+year + ".");

        double price = 19;
        double gpa=3.5;
        double temperature=-12.5;

        System.out.println("$"+price);
        System.out.println(gpa);
        System.out.println(temperature);

        char grade = 'A';
        char symbol='!';
        System.out.println("The grade is "+grade + symbol);

        boolean isStudent=true;
        boolean forSale=false;
        boolean isOnline=true;

        System.out.println(isStudent);
        System.out.println(forSale);

        if (isStudent) {
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You aren't a student");
        }

        String name="Beatrice";
        String food = "pasta";
        String email="maria.popescu@example.com";
        System.out.println("Hello "+name);
        String car ="Mercedes";
        String color = "black";
        System.out.println("Your favourite food is "+food);
        System.out.println("Your email is: "+email+"!");
        System.out.println("You are "+age+" years old.");
        System.out.println("Your gpa is "+gpa);
        System.out.println("Your average letter grade is: "+grade+".");
        System.out.println("Your choice is a "+color+" "+year+" "+car);
        System.out.println("The price is: "+ "$" + price);

        if(forSale){
            System.out.println("There is a "+car+" for sale.");
        }
        else{
            System.out.println("There isn't a "+car+" for sale.");
        }
    }
}