import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {

    JButton create, back;
    JTextField inputName, inputUsername, inputPassword, inputanswer;
    Choice security;

    SignUp() {
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(146, 199, 207));
        p1.setBounds(0, 0, 450, 400);
        p1.setLayout(null);
        add(p1);

        JLabel userName = new JLabel("Username");
        userName.setFont(new Font("Tahoma", Font.BOLD, 14));
        userName.setBounds(50, 20, 125, 25);
        p1.add(userName);

        inputUsername = new JTextField();
        inputUsername.setBounds(190, 20, 180, 25);
        inputUsername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputUsername);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setBounds(50, 60, 125, 25);
        p1.add(name);

        inputName = new JTextField();
        inputName.setBounds(190, 60, 180, 25);
        inputName.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputName);

        JLabel password = new JLabel("Password");
        password.setFont(new Font("Tahoma", Font.BOLD, 14));
        password.setBounds(50, 100, 125, 25);
        p1.add(password);

        inputPassword = new JTextField();
        inputPassword.setBounds(190, 100, 180, 25);
        inputPassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputPassword);

        JLabel labelSecurity = new JLabel("Security Question");
        labelSecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelSecurity.setBounds(50, 140, 125, 25);
        p1.add(labelSecurity);

        Choice security = new Choice();
        security.add("Your Fav Teacher");
        security.add("Your Fav Marvel Hero");
        security.add("Your Best friend Name");
        security.add("Your city Name");
        security.setBounds(190, 140, 180, 25);
        // security.setBorder(BorderFactory.createEmptyBorder());
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
            String userName = inputUsername.getText();
            String name = inputName.getText();
            String password = inputPassword.getText();
            String question = security.getSelectedItem();
            String answer = inputanswer.getText();
            
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
