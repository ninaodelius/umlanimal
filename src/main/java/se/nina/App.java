package se.nina;

public class App {
    public static void main(String[] args) {

        Squirrel piff = new Squirrel();
        Owl pigwidgeon = new Owl();
        PineTree ent = new PineTree();
        Mouse squeek = new Mouse(10,true,20);


        System.out.println(piff.eat(true,11));
        System.out.println(pigwidgeon.eat(true,15));
        System.out.println(ent.fall(11,true,20));

        pigwidgeon.eat(piff);
        piff.eat(pigwidgeon);

        System.out.println(pigwidgeon.toString());
        //below works automatically because I have a toString method
        System.out.println(pigwidgeon);

        System.out.println(squeek);

    }
}
