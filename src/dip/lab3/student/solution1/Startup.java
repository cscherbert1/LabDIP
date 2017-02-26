package dip.lab3.student.solution1;

/**
 *To demonstrate polymorphism, experiment with the different ways to input and output a message using comments. 
 * You can only have one input and one output uncommented at a time.
 * 
 * @author cscherbert1
 */
public class Startup {

    public static void main(String[] args) {
        //inputs
        MessageInput input = new ArrayMessageInput();        
        //MessageInput input = new KeyboardMessageInput();

        
        //outputs
        //MessageOutput output = new ConsoleMessageOutput();
        MessageOutput output = new GUIMessageOutput();

        MessageCopyService copy = new MessageCopyService(input, output);
        copy.copyMessage();
        

    }

}
