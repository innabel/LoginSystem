import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("userID:");
    JLabel userPasswordLabel = new JLabel("password:");
    JLabel messageLabel = new JLabel("Type in login + password");


    HashMap<String, String> loginMap = new HashMap<>();


    Login(HashMap<String, String> loginInfoOriginal) {

        loginMap = loginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);


        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font("Freestyle Script", Font.PLAIN, 35));

        userIDField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false); // removing the square around the title when focused
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);


        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // to make the window appear in the middle
        frame.setName("Login");
        frame.setFont(new Font("Freestyle Script", Font.PLAIN, 40));
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource() == loginButton) {

            String userId = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(loginMap.containsKey(userId)) {
                if(loginMap.get(userId).equals(password)) {
                    messageLabel.setForeground(new Color(19, 163, 0));
                    messageLabel.setText("Login successful");
                    WelcomePage welcomePage = new WelcomePage();
                } else {
                    messageLabel.setForeground(new Color(163, 0 ,109));
                    messageLabel.setText("Wrong login / password");
                }
            } else {
                messageLabel.setForeground(new Color(163, 0 ,109));
                messageLabel.setText("Wrong login / password");
            }


        }
    }
}
