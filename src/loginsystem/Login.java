package LoginSystem;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// jdbc:derby://localhost:1527/loginsystem
// root
// root

public class Login extends JFrame {

    public static void main(String[] args) {
        new DatabaseConnection();
        new Login();
    }
    

    public Login() {

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

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(0, 0, 500, 100);
        loginLabel.setFont(titleFont);
        add(loginLabel);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(100, 120, 100, 30);
        add(emailLabel);

        JTextField tf = new JTextField();
        tf.setBounds(100, 150, 300, 40);
        add(tf);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(100, 200, 100, 30);
        add(passwordLabel);

        JTextField tfPassword = new JTextField();
        tfPassword.setBounds(100, 230, 300, 40);
        add(tfPassword);

        bLogin = new JButton("Login");
        bLogin.setBounds(130, 300, 100, 50);
        bLogin.setFont(buttonFont);
        bLogin.addActionListener((e) -> {
            dispose();
            new Home();
        });
        add(bLogin);

        bSignUp = new JButton("SignUp");
        bSignUp.setBounds(250, 300, 100, 50);
        bSignUp.setFont(buttonFont);
        bSignUp.addActionListener((e) -> {
            dispose();
            new SignUp();
        });
        add(bSignUp);
    }

}
