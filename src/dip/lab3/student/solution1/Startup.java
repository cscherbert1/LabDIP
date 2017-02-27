package dip.lab3.student.solution1;

/**
 *To demonstrate polymorphism, experiment with the different ways to input and output a message using comments. 
 * You can only have one input and one output uncommented at a time.
 * 
 * 
 * FIND REASON WHY KEYBOARD INPUT AND GUI OUTPUT DO NOT WORK TOGETHER!
 * 
 * @author cscherbert1
 */
public class Startup {

    public static void main(String[] args) {
        //inputs
        //MessageInput input = new RandomQuoteInput();        
        MessageInput input = new ConsoleMessageInput();

        
        //outputs
        //MessageOutput output = new ConsoleMessageOutput();
        MessageOutput output = new GUIMessageOutput();

        MessageProducingService copy = new MessageProducingService(input, output);
        copy.produceMessage();
        

    }

}
