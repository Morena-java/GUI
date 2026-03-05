import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        JLabel label = new JLabel("UserName");
        panel.add(label);

        JTextField userText = new JTextField(17);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        frame.setVisible(true);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(17);
        passwordText.setBounds(100, 50, 165, 25);
        frame.setVisible(true);
        panel.add(passwordText);
        frame.setVisible(true);

        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);

        panel.add(button);
        frame.setVisible(true);
        JLabel success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        

    }
}