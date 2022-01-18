package se.nina;
public class Owl extends Animal {

    private boolean hungry;
    private int numOfSquirrelInNest;
    private int wingSpan;

    //constructor below
    public Owl() {
        boolean hungry = true;
        int numOfSquirrelInNest = 10;
        int wingSpan = 10;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getNumOfSquirrelInNest() {
        return numOfSquirrelInNest;
    }

    public void setNumOfSquirrelInNest(int numOfSquirrelInNest) {
        this.numOfSquirrelInNest = numOfSquirrelInNest;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String toString() {
        return "Is hungry: " + hungry + " Squirrels in nest: " + numOfSquirrelInNest + " Wingspan: " + wingSpan;
    }


   @Override
   public void eat(Object bean){
            System.out.println("funkar för owl");
        }

   public boolean eat(boolean hungry,int numOfSquirrelInNest){
        boolean eat = false;
        if (hungry) {
            if (numOfSquirrelInNest > 0 && numOfSquirrelInNest < 10) {
                System.out.println("Owl says nom nom nom");
                eat = true;
            }
            else if (numOfSquirrelInNest > 10) {
                System.out.println("Owl is overrun by squirrels!");
            } else {
                System.out.println("No food for owl today");
            }
        }
        if(!hungry){
            System.out.println("Owl is not hungry");
        }
        return eat;
    }
    }

