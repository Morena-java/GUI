import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton();
        JPasswordField passwordField = new JPasswordField();


        label.setVisible(true);
        label.setBounds(20, 100, 200, 35);
        label.setSize(25, 35);


        frame.setVisible(true);
        frame.setBounds(20, 100, 200, 30);
        frame.setSize(20, 30);

        panel.setSize(20, 30);
        panel.setVisible(true);


    }
}