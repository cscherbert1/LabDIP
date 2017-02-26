package dip.lab3.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class ConsoleMessageOutput {
    private String message;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
        public void outputMessage(){
            
        System.out.println(getMessage());
    }

    
}
