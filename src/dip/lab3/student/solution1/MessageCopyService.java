package dip.lab3.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class MessageCopyService {
    private MessageInput input;
    private MessageOutput output;
    
    public MessageCopyService(MessageInput input, MessageOutput output){
        setInput(input);
        setOutput(output);
    }
    
    public void copyMessage(){
        String message = input.readMessage();
        output.outputMessage(message);
    }

    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        this.input = input;
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }
    
    
    
}
