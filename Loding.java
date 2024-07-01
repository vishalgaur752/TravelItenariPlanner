import javax.swing.*;
import java.awt.*;
// import java.awt.event.*;

public class Loding extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    String username;
    public void run() {
        try{
            for(int i = 1; i<=101; i++) {
                int max = bar.getMaximum();
                int value = bar.getValue();

                if(value < max) {
                    bar.setValue(bar.getValue() + 1);
                } else {
                    setVisible(false);
                    new Dasboard(username);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {

        }
    }

    Loding(String username) {
        this.username = username;
        t = new Thread(this);
        setBounds(500, 200, 650, 400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(50, 20, 600, 40);
        text.setForeground(Color.BLUE);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);
        
        bar = new JProgressBar();
        bar.setBounds(150, 100, 300, 35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading please wait...");
        loading.setBounds(230, 140, 150, 30);
        loading.setForeground(Color.RED);
        loading.setFont(new Font("Raleway", Font.BOLD, 16));
        add(loading);

        JLabel labelusername = new JLabel("Welcome " + username);
        labelusername.setBounds(20, 300, 400, 30);
        labelusername.setForeground(Color.red);
        labelusername.setFont(new Font("Raleway", Font.BOLD, 16));
        add(labelusername);

        t.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new Loding("");
    }
}
