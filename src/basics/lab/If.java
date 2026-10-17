package basics.lab;

public class If {
    public static void main(String[] args) {
        String name = "Beatrice";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("e");

        name = name.toLowerCase();
        System.out.println(name);
        name= name.toUpperCase();
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        name= name.replace("E", "a");
        System.out.println(name);

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
    }
}