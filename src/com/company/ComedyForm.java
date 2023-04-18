package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class ComedyForm extends JDialog{
    private JTextField title;
    private JTextField duration;
    private JTextField director;
    private JTextField jokeAmount;
    private JButton backButton;
    private JButton createButton;
    private JPanel ComedyPanel;

    public ComedyForm(JFrame parent){
        super(parent);
        setContentPane(ComedyPanel);
        setLocationRelativeTo(null);
        setSize(300, 250);
        setVisible(true);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartForm(null);
                dispose();
                setVisible(false);
            }
        });
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter("output.txt", true);
                    Comedy comedy = new Comedy(title.getText(), Integer.parseInt(duration.getText()), director.getText(), Integer.parseInt(jokeAmount.getText()));
                    fw.write(comedy.printInfo());
                    fw.close();
                    new DoneForm(null);
                    setVisible(false);
                    dispose();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        new ComedyForm(null);
    }

}
