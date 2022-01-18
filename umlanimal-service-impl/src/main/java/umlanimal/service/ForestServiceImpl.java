package umlanimal.service;
import umlanimal.domain.Owl;
import umlanimal.domain.PineTree;
import umlanimal.domain.Squirrel;

public class ForestServiceImpl {
    Owl owl;
    PineTree pinetree;
    Squirrel squirrel;

    public Owl createOwl(int wingSpan){
        Owl owl = new Owl(true,10,10,10);
        return owl;
    }
    public PineTree createPineTree(int age){
        PineTree pinetree = new PineTree(10,true,10,10);
        return pinetree;
    }
    public Squirrel createSquirrel(boolean hungry){
        Squirrel squirrel = new Squirrel(10,hungry);
        return squirrel;
    }

}
