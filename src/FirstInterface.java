//The following file contains code to start the system. Concept of multithreading is used.
//The first frame opens for 7 seconds after that the login frame opens
//The system only works when mysql server is running on the background


import java.awt.*;
import javax.swing.*;

public class FirstInterface {
    public static void main(String[] args) {
        SecondFrame r = new SecondFrame();
        int i;
        int x = 1;
        for (i = 2; i <= 600; i += 4, x += 1) {
            r.setLocation((700 - ((i + x) / 2)), 360 - (i / 2));
            r.setSize(i + 3 * x, i + x / 2);
            r.setVisible(true);
            try {
                Thread.sleep(10);//determines the speed of opening the frame
            } catch (Exception e) {
            System.out.println(e);
            }
        }
    }
}

class SecondFrame extends JFrame implements Runnable {   //multithreading
    Thread t1; //thread object
    SecondFrame() {
        super("Easy Course Management System"); //sets the title of the frame
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/University.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);

        JLabel m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start(); //starts the thread    //Start method calls the run method
    }

    public void run() {
        try {
            //opens the FirstInterface frame for 7 seconds and then closes it and then opens login frame
            Thread.sleep(7000);
            this.setVisible(false);
            new Login();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}