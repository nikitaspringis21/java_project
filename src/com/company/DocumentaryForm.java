package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class DocumentaryForm extends JDialog{
    private JTextField title;
    private JTextField theme;
    private JTextField director;
    private JTextField duration;
    private JTextField factAmount;
    private JTextField eventDate;
    private JButton backButton;
    private JButton createButton;
    private JPanel DocumentaryPanel;

    public DocumentaryForm(JFrame parent){
        super(parent);
        setContentPane(DocumentaryPanel);
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
                    Documentary documentary = new Documentary(title.getText(), Integer.parseInt(duration.getText()), director.getText(), theme.getText(), Integer.parseInt(factAmount.getText()), eventDate.getText());
                    fw.write(documentary.printInfo());
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
        new DocumentaryForm(null);
    }
}
