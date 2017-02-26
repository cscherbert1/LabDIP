package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author cscherbert1
 */
public class KeyboardMessageInput implements MessageInput, ReportService {
    private String report = "";

    @Override
    public String readMessage(){
        addData("Enter text using the keyboard, then hit enter.");
        outputReport();
        clearReport();
        
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }

    @Override
    public void addData(String data) {
        report += data;
    }

    @Override
    public void clearReport() {
        report = "";
    }

    @Override
    public void outputReport() {
        System.out.println(report);
    }
    
}
