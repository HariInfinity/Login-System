package LoginSystem;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignUp extends JFrame {

    public SignUp() {

        JButton bLogin, bSignUp;

        setSize(500, 500);
        setVisible(true);
        setLayout(null);
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowDeactivated(WindowEvent we) {
//                super.windowDeactivated(we); //To change body of generated methods, choose Tools | Templates.
//                System.exit(0);
//            }
//        });

        Font titleFont = new Font("Calibri", Font.PLAIN, 60);
        Font buttonFont = new Font("Calibri", Font.PLAIN, 20);

        JLabel SignUpLabel = new JLabel("SignUp");
        SignUpLabel.setBounds(0, 0, 500, 100);
        SignUpLabel.setFont(titleFont);
        add(SignUpLabel);

        JTextField tfName = new JTextField();
        tfName.setBounds(100, 130, 300, 40);
        add(tfName);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(100, 100, 100, 30);
        add(nameLabel);

        JTextField tfEmail = new JTextField();
        tfEmail.setBounds(100, 220, 300, 40);
        add(tfEmail);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(100, 190, 100, 30);
        add(emailLabel);

        JTextField tfPassword = new JTextField();
        tfPassword.setBounds(100, 310, 300, 40);
        add(tfPassword);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 280, 100, 30);
        add(passwordLabel);

        bSignUp = new JButton("SignUp");
        bSignUp.setBounds(130, 380, 100, 50);
        bSignUp.setFont(buttonFont);
        bSignUp.addActionListener((e) -> {
            dispose();
            new Login();
        });
        add(bSignUp);

        bLogin = new JButton("Login");
        bLogin.setBounds(250, 380, 100, 50);
        bLogin.setFont(buttonFont);
        bLogin.addActionListener((e) -> {
            dispose();
            new Login();
        });
        add(bLogin);
    }
}
