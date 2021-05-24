package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        HelloControll2 he = new HelloControll2();
        String expect = he.index();
        String actual = "Taro desu!";
        assertEquals(expect,actual);
    }
}
