package dip.lab3.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class Startup {

    public static void main(String[] args) {
        //inputs
        MessageInput input = new ArrayMessageInput();        
        //MessageInput input = new KeyboardMessageInput();
        
        //outputs
        MessageOutput output = new ConsoleMessageOutput();

        MessageCopyService copy = new MessageCopyService(input, output);
        copy.copyMessage();
        

    }

}
