import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Title",
                2);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "What question do you have?",
                "Title",
                3,
                null,
                null,
                "Type here.");
        
        
        String[] acceptableValues = {"Black", "Blue", "Red"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Which one is your favorite color?",
                "Choose Color",
                1,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
