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
    
    public final void copyMessage(){
        String message = input.readMessage();
        output.outputMessage(message);
    }

    public final MessageInput getInput() {
        return input;
    }

    public final void setInput(MessageInput input) {
        this.input = input;
    }

    public final MessageOutput getOutput() {
        return output;
    }

    public final void setOutput(MessageOutput output) {
        this.output = output;
    }
    
    
    
}
