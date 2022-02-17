// The following is the main file of the project
// This file contains code for the main interface of the project in which other smaller components of the programs are  linked
// mysql server should be ran on the background while the whole project is being viewed

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class A_MainInterface extends JFrame implements ActionListener {
    A_MainInterface() {
        super("Easy Course Management System");

        ImageIcon ry = new ImageIcon(ClassLoader.getSystemResource("icons/Universs.jpg"));
        Image er = ry.getImage().getScaledInstance(1780, 850, Image.SCALE_DEFAULT);
        ImageIcon w = new ImageIcon(er);
        JLabel q = new JLabel(w);
        add(q);

        JMenuBar mbs = new JMenuBar();

        JMenu master = new JMenu("Master");
        JMenuItem mt = new JMenuItem("Add Instructor");
        JMenuItem mv = new JMenuItem("Add New Student");
        master.setForeground(Color.BLUE); // changes the color of font

        mt.setFont(new Font("monospaced", Font.BOLD, 16));
        mt.setBackground(Color.white);

        mv.setFont(new Font("monospaced", Font.BOLD, 16));
        mv.setBackground(Color.white);

        mt.addActionListener(this);
        mv.addActionListener(this);

        JMenu Courses = new JMenu("Courses");
        JMenuItem mt1 = new JMenuItem("Add Courses");
        JMenuItem mt56 = new JMenuItem("Add Modules");
        Courses.setForeground(Color.BLUE);

        mt1.setFont(new Font("monospaced", Font.BOLD, 16));
        mt1.setBackground(Color.white);
        mt56.setFont(new Font("monospaced", Font.BOLD, 16));
        mt56.setBackground(Color.white);

        mt1.addActionListener(this);
        mt56.addActionListener(this);

        JMenu Details = new JMenu("Details");
        JMenuItem mt11 = new JMenuItem("Student Details");
        JMenuItem mt24 = new JMenuItem("Instructor Details");
        JMenuItem mt35 = new JMenuItem("Course Details");
        JMenuItem mt67 = new JMenuItem("Module Details");
        Details.setForeground(Color.BLUE);

        mt11.setFont(new Font("monospaced", Font.BOLD, 16));
        mt11.setBackground(Color.white);
        mt24.setFont(new Font("monospaced", Font.BOLD, 16));
        mt24.setBackground(Color.white);
        mt35.setFont(new Font("monospaced", Font.BOLD, 16));
        mt35.setBackground(Color.white);
        mt67.setFont(new Font("monospaced", Font.BOLD, 16));
        mt67.setBackground(Color.white);

        mt11.addActionListener(this);
        mt24.addActionListener(this);
        mt35.addActionListener(this);
        mt67.addActionListener(this);

        JMenu Examination = new JMenu("Examination");
        JMenuItem mt2 = new JMenuItem("Enter Marks");
        Examination.setForeground(Color.BLUE);

        mt2.setFont(new Font("monospaced", Font.BOLD, 16));
        mt2.setBackground(Color.white);

        mt2.addActionListener(this);

        JMenu Results = new JMenu("Results");
        JMenuItem mt3 = new JMenuItem("Examination Details");
        Results.setForeground(Color.BLUE);

        mt3.setFont(new Font("monospaced", Font.BOLD, 16));
        mt3.setBackground(Color.white);

        mt3.addActionListener(this);

        JMenu Exit = new JMenu("Exit");
        JMenuItem mt4 = new JMenuItem("Exit");
        Exit.setForeground(Color.BLUE);

        mt4.setFont(new Font("monospaced", Font.BOLD, 16));
        mt4.setBackground(Color.white);
        mt4.addActionListener(this);

        master.add(mt);
        master.add(mv);
        Courses.add(mt1);
        Courses.add(mt56);
        Details.add(mt11);
        Details.add(mt24);
        Details.add(mt35);
        Details.add(mt67);
        Examination.add(mt2);
        Results.add(mt3);
        Exit.add(mt4);

        // adding all the menus in menubar
        mbs.add(master);
        mbs.add(Courses);
        mbs.add(Details);
        mbs.add(Examination);
        mbs.add(Results);
        mbs.add(Exit);

        // adding the menubar in frame
        setJMenuBar(mbs);

        // font,layout and visibility of the frame is modified
        setFont(new Font("senserif", Font.BOLD, 30));
        setLayout(new FlowLayout());
        setSize(1700, 850);
        setVisible(true);

    }

    // The method below is created for opening the correct frame
    // for the button on the menu items which have been pressed

    public void actionPerformed(ActionEvent et) {
        String text = et.getActionCommand();

        if (text.equals("Add Instructor")) {
            new AddInstructor().t.setVisible(true);
        }

        else if (text.equals("Add New Student")) {
            new AddStudent().t.setVisible(true);
        }

        if (text.equals("Enter Marks")) {
            new AddMarks().setVisible(true);
        }

        else if (text.equals("Add Courses")) {
            new AddCourses().t.setVisible(true);
        }

        else if (text.equals("Add Modules")) {
            new AddModules().t.setVisible(true);
        }

        else if (text.equals("Student Details")) {
            new StudentDetails().setVisible(true);
        }

        else if (text.equals("Instructor Details")) {
            new InstructorDetails().setVisible(true);
        }

        else if (text.equals("Course Details")) {
            new CourseDetails().setVisible(true);
        }

        else if (text.equals("Examination Details")) {
            new ExamDetails().setVisible(true);
        }

        else if (text.equals("Exit")) {
            System.exit(0);
        }

        else if (text.equals("Module Details")) {
            new ModuleDetails().setVisible(true);
        }

    }

    // public static void main(String[] args) {
    //     new A_MainInterface();

    // }

}
