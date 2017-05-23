import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by a.lebedjko on 2017.01.09..
 */
public class JavaSubstringTest {

    @Test
    public void test() throws IOException
    {
    String substringedOutput = JavaSubstring.getSubstringedOutput("Helloworld", 3, 7);
    Assert.assertEquals("lowo", substringedOutput);
    }


}
