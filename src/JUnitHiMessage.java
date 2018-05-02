
public class JUnitHiMessage {             

    private String message;                 

    public JUnitHiMessage(String message) {                   
        this.message = message;                         
    }       
            
    public String printMessage(){       
            
        System.out.println(message);                    
            
        return message;                 
    }           
            
    public String printHiMessage(){     
                
        message="Hi!"+ message;                         
                
        System.out.println(message);                    
                
        return message;                 
    }

}