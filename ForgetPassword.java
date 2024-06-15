import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener {

    JTextField inputusername, inputname, inputquestion, inputanswer, inputpassword;
    JButton search, retrive, back;

    ForgetPassword() {
        setBounds(350, 200, 850, 380);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 500, 280);
        // p1.setBackground(Color.white);
        add(p1);

        JLabel labelusername = new JLabel("Username");
        labelusername.setBounds(40, 20, 100, 25);
        labelusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(labelusername);

        inputusername = new JTextField();
        inputusername.setBounds(220, 20, 150, 25);
        inputusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputusername);

        search = new JButton("Search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(380, 20, 100, 25);
        search.addActionListener(this);
        p1.add(search);

        JLabel labelname = new JLabel("Name");
        labelname.setBounds(40, 60, 100, 28);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(labelname);

        inputname = new JTextField();
        inputname.setBounds(220, 60, 150, 28);
        inputname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputname);

        JLabel labelquestion = new JLabel("Security Queston");
        labelquestion.setBounds(40, 100, 150, 28);
        labelquestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(labelquestion);

        inputquestion = new JTextField();
        inputquestion.setBounds(220, 100, 150, 28);
        inputquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputquestion);

        JLabel labelanswer = new JLabel("Answer");
        labelanswer.setBounds(40, 140, 150, 28);
        labelanswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(labelanswer);

        inputanswer = new JTextField();
        inputanswer.setBounds(220, 140, 150, 28);
        inputanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputanswer);

        retrive = new JButton("Retrive");
        retrive.setBackground(Color.GRAY);
        retrive.setForeground(Color.WHITE);
        retrive.setBounds(380, 140, 100, 25);
        retrive.addActionListener(this);
        p1.add(retrive);

        JLabel labelpassword = new JLabel("Password");
        labelpassword.setBounds(40, 180, 150, 28);
        labelpassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(labelpassword);

        inputpassword = new JTextField();
        inputpassword.setBounds(220, 180, 150, 28);
        inputpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(inputpassword);

        back = new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setBounds(180, 220, 100, 25);
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == search) {
            try {
                String query = "select * from account where username = '" + inputusername.getText() + "'  ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()) {
                    inputname.setText(rs.getString("name"));
                    inputquestion.setText(rs.getString("security"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == retrive) {
            try {
                String query = "select * from account where answer = '" + inputanswer.getText() + "' AND username = '" + inputusername.getText() + "' ";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                while(rs.next()) {
                    inputpassword.setText(rs.getString("password"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new ForgetPassword();
    }
}
