
public class JUnitMessage {
    private String message;
    
    public JUnitMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void printMessage() {
        int x = 5;
        
        int p;
        
        p = x / 0;
    }
    
    public String printHiMessage() {
        return "Hi!" + message;
    }
}
