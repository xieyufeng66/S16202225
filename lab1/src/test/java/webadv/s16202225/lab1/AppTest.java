package webadv.s16202225.lab1;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
public class AppTest {

  
    @Test
    public void testCorrect() throws FileNotFoundException, IOException {
    	App app=new App();
      /*  Assert.assertEquals(64, App.sha256hex(password).length());*/
        Assert.assertEquals(1,app.compare("abcd", "1234"));
    }
    
}
