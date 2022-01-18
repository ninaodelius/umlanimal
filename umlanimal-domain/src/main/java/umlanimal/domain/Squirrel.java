package umlanimal.domain;
public class Squirrel extends Animal {

    private int numOfConesInNest;
    private boolean hungry;

    //constructor below
    public Squirrel(int numOfConesInNest,boolean hungry) {
        super();
        this.numOfConesInNest = numOfConesInNest;
        this.hungry = hungry;
    }


    public int getNumOfConesInNest() {
        return numOfConesInNest;
    }

    public void setNumOfConesInNest(int numOfConesInNest) {
        this.numOfConesInNest = numOfConesInNest;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }


    @Override
    public void eat(Object cheese){
        System.out.println("funkar för squirrel");
    }

    public boolean eat(boolean hungry, int numOfConesInNest){
        boolean eat = false;
        if (hungry){
            if(numOfConesInNest==1){
                System.out.println("Squirrel is munching on a single little pinecone");
                eat = true;
            }else if(numOfConesInNest>1 && numOfConesInNest<=10){
                System.out.println("Squirrel is munching on some pinecones");
                eat=true;
            }else if(numOfConesInNest>=11){
                System.out.println("Squirrel will eat some pinecones and bring the rest to go");
                eat=true;
            }
        }
        if(!hungry){
            System.out.println("Squirrel is not feeling very hungry today");
        }
        return eat;
    }
}
