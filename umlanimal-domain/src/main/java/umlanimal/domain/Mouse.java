package umlanimal.domain;
public class Mouse extends Animal{
    private int age;
    private boolean hungry;
    private int runningSpeed;

    public Mouse(int age, boolean hungry, int runningSpeed) {
        this.age = age;
        this.hungry = hungry;
        this.runningSpeed = runningSpeed;
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
        this.hungry = hungry;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "age=" + age +
                ", hungry=" + hungry +
                ", runningSpeed=" + runningSpeed +
                '}';
    }

    @Override
    public boolean eat(Object food) {
        System.out.println("funkar för mouse");
        return false;
    }
}
