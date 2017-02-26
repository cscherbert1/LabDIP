package dip.lab3.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class ConsoleMessageOutput implements MessageOutput {
    
    @Override
    public void outputMessage(String message){            
        System.out.println(message);
    }

    
}
