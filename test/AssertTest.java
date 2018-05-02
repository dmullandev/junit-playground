import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AssertTest {
    
    @Before
    public void before() {
        System.out.println("Before");
    }
    
    @After
    public void after() {
        System.out.println("After, maybe cleanups");
    }
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Test
    public void test() {
        System.out.println("Testcase1");
        int x = 5;
        
        boolean condn = true;
        //gettin that green bar
        assertEquals(1,1);
        
        assertTrue(condn);
        
//        assertFalse(condn);
        
        assertNull(null);
        
        assertNotNull(x);
        
        int[] array = new int[2];
        int[] array2 = new int[2];
        array[0] = 5;
        array[1] = 10;
        
        array2[0] = 5;
        array2[1] = 10;
        
        
        assertArrayEquals(array, array2);
      // red bar
//        assertEquals(1,2);
    }

}
