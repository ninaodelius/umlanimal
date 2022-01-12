public class Owl extends Animal {
        boolean hungry;
        int numOfSquirrelInNest;
        int wingSpan;

        public Owl() {
            boolean hungry = true;
            int numOfSquirrelInNest;
            int wingSpan = 10;
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

