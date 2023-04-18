package com.company;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class AdventureForm extends JDialog{
    private JTextField title;
    private JTextField director;
    private JTextField duration;
    private JTextField location;
    private JButton backButton;
    private JButton createButton;
    private JPanel AdventurePanel;

    public AdventureForm(JFrame parent){
        super(parent);
        setContentPane(AdventurePanel);
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
                    Adventure adventure = new Adventure(title.getText(), Integer.parseInt(duration.getText()), director.getText(), location.getText());
                    fw.write(adventure.printInfo());
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
        new AdventureForm(null);
    }
}
