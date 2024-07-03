import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dasboard extends JFrame implements ActionListener{

    String username;
    JButton addPersonalDetails, viewPersonalDetails, updatePersonalDetails, checkPackage;

    Dasboard(String username) {
        this.username = username;
        // setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1600, 55);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon =  new JLabel(i3);
        icon.setBounds(5, 0, 60, 60);
        p1.add(icon);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 55, 300, 900);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Deatils");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.setMargin(new Insets(0, 0, 0, 60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Deatils");
        updatePersonalDetails.setBounds(0, 49, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.setMargin(new Insets(0, 0, 0, 30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Deatils");
        viewPersonalDetails.setBounds(0, 98, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.setMargin(new Insets(0, 0, 0, 130));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        JButton deletePersonalDetails = new JButton("Delete Personal Deatils");
        deletePersonalDetails.setBounds(0, 147, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.setMargin(new Insets(0, 0, 0, 38));
        p2.add(deletePersonalDetails);

        checkPackage = new JButton("Check Package");
        checkPackage.setBounds(0, 196, 300, 50);
        checkPackage.setBackground(new Color(0, 0, 102));
        checkPackage.setForeground(Color.WHITE);
        checkPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackage.setMargin(new Insets(0, 0, 0, 110));
        checkPackage.addActionListener(this);
        p2.add(checkPackage);
        
        JButton bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0, 245, 300, 50);
        bookPackage.setBackground(new Color(0, 0, 102));
        bookPackage.setForeground(Color.WHITE);
        bookPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(bookPackage);

        JButton viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 294, 300, 50);
        viewPackage.setBackground(new Color(0, 0, 102));
        viewPackage.setForeground(Color.WHITE);
        viewPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPackage.setMargin(new Insets(0, 0, 0, 120));
        p2.add(viewPackage);

        JButton viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 343, 300, 50);
        viewHotels.setBackground(new Color(0, 0, 102));
        viewHotels.setForeground(Color.WHITE);
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewHotels.setMargin(new Insets(0, 0, 0, 137));
        p2.add(viewHotels);

        JButton bookHotels = new JButton("Book Hotel");
        bookHotels.setBounds(0, 392, 300, 50);
        bookHotels.setBackground(new Color(0, 0, 102));
        bookHotels.setForeground(Color.WHITE);
        bookHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotels.setMargin(new Insets(0, 0, 0, 144));
        p2.add(bookHotels);

        JButton viewBookedHotel = new JButton("View Booked Hotels");
        viewBookedHotel.setBounds(0, 441, 300, 50);
        viewBookedHotel.setBackground(new Color(0, 0, 102));
        viewBookedHotel.setForeground(Color.WHITE);
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotel.setMargin(new Insets(0, 0, 0, 70));
        p2.add(viewBookedHotel);

        JButton destination = new JButton("Destinations");
        destination.setBounds(0, 490, 300, 50);
        destination.setBackground(new Color(0, 0, 102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destination.setMargin(new Insets(0, 0, 0, 140));
        p2.add(destination);

        JButton payments = new JButton("Payments");
        payments.setBounds(0, 539, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 160));
        p2.add(payments);

        JButton calculators = new JButton("Calculator");
        calculators.setBounds(0, 588, 300, 50);
        calculators.setBackground(new Color(0, 0, 102));
        calculators.setForeground(Color.WHITE);
        calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculators.setMargin(new Insets(0, 0, 0, 160));
        p2.add(calculators);

        JButton notePad = new JButton("Notepad");
        notePad.setBounds(0, 637, 300, 50);
        notePad.setBackground(new Color(0, 0, 102));
        notePad.setForeground(Color.WHITE);
        notePad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notePad.setMargin(new Insets(0, 0, 0, 170));
        p2.add(notePad);

        JButton about = new JButton("About");
        about.setBounds(0, 686, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 180));
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);

        JLabel text = new JLabel("Travel and  Tourism Managment System");
        text.setBounds(400, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image.add(text);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        } else if(ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        } else if(ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        } else if(ae.getSource() == checkPackage) {
            new CheckPackage();
        }
    }

    public static void main(String[] args) {
       new Dasboard("");
    }
}
