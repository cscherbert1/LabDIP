package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author cscherbert1
 */
public class KeyboardMessageInput implements MessageInput, ReportService {
    private String report = "";

    @Override
    public final String readMessage(){
        addData("Enter text using the keyboard, then hit enter.");
        outputReport();
        clearReport();
        
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    @Override
    public final void addData(String data) {
        report += data;
    }

    @Override
    public final void clearReport() {
        report = "";
    }

    @Override
    public final void outputReport() {
        System.out.println(report);
    }
    
}
