
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Check me!");
        
        // Create a button to display the checkbox state
        JButton button = new JButton("Show State");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Checkbox is checked!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Checkbox is unchecked!");
                }
            }
        });
        
        // Add components to the frame
        JPanel panel = new JPanel();
        panel.add(checkBox);
        panel.add(button);
        frame.add(panel);
        
        // Set frame visibility
        frame.setVisible(true);
    }
}