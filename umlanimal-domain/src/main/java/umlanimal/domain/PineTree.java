package umlanimal.domain;
import java.util.List;
public class PineTree {
    private int age; //fält
    private boolean windy;
    private int numOfAnimalsInTree;
    private int numOfCones;
    private List<Squirrel> squirrels;
    private Owl pigwidgeon;

    //constructor below
    public PineTree(int age){
        this.age = age;
    }


    public PineTree(int age, boolean windy, int numOfAnimalsInTree, int numOfCones, List<Squirrel> squirrels){
        this.age = age;
        this.windy = windy;
        this.numOfAnimalsInTree = numOfAnimalsInTree;
        this.numOfCones = numOfCones;
        this.pigwidgeon = pigwidgeon;
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

    public List<Squirrel> getSquirrels() {
        return squirrels;
    }

    public int getNumOfSquirrelsInNest(){ return squirrels.size(); }

    public void setSquirrels(List<Squirrel> squirrels) {
        this.squirrels = squirrels;
    }

    public Owl getPigwidgeon(){
        return pigwidgeon;
    }

    public void setPigwidgeon(Owl pigwidgeon){
        this.pigwidgeon = pigwidgeon;
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

    static class PineCone{

    }
}
