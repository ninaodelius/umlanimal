package umlanimal.test.unit;

import org.junit.Assert;
import org.junit.Test;
import umlanimal.domain.Owl;

public class TestOwl {

    @Test
    public void owlConstructorTest(){
        Owl owl = new Owl(true,10,10);
        Assert.assertEquals(10, owl.getWingSpan());
        /*Assert.assertNotEquals(-10, owl.getWingSpan());*/
    }

}
