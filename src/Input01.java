import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String userput = JOptionPane.showInputDialog("Enter");
        //Store the input as a String and print it.
        System.out.println(userput);
        
        
        //Parse the input as an int.
        int parsed = Integer.parseInt(userput);
        //Print its value +1
        System.out.println(parsed + 1);
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
      int num = Integer.parseInt(JOptionPane.showInputDialog("Enter Dialog"));
        //You should have only one semicolon (;) in this line.
         System.out.println(num);
        
    }
}
