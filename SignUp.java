import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {

    Choice security;
    JButton create, back;
    JTextField inputname, inputusername, inputanswer;
    JPasswordField inputPassword;

    SignUp() {
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(146, 199, 207));
        p1.setBounds(0, 0, 450, 400);
        p1.setLayout(null);
        add(p1);

        JLabel username = new JLabel("Username");
        username.setFont(new Font("Tahoma", Font.BOLD, 14));
        username.setBounds(50, 20, 125, 25);
        p1.add(username);

        inputusername = new JTextField();
        inputusername.setBounds(190, 20, 180, 25);
        inputusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputusername);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setBounds(50, 60, 125, 25);
        p1.add(name);

        inputname = new JTextField();
        inputname.setBounds(190, 60, 180, 25);
        inputname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputname);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Tahoma", Font.BOLD, 14));
        password.setBounds(50, 100, 125, 25);
        p1.add(password);

        inputPassword = new JPasswordField();
        inputPassword.setBounds(190, 100, 180, 25);
        inputPassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputPassword);

        JLabel labelSecurity = new JLabel("Security Question");
        labelSecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelSecurity.setBounds(50, 140, 125, 25);
        p1.add(labelSecurity);

        security = new Choice();
        security.add("Your Fav Teacher");
        security.add("Your Fav Marvel Hero");
        security.add("Your Best friend Name");
        security.add("Your city Name");
        security.setBounds(190, 140, 180, 25);
        p1.add(security);

        JLabel answer = new JLabel("Answer");
        answer.setFont(new Font("Tahoma", Font.BOLD, 14));
        answer.setBounds(50, 180, 125, 25);
        p1.add(answer);

        inputanswer = new JTextField();
        inputanswer.setBounds(190, 180, 180, 25);
        inputanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputanswer);

        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133, 193, 233));
        create.setFont(new Font("Tahoma", Font.BOLD, 14));
        create.setBorder(BorderFactory.createEmptyBorder());
        create.setBounds(80, 250, 100, 30);
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133, 193, 233));
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(250, 250, 100, 30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550, 80, 250, 250);
        add(image);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String userName = inputusername.getText();
            String name = inputname.getText();
            String password = new String(inputPassword.getPassword()); // Get the password as a string
            String question = security.getSelectedItem();
            String answer = inputanswer.getText();

            String query = "insert into account values ('" + userName + "', '" + name + "', '" + password
                    + "', '" + question + "', '" + answer + "')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                setVisible(false);
                new Login();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
