package umanimal.dao;

import umlanimal.domain.Owl;
import umlanimal.domain.PineTree;
import umlanimal.domain.Squirrel;

public interface ForestDao {

    public Owl createOwl(int wingSpan);

    public Squirrel createSquirrel(int numOfConesInNest, boolean hungry);

    public PineTree createPineTree(int age, boolean windy, int numOfAnimalsInTree, int numOfCones);

}
