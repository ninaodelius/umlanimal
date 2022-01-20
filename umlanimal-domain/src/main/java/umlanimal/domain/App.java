package umlanimal.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //List<Squirrel> squirrels = createSquirrels();

        Owl pigwidgeon = new Owl(true, 10, 10);
        Squirrel piff = new Squirrel(2, true);
        PineTree ent = new PineTree(10, true, 10, 10, createSquirrels());
        Mouse squeek = null;

        /*System.out.println(piff.eat(true, 11));*/
        pigwidgeon.eat(true, ent);
        /*System.out.println(ent.fall(11, true, 20));*/
        /*pigwidgeon.eat(piff);
        piff.eat(pigwidgeon);*/
        /*System.out.println(pigwidgeon.toString());
        //below works automatically because I have a toString method
        System.out.println(pigwidgeon);
        System.out.println(squeek);
        System.out.println(piff.toString());*/
        //fixa tostring till alla

        /*try {
            System.out.println(squeek.eat(piff));
        } catch (NullPointerException e) {
            System.out.println("The cause of the exception: " + e.getCause());
            System.out.println("There is no Mouse, create one");
            System.out.println("squeek age: ");
            int age = scanner.nextInt();
            System.out.println("squeek is hungry(true/false): ");
            boolean hungry = scanner.nextBoolean();
            System.out.println("squeek running speed: ");
            int runningSpeed = scanner.nextInt();
            squeek = new Mouse(age, hungry, runningSpeed);
        }
        squeek.eat(piff);*/
    }

    public static List<Squirrel> createSquirrels(){
        return Arrays.asList(
                new Squirrel("Piff"),
                new Squirrel("Puff"),
                new Squirrel("Paff"),
                new Squirrel("Pyff"),
                new Squirrel("Paff"),
                new Squirrel("Piff"),
                new Squirrel("Puff"),
                new Squirrel("Paff"),
                new Squirrel("Pyff"),
                new Squirrel("Paff")
        );

    }
}
