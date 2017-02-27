package dip.lab3.student.solution1;

/**
 *
 * @author cscherbert1
 */
public class MessageProducingService {
    private MessageInput input;
    private MessageOutput output;
    
    public MessageProducingService(MessageInput input, MessageOutput output){
        setInput(input);
        setOutput(output);
    }
    
    public final void produceMessage(){
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
