package umlanimal.domain;
public abstract class Animal {
    protected int weight;
    protected boolean hungry;

    public Animal(int weight, boolean hungry){
        this.weight = weight;
        this.hungry = hungry;
    }

    public Animal(boolean hungry){
        this.hungry = hungry;
    }

    public abstract boolean eat(Object food);

}
