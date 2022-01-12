import java.util.List;

public class PineTree {
    int age;
    boolean windy;
    int numOfAnimalsInTree;
    int numOfCones;
    List<Squirrel> squirrels;

    public PineTree(){
        int age = 11;
        boolean windy = true;
        int numOfAnimalsInTree = 20;
        int numOfCones = 5;
    }
    public boolean fall(int age, boolean windy, int numOfAnimalsInTree){
        boolean fall = false;
        if (age>10 && windy) {
            System.out.println("Oh dear, tree falls over due to wind and old age");
            fall = true;
        }else if(age>10 && numOfAnimalsInTree>20){
            System.out.println("Too many animals in this old tree");
            fall = true;
        }else{
            System.out.println("The tree will stand");
        }
        return fall;
    }
}
