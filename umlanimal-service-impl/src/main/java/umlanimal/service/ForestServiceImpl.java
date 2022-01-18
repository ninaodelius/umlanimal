package umlanimal.service;

import umlanimal.domain.Owl;
import umlanimal.domain.PineTree;
import umlanimal.domain.Squirrel;

public class ForestServiceImpl implements ForestService {
    Owl owl;
    PineTree pinetree;
    Squirrel squirrel;

    @Override
    public Owl createOwl(int wingSpan) {
        Owl owl = new Owl(true, 10, 10, 10);
        return owl;
    }

    @Override
    public Squirrel createSquirrel(int numOfConesInNest, boolean hungry) {
        Squirrel squirrel = new Squirrel(10, hungry);
        return squirrel;
    }

    @Override
    public PineTree createPineTree(int age, boolean windy, int numOfAnimalsInTree, int numOfCones) {
        PineTree pinetree = new PineTree(10, true, 10, 10);
        return pinetree;
    }


}
