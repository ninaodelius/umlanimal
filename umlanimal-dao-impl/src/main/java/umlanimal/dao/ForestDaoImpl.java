package umlanimal.dao;

import umanimal.dao.ForestDao;
import umlanimal.domain.Owl;
import umlanimal.domain.PineTree;
import umlanimal.domain.Squirrel;

import java.sql.*;

public class ForestDaoImpl implements ForestDao {

    Connection connection = null;
    PreparedStatement preparedstatement = null;

    @Override
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/Databashantering", "root", "root");
    }


    @Override
    public Owl createOwl(int wingSpan) {
        return null;
    }

    @Override
    public Squirrel createSquirrel(int numOfConesInNest, boolean hungry) {
        return null;
    }

    @Override
    public PineTree createPineTree(int age, boolean windy, int numOfAnimalsInTree, int numOfCones) {
        return null;
    }
}