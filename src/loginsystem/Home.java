package LoginSystem;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame {
//        public static void main(String[] args) {
//            new Home();
//        }
    public Home() {

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
        
        JLabel homeLabel = new JLabel("Home");
        homeLabel.setBounds(0, 0, 500, 100);
        homeLabel.setFont(titleFont);
        add(homeLabel);
        
        JButton bLogOut = new JButton("LogOut");
        bLogOut.setBounds(160, 200, 100, 50);
        bLogOut.setFont(buttonFont);
        bLogOut.addActionListener((e) -> {
            dispose();
            new Login();
        });
        add(bLogOut);
    }
}
