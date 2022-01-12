public class Squirrel extends Animal{
        int numOfConesInNest;
    boolean hungry;

    public Squirrel() {
        int numOfConesInNest = 2;
        boolean hungry = true;
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
