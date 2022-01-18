package umlanimal.domain;
public class Owl extends Animal {

    private boolean hungry;
    private int numOfSquirrelInNest;
    private int wingSpan;
    private int age;


    //constructor below
    public Owl(boolean hungry, int numOfSquirrelInNest, int wingSpan, int age) {
        super();
        this.hungry=hungry;
        this.numOfSquirrelInNest=numOfSquirrelInNest;
        this.wingSpan=wingSpan;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {

        /*här kan man sätta en if sats*/
        this.hungry = hungry;
    }

    public int getNumOfSquirrelInNest() {
        return numOfSquirrelInNest;
    }

    public void setNumOfSquirrelInNest(int numOfSquirrelInNest) {
        /*här kan man sätta en if sats*/
        this.numOfSquirrelInNest = numOfSquirrelInNest;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        /*här kan man sätta en if sats*/
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Is hungry: " + hungry + " Squirrels in nest: " + numOfSquirrelInNest + " Wingspan: " + wingSpan;
    }


    @Override
    public void eat(Object bean) {
        System.out.println("funkar för owl");
    }

    public boolean eat(boolean hungry, int numOfSquirrelInNest) {
        boolean eat = false;
        if (hungry) {
            if (numOfSquirrelInNest > 0 && numOfSquirrelInNest < 10) {
                System.out.println("Owl says nom nom nom");
                eat = true;
            } else if (numOfSquirrelInNest > 10) {
                System.out.println("Owl is overrun by squirrels!");
            } else {
                System.out.println("No food for owl today");
            }
        }
        if (!hungry) {
            System.out.println("Owl is not hungry");
        }
        return eat;
    }

}

