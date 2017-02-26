package dip.lab3.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class Startup {

    public static void main(String[] args) {
        
        MessageInput input = new KeyboardMessageInput();
        MessageOutput output = new ConsoleMessageOutput();

        MessageCopyService copy = new MessageCopyService(input, output);
        copy.copyMessage();
        
        System.out.println("Program ended. Your message was copied successfully.");
    }

}
