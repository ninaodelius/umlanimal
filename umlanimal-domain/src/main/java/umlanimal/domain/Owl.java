package umlanimal.domain;
public class Owl extends Animal {

    private int wingSpan;
    private int age;

    //constructor below
    public Owl(boolean hungry, int wingSpan, int age) {
        super(hungry);
        this.hungry=hungry;
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

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        /*här kan man sätta en if sats*/
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Is hungry: " + hungry + " Wingspan: " + wingSpan;
    }

    @Override
    public boolean eat(Object bean) {
        System.out.println("funkar för owl");
        return false;

    }

    public boolean eat(boolean hungry, PineTree ent) {
        boolean eat = false;
        if (hungry) {
            if (ent.getNumOfSquirrelsInNest() > 0 && ent.getNumOfSquirrelsInNest() < 10) {
                System.out.println("Owl says nom nom nom");
                eat = true;
            } else if (ent.getNumOfSquirrelsInNest() > 10) {
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

