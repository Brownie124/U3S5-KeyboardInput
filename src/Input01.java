import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String put = JOptionPane.showInputDialog("lol");
        //Store the input as a String and print it.
        System.out.println(put);
        
        
        //Parse the input as an int.
        int parse = Integer.parseInt(put);
        //Print its value +1
        System.out.println("Parse + 1" + parse + 1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
      int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Dialog"));
        //You should have only one semicolon (;) in this line.
         System.out.println(num);
        
    }
}
