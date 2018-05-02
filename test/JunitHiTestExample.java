
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;      

public class JunitHiTestExample {             

    public String message = "Guru99";                           

    JUnitHiMessage junitMessage = new JUnitHiMessage(message);                          

    @Test
    @Ignore
    public void testJUnitMessage() {                    

        System.out.println("Junit Message is printing");                    
        assertEquals(message, junitMessage.printMessage());                 

    }       

    @Test       
    public void testJUnitHiMessage() {                  
        message="Hi!" +message;                         
        System.out.println("Junit Hi Message is printing ");                    
        assertEquals(message, junitMessage.printHiMessage());                   

    }       
}       