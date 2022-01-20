package umlanimal.test.unit;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

    ApplicationContext applicationContext= new ClassPathXmlApplicationContext("classpath:umlanimal-service.xml");

    @Before
    public void Before(){
        applicationContext.getBean("forestService");
    }
}
