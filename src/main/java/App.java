public class App {
    public static void main(String[] args) {

        Squirrel squirrel1 = new Squirrel();
        Owl owl1 = new Owl();
        PineTree pinetree1 = new PineTree();


        System.out.println(squirrel1.eat(true,11));
        System.out.println(owl1.eat(true,15));
        System.out.println(pinetree1.fall(11,true,20));

        owl1.eat(squirrel1);
        squirrel1.eat(owl1);


    }
}
