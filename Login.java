import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class Login extends JFrame implements ActionListener {
    JButton login, signup, forgetpassword;
    JTextField inputpassword, inputusername;

    Login() {
        setSize(900, 350);
        setLocation(320, 200);
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(146, 199, 207));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 100, 200, 200);
        p1.add(image);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 260);
        add(p2);

        JLabel username = new JLabel("Username");
        username.setBounds(60, 10, 100, 25);
        username.setFont(new Font("SAN SARIF", Font.PLAIN, 20));
        p2.add(username);

        inputusername = new JTextField();
        inputusername.setBounds(60, 40, 300, 30);
        inputusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(inputusername);

        JLabel password = new JLabel("Password");
        password.setBounds(60, 90, 100, 25);
        password.setFont(new Font("SAN SARIF", Font.PLAIN, 20));
        p2.add(password);

        inputpassword = new JTextField();
        inputpassword.setBounds(60, 120, 300, 30);
        inputpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(inputpassword);

        login = new JButton("Login");
        login.setBounds(60, 165, 120, 30);
        login.setBackground(new Color(100, 190, 220));
        login.setBorder(new LineBorder(new Color(133, 193, 233)));
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        p2.add(login);

        signup = new JButton("Sign Up");
        signup.setBounds(240, 165, 120, 30);
        signup.setBackground(new Color(100, 190, 220));
        signup.setBorder(new LineBorder(new Color(133, 193, 233)));
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        p2.add(signup);

        forgetpassword = new JButton("Forget Password");
        forgetpassword.setBounds(145, 210, 130, 30);
        forgetpassword.setBackground(new Color(100, 190, 220));
        forgetpassword.setBorder(new LineBorder(new Color(133, 193, 233)));
        forgetpassword.setForeground(Color.WHITE);
        forgetpassword.addActionListener(this);
        p2.add(forgetpassword);

        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300, 215, 150, 20);
        text.setForeground(Color.RED);
        p2.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            try {
                String username = inputusername.getText();
                String pass = inputpassword.getText();

                String query = "select * from account where username = '" + username + "' AND password = '" + pass
                        + "' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Loding(username);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == signup) {
            setVisible(false);
            new SignUp();
        } else {
            new ForgetPassword();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
