package umlanimal.domain;

public class App {
    public static void main(String[] args) {

        Squirrel piff = new Squirrel(2,true);
        Owl pigwidgeon = new Owl(true,10,10,10);
        PineTree ent = new PineTree(10,true,10,10);
        Mouse squeek = new Mouse(10, true, 20);


        System.out.println(piff.eat(true, 11));
        System.out.println(pigwidgeon.eat(true, 15));
        System.out.println(ent.fall(11, true, 20));

        pigwidgeon.eat(piff);
        piff.eat(pigwidgeon);

        System.out.println(pigwidgeon.toString());
        //below works automatically because I have a toString method
        System.out.println(pigwidgeon);
        System.out.println(squeek);
        System.out.println(piff.toString());

        //fixa tostring till alla

    }
}
