package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author cscherbert1
 */
public class KeyboardMessageInput {

    public String readMessage(){
        System.out.println("Enter text using the keyboard, then hit enter.");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextLine();
    }
    
}
