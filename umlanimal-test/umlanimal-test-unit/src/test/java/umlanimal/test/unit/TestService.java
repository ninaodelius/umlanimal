package umlanimal.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import umlanimal.domain.Owl;
import umlanimal.service.ForestService;

public class TestService {

    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:umlanimal-service.xml");

    private ForestService forestService;

    @Before
    public void Before(){
        forestService = (ForestService) applicationContext.getBean("forestService");
    }

    @Test
    public void testForestServiceDependencyInjection(){
        Owl owl = forestService.createOwl(95);
        Assert.assertNotNull(owl);
    }
}
