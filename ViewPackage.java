import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener{
    private static final int Image_SCALE_DEFAULT = 0;
    JButton back;
    // JLabel labelId;
    ViewPackage(String username) {
        setBounds(450, 200, 900, 455);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("VIEW PACKAGE DETAILS");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(60, 0, 300, 30);
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 50, 150, 25);
        add(lblusername);

        JLabel labelUsername = new JLabel();
        labelUsername.setBounds(220, 50, 150, 25);
        add(labelUsername);

        JLabel lblpackage = new JLabel("Package");
        lblpackage.setBounds(30, 90, 150, 25);
        add(lblpackage);

        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220, 90, 150, 25);
        add(labelpackage);

        JLabel lbperson = new JLabel("Total Persons");
        lbperson.setBounds(30, 130, 150, 25);
        add(lbperson);

        JLabel labelperson = new JLabel();
        labelperson.setBounds(220, 130, 150, 25);
        add(labelperson);

        JLabel lblId = new JLabel("Id");
        lblId.setBounds(30, 170, 150, 25);
        add(lblId);

        JLabel labelId = new JLabel();
        labelId.setBounds(220, 170, 150, 25);
        add(labelId);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 210, 150, 25);
        add(lblnumber);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220, 210, 150, 25);
        add(labelnumber);

        JLabel lblphone = new JLabel("phone");
        lblphone.setBounds(30, 250, 150, 25);
        add(lblphone);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 250, 150, 25);
        add(labelphone);

        JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(30, 110, 110, 25);
        add(lblprice);

        JLabel labelprice = new JLabel();
        labelprice.setBounds(220, 290, 150, 25);
        add(labelprice);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130, 360, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400, Image_SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450, 20, 500, 400);
        add(image);

        try{
            Conn conn  =new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()) {
                labelUsername.setText(rs.getString("username"));
                labelId.setText(rs.getString("id"));
                labelprice.setText(rs.getString("price"));
                labelnumber.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
                labelperson.setText(rs.getString("persons"));
                labelpackage.setText(rs.getString("package"));
                }
        } catch(Exception e) {

        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    public static void main(String[] args) {
        new ViewPackage("");
    }
}