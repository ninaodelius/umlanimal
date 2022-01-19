package umlanimal.domain;
public class Squirrel extends Animal {

    private int numOfConesInNest;

    private String name;


    //constructor below
    public Squirrel(int numOfConesInNest,boolean hungry) {
        super(hungry);
        this.numOfConesInNest = numOfConesInNest;
        this.hungry = hungry;
    }

    public Squirrel(String name){
        super();
        this.name =name;}

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
    public boolean eat(Object cheese){
        /*if sats kan va här*/
        System.out.println("funkar för squirrel");
        return false;
    }

    public boolean eat(boolean hungry, int numOfConesInNest){
        boolean eat = false;
        if (hungry){
            if(numOfConesInNest==1){
                /*System.out.println("Squirrel is munching on a single little pinecone");*/
                eat = true;
            }else if(numOfConesInNest>1 && numOfConesInNest<=10){
                /*System.out.println("Squirrel is munching on some pinecones");*/
                eat=true;
            }else if(numOfConesInNest>=11){
                /*System.out.println("Squirrel will eat some pinecones and bring the rest to go");*/
                eat=true;
            }
        }
        if(!hungry){
            /*System.out.println("Squirrel is not feeling very hungry today");*/
        }
        return eat;
    }
}
