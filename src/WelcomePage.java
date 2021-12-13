import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Welcome!");
    JLabel thankYou = new JLabel("Thank you for checking this out");

    WelcomePage(String userId) {

        welcomeLabel.setBounds(20, 100, 200, 35);
        welcomeLabel.setFont(new Font("Freestyle Script", Font.PLAIN, 35));
        welcomeLabel.setForeground(new Color(187, 0, 255));
        welcomeLabel.setText("Welcome, " + userId + "!");

        thankYou.setBounds(20, 160, 350, 35);
        thankYou.setFont(new Font("Freestyle Script", Font.PLAIN, 35));
        thankYou.setForeground(new Color(187, 0, 255));

        frame.add(welcomeLabel);
        frame.add(thankYou);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null); // to make the window appear in the middle
        frame.setVisible(true);
    }
}
