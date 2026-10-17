package basics.lab;

import java.util.Scanner;

public class lab5 {
    public static void main(String []args){
    int age;
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
    age=scanner.nextInt();

    if(age>=65){
            System.out.println("You are a senior!");
        }
    else if(age>=18){
        System.out.println("You are an adult!");
    }
    else if(age<0){
        System.out.println("You haven't been born yet!");
    }
    else if(age==0){
        System.out.println("You are a baby!");
    }
    else{
        System.out.println("You are a child!");
    }

    scanner.close();
    }
}
