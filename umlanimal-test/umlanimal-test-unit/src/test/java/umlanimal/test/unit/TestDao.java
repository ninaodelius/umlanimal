package umlanimal.test.unit;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import umanimal.dao.ForestDao;

public class TestDao {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:umlanimal-dao.xml");

    @Test
    public void testGetBean(){
        ForestDao forestDao = (ForestDao)context.getBean("forestDao");
        Assert.assertNotNull(forestDao);
    }

}
