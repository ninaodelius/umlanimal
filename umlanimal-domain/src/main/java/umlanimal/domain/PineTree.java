package umlanimal.domain;
import java.util.Arrays;
import java.util.List;
public class PineTree {
    private int age; //fält
    private boolean windy;
    private int numOfAnimalsInTree;
    private int numOfCones;
    private List<String> squirrels;

    //constructor below
    public PineTree(int age, boolean windy, int numOfAnimalsInTree, int numOfCones){
        this.age = age;
        this.windy = windy;
        this.numOfAnimalsInTree = numOfAnimalsInTree;
        this.numOfCones = numOfCones;
        List<String> squirrels = Arrays.asList("piff","puff","babes");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWindy() {
        return windy;
    }

    public void setWindy(boolean windy) {
        this.windy = windy;
    }

    public int getNumOfAnimalsInTree() {
        return numOfAnimalsInTree;
    }

    public void setNumOfAnimalsInTree(int numOfAnimalsInTree) {
        this.numOfAnimalsInTree = numOfAnimalsInTree;
    }

    public int getNumOfCones() {
        return numOfCones;
    }

    public void setNumOfCones(int numOfCones) {
        this.numOfCones = numOfCones;
    }

    public List<String> getSquirrels() {
        return squirrels;
    }

    public void setSquirrels(List<String> squirrels) {
        this.squirrels = squirrels;
    }

    public int getNumOfSquirrelsInNest(){
        return squirrels.size();
    }

    /*public String team(List){
        for (int squirrel: squirrel){
            System.out.println("squirrel");
        }
    }*/


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

    static class PineCone{

    }
}
