package inheritance;

import java.sql.SQLOutput;

public class Main {
    public static void main(String []args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant=new Plant();

       System.out.println(dog.isALive);
       System.out.println(cat.isALive);

        System.out.println(dog.lives);
        System.out.println(cat.lives);
        dog.speak();
        cat.speak();
        System.out.println(plant);
        plant.photosynthesize();
    }
}
